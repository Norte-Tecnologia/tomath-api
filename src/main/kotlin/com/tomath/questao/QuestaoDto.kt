package com.tomath.questao

import java.io.Serializable

data class QuestaoDto(
    val materia: String,
    val comando: String,
    val resposta: String
) : Serializable