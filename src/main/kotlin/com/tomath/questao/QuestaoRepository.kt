package com.tomath.questao

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestaoRepository : CrudRepository<Questao?, Long?>