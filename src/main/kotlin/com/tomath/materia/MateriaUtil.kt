package com.tomath.materia


fun Materia.toMateriaDto() = MateriaDto(
    nome
)

fun MateriaDto.toMateria() = Materia(
    nome
)