package rest.api

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
        "/apidoc/$action?/$id?"(controller: "apiDoc", action: "getDocuments")
        "/api/v1/city/$id"(controller: "city", action: "getCity", method: "GET")
        "/api/v1/city/list"(controller: "city", action: "getCityList", method: "GET")
        "/api/v1/city/createUpdate"(controller: "city", action: "createOrUpdateCity", method: "POST")
        "/api/v1/city/$id"(controller: "city", action: "deleteCity", method: "DELETE")
    }
}
