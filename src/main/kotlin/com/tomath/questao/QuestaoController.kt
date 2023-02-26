package com.tomath.questao

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/questao")
internal class QuestaoController(private val questaoService: QuestaoService) {

    @GetMapping
    fun listarQuestoes(): List<Questao> {
        return questaoService.listarQuestoes()
    }
}