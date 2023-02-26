package com.tomath.materia

import jakarta.persistence.*

@Entity
@Table(name = "materias")
class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val materiaId: Long = 0L
    val descricao: String = ""
}