package com.tomath.questao;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestaoService {
    final QuestaoRepository questaoRepository;

    public QuestaoService(QuestaoRepository questaoRepository) {
        this.questaoRepository = questaoRepository;
    }

    public List<Questao> listarQuestoes() {
        return questaoRepository.findAll();
    }

    public Long salvarQuestao(Questao questao) {
        return questaoRepository.save(questao).getId();
    }
}
