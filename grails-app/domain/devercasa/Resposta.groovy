package devercasa

class Resposta {
    
    def resposta //pode ser string, numero lista, ou um registro especifico da resposta

    static belongsTo = [ questao:Questao, aluno:Pessoa]

    static constraints = {
    }
}
