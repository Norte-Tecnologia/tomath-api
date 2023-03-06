package com.tomath.usuario

import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/usuario")
class UsuarioController(val usuarioService: UsuarioService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(
        summary = "Listar Usuarios cadastrados no banco de dados",
        description = "Retorna 200 se tudo ocorrer com sucesso")
    fun listaUsuarios(): MutableIterable<Usuario> {
        return usuarioService.listarUsuarios()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Salvar usuarios no banco de dados")
    fun salvarUsuario(@RequestBody usuario: Usuario): Long {
        return usuarioService.salvarUsuario(usuario)
    }
}