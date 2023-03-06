package com.tomath.questao

import com.tomath.assunto.toAssunto
import com.tomath.assunto.toAssuntoDto
import com.tomath.dificuldade.toDificuldade
import com.tomath.dificuldade.toDificuldadeDto
import com.tomath.materia.toMateria
import com.tomath.materia.toMateriaDto

fun Questao.toQuestaoDto() = QuestaoDto(
    enunciado,
    linkDeApoio,
    respostaCorreta,
    materia = materia.toMateriaDto(),
    assunto = assunto.toAssuntoDto(),
    dificuldade = dificuldade.toDificuldadeDto()
)

fun QuestaoDto.toQuestao() = Questao(
    enunciado,
    linkDeApoio,
    respostaCorreta,
    materia = materia.toMateria(),
    assunto = assunto.toAssunto(),
    dificuldade = dificuldade.toDificuldade()
)
