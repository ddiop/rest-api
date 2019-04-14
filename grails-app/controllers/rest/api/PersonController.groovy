package rest.api


import grails.rest.*
import grails.converters.*
import io.swagger.annotations.Api


class PersonController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PersonController() {
        super(Person)
    }
}
