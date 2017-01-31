package devercasa

import grails.rest.Resource

@Resource(uri='/api/materias', formats=['json'])
class Materia {

    String materia

    static hasMany = [ conteudo : Conteudo ]

    static constraints = {
      materia nullable:false, blank:false, maxSize:128, unique:true
    }
}
