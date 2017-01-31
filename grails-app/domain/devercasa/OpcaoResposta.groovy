package devercasa

class OpcaoResposta {

    Boolean respostaCorreta

    String opcaoResposta

    static belongsTo = [ questao:Questao]

    static constraints = {
    }
}
