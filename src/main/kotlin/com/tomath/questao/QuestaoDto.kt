package com.tomath.questao

import java.io.Serializable

data class QuestaoDto(
    val materia: String
) : Serializable

fun Questao.toQuestaoDto() = QuestaoDto(
    materia
)