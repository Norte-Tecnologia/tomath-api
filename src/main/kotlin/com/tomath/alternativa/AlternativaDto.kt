package com.tomath.alternativa

import com.tomath.questao.Questao
import com.tomath.questao.QuestaoDto
import com.tomath.questao.toQuestaoDto
import java.io.Serializable

data class AlternativaDto(
    val content: String = "",
    val questao: QuestaoDto = Questao().toQuestaoDto()
) : Serializable

fun Alternativa.toAlternativaDto() = AlternativaDto(
    content
)