package com.tomath.questao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestaoRepository : JpaRepository<Questao?, Long?>