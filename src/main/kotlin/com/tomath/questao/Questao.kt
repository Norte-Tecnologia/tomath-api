package com.tomath.questao

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.Hibernate

@Entity
data class Questao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var questaoId: Long? = null,
    var materia: String? = null,
    var comando: String? = null,
    var resposta: String? = null
    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Questao

        return questaoId != null && questaoId == other.questaoId
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(questaoId = $questaoId , materia = $materia , comando = $comando , resposta = $resposta )"
    }
}