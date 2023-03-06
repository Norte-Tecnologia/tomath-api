package com.tomath.usuario

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Usuario(
    val nome: String
){
    @Id
    @GeneratedValue
    val usuarioId: Long? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Usuario

        if (nome != other.nome) return false
        if (usuarioId != other.usuarioId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + (usuarioId?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Usuario(nome='$nome', usuarioId=$usuarioId)"
    }

}