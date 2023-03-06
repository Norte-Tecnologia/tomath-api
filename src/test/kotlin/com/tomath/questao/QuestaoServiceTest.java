package com.tomath.questao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class QuestaoServiceTest {
    QuestaoRepository questaoRepository = mock(QuestaoRepository.class);
    @SuppressWarnings("unchecked")
    List<Questao> questaoList = mock(List.class);
    Questao questao = mock(Questao.class);

    @Test
    @DisplayName("Teste unitario da lista das questoes")
    void listarQuestoesTest() {
        when(questaoRepository.findAll()).thenReturn(questaoList);
        QuestaoService questaoService = new QuestaoService(questaoRepository);
        assertNotNull(questaoService.listarQuestoes());
    }

    @Test
    @DisplayName("Persistir questoes")
    void salvarQuestaoTest(){
        when(questaoRepository.save(questao)).thenReturn(questao);
        assertEquals(questao.getId(), new QuestaoService(questaoRepository).salvarQuestao(questao));
    }

}
