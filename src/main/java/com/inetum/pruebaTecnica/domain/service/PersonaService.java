package com.inetum.pruebaTecnica.domain.service;

import com.inetum.pruebaTecnica.domain.repository.PersonaRepository;
import com.inetum.pruebaTecnica.persistence.entity.Persona;
import com.inetum.pruebaTecnica.persistence.entity.RangoProfesional;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private Persona personaUno;
    public Persona obtenerPersona(){
        String lenguajes[] = {"PHP","JavaScript","Dart"};
        RangoProfesional rangoProfesional = new RangoProfesional(12,"Junior");
        personaUno = new Persona("Jonh Doe","Programador",lenguajes,true,rangoProfesional);
        return personaUno;
    }
}
