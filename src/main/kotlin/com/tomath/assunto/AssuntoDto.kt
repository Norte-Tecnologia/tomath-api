package com.tomath.assunto

import com.tomath.materia.MateriaDto


/**
 * A DTO for the [Assunto] entity
 */
data class AssuntoDto(
    var nome: String = "",
    var materia: MateriaDto = MateriaDto()
)