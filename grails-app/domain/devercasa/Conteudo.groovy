package devercasa

import grails.rest.Resource


@Resource(uri='/conteudos', formats=['json'])
class Conteudo {

  String conteudo

  //static belongsTo = Pessoa


  static belongsTo = [ materia:Materia, pessoa: Pessoa]

  static hasMany = [pessoa  : Pessoa]

  static constraints = {
    conteudo nullable:false, blank:false, maxSize:128, unique:true
  }
}
