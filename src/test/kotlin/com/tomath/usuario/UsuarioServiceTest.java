package com.tomath.usuario;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Testes referente ao pacote usuario")
class UsuarioServiceTest {
    UsuarioRepository usuarioRepository = mock(UsuarioRepository.class);
    @SuppressWarnings("unchecked")
    List<Usuario> usuarios = mock(List.class);
    Usuario usuario = mock(Usuario.class);

    @Test
    @DisplayName("Lista os usuarios cadastrados")
    void listarUsuariosTest() {
        when(usuarioRepository.findAll()).thenReturn(usuarios);
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);
        assertNotNull(usuarioService.listarUsuarios());
    }

    @Test
    @DisplayName("Salvar os usuario")
    void salvarUsuarioTest(){
        when(usuarioRepository.save(usuario)).thenReturn(usuario);
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);
        assertEquals(usuario.getUsuarioId(), usuarioService.salvarUsuario(usuario));
    }
}
