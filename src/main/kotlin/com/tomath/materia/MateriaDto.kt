package com.tomath.materia

import java.io.Serializable

data class MateriaDto(val descricao: String) : Serializable

fun Materia.toMateriaDto() = MateriaDto(
    descricao
)