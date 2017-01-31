package devercasa

import grails.rest.Resource

@Resource(uri='/pessoas', formats=['json'])
class Pessoa {

    String nome
    
    /*static mapping = {
        tablePerHierarchy true
        discriminator column: "tipo", value:"pessoa"
    }*/

    static constraints = {
      pessoa nullable:false, blank:false, maxSize:128, unique:true
    }
}
