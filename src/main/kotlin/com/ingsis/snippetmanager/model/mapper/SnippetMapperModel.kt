package com.ingsis.snippetmanager.model.mapper

import com.ingsis.snippetmanager.model.bo.SnippetBO
import com.ingsis.snippetmanager.model.de.SnippetDE

class SnippetMapperModel {

    fun convertSnippetBOToDE(snippetBO: SnippetBO): SnippetDE {
        return SnippetDE(0,snippetBO.getName(), snippetBO.getType(), snippetBO.getContent())
    }

    fun convertSnippetDEToBO(snippetDE: SnippetDE): SnippetBO {
        return SnippetBO(snippetDE.getName(), snippetDE.getType(), snippetDE.getContent())
    }

}