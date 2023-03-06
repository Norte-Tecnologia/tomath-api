package com.tomath.usuario

import org.springframework.stereotype.Service

@Service
class UsuarioService (private val usuarioRepository: UsuarioRepository) {
    fun listarUsuarios(): MutableIterable<Usuario> {
        return usuarioRepository.findAll()
    }

    fun salvarUsuario(usuario: Usuario): Long {
        return usuarioRepository.save(usuario).usuarioId!!
    }
}