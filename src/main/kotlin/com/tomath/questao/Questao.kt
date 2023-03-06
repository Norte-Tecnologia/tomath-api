package com.tomath.questao

import com.tomath.assunto.Assunto
import com.tomath.dificuldade.Dificuldade
import com.tomath.materia.Materia
import org.hibernate.Hibernate
import javax.persistence.*

@Entity
data class Questao (

    @Column(nullable = false, columnDefinition = "TEXT")
    val enunciado: String,

    @Column(nullable = false)
    val linkDeApoio: String,

    @Column(nullable = false)
    val respostaCorreta: String,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "materia_id", nullable = false)
    val materia: Materia,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "assunto_id", nullable = false)
    val assunto: Assunto,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "dificuldade_id", nullable = false)
    val dificuldade: Dificuldade,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Questao

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , enunciado = $enunciado , linkDeApoio = $linkDeApoio , respostaCorreta = $respostaCorreta )"
    }
}