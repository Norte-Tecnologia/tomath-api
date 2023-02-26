package com.tomath.questao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questao")
public class QuestaoController {
    private final QuestaoService questaoService;

    public QuestaoController(QuestaoService questaoService) {
        this.questaoService = questaoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Questao> listarQuestoes(){
        return questaoService.listarQuestoes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long criarQuestao(@RequestBody Questao questao){
        return questaoService.salvarQuestao(questao);
    }
}
