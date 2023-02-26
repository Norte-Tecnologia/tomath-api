package com.tomath.questao

import java.io.Serializable

data class QuestaoDto(
    val materia: String? = null,
    val comando: String? = null,
    val resposta: String? = null
) : Serializable