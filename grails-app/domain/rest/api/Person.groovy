package rest.api

class Person {
    String name
    Integer age

    static constraints = {
        age nullable: true
    }

}
