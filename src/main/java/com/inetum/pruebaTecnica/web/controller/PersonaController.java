package com.inetum.pruebaTecnica.web.controller;

import com.inetum.pruebaTecnica.domain.service.PersonaService;
import com.inetum.pruebaTecnica.persistence.entity.Persona;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PersonaController")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("obtenerPersona")
    public Persona obtenerPersona(){
        return personaService.obtenerPersona();
    }
}
