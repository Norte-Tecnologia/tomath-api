package com.tomath.questao

import com.tomath.materia.Materia
import com.tomath.alternativa.Alternativa
import jakarta.persistence.*

@Entity
@Table(name = "questoes")
class Questao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val questaoId: Long = 0L,

    @Column(nullable = false)
    val titulo: String = "",

    @Column(nullable = false, columnDefinition = "TEXT")
    val descricao: String = "",

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", nullable = false)
    val materia: Materia = Materia(),

    @OneToMany(mappedBy = "questao", cascade = [CascadeType.ALL], orphanRemoval = true)
    val alternativas: MutableList<Alternativa> = mutableListOf(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "correct_option_id", nullable = false)
    val respostaCorreta: Alternativa = Alternativa()
)