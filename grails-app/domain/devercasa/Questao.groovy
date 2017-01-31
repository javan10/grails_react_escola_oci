package devercasa

import grails.rest.Resource

@Resource(uri='/questoes', formats=['json'])

class Questao {

    String questao
    
    //opcao resposta pode ser texto, numero, listaOpcoes
    def opcaoResposta 
    
    String tipoResposta 
    
    static belongsTo = [ conteudo:Conteudo]

    static constraints = {
    }

   
}
/*
 *     Enum TipoResposta{
    TEXTO{
        toString("Texto")
    }, MULTIPLA_ESCOLHA{
        toString("Multipla Escolha")
    }, UNICA_ESCOLHA{
        toString("Única Escolha")
    } 
}*/



