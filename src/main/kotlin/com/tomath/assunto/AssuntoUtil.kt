package com.tomath.assunto

import com.tomath.materia.toMateria
import com.tomath.materia.toMateriaDto

fun Assunto.toAssuntoDto() = AssuntoDto(
    nome, materia = materia.toMateriaDto()
)

fun AssuntoDto.toAssunto() = Assunto(
    nome, materia = materia.toMateria()
)