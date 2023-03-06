package com.tomath.questao

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.stream.Collectors

@RestController
@RequestMapping("v1/questao")
class QuestaoController(private val questaoService: QuestaoService) {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun listarQuestoes(): List<QuestaoDto> {
        return questaoService.listarQuestoes().stream()
            .map { it.toQuestaoDto() }
            .collect(Collectors.toList())
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun criarQuestao(@RequestBody questaoDto: QuestaoDto): Long {
        return questaoService.salvarQuestao(questaoDto.toQuestao())
    }
}