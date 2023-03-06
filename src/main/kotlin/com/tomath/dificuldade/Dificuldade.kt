package com.tomath.dificuldade

import org.hibernate.Hibernate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Dificuldade (
    val dificuldadeIndice: Int,
    val descricaoDificuldade: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val dificuldadeId: Long? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Dificuldade

        return dificuldadeId != null && dificuldadeId == other.dificuldadeId
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(dificuldadeId = $dificuldadeId , dificuldadeIndice = $dificuldadeIndice , descricaoDificuldade = $descricaoDificuldade )"
    }
}