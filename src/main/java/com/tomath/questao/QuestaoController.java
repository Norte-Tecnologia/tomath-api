package com.tomath.questao;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questao")
public class QuestaoController {
    private final QuestaoService questaoService;

    public QuestaoController(QuestaoService questaoService) {
        this.questaoService = questaoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<QuestaoDto> listarQuestoes() {
        return questaoService.listarQuestoes().stream()
                .map(questao -> new ModelMapper().map(questao, QuestaoDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long criarQuestao(@RequestBody QuestaoDto questaoDto) {
        return questaoService.salvarQuestao(new ModelMapper().map(questaoDto, Questao.class));
    }
}
