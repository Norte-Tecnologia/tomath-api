package com.tomath.cliente

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clientes")
class ClientesResource(private val clientes: ClienteRepositorio) {
    @GetMapping
    fun listar(): List<Cliente?> {
        return clientes.findAll()
    }
}