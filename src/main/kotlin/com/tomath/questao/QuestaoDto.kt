package com.tomath.questao

import java.io.Serializable

data class QuestaoDto(
    val titulo: String,
    val descricao: String
) : Serializable

fun Questao.toQuestaoDto() = QuestaoDto(
    titulo, descricao
)