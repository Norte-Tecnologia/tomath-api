package com.tomath.questao

import com.tomath.assunto.AssuntoDto
import com.tomath.dificuldade.DificuldadeDto
import com.tomath.materia.MateriaDto

/**
 * A DTO for the [Questao] entity
 */
data class QuestaoDto(
    var enunciado: String = "",
    var linkDeApoio: String = "",
    var respostaCorreta: String = "",
    var materia: MateriaDto = MateriaDto(),
    var assunto: AssuntoDto = AssuntoDto(),
    var dificuldade: DificuldadeDto = DificuldadeDto(),
)