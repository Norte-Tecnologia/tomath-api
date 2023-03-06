package com.tomath.questao

import org.springframework.stereotype.Service

@Service
class QuestaoService(val questaoRepository: QuestaoRepository) {
    fun listarQuestoes(): List<Questao> {
        return questaoRepository.findAll() as List<Questao>
    }

    fun salvarQuestao(questao: Questao): Long {
        return questaoRepository.save(questao).id!!
    }
}