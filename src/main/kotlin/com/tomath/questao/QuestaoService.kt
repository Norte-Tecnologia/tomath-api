package com.tomath.questao

import org.springframework.stereotype.Service

@Service
class QuestaoService(private val questaoRepository: QuestaoRepository) {
    fun listarQuestoes(): List<Questao?>{
        return questaoRepository.findAll()
    }
}