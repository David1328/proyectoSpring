package com.inetum.pruebaTecnica.persistence.entity;

import javax.persistence.Id;

public class Persona {
    @Id
    private String nombre;
    private String profesión;
    private String[] lenguajes;
    private boolean disponibilidadParaViajar;
    private RangoProfesional rangoProfesional;

    public Persona(){}
    public Persona(String nombre, String profesión, String[] lenguajes, boolean disponibilidadParaViajar, RangoProfesional rangoProfesional) {
        this.nombre = nombre;
        this.profesión = profesión;
        this.lenguajes = lenguajes;
        this.disponibilidadParaViajar = disponibilidadParaViajar;
        this.rangoProfesional = rangoProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    public boolean isDisponibilidadParaViajar() {
        return disponibilidadParaViajar;
    }

    public void setDisponibilidadParaViajar(boolean disponibilidadParaViajar) {
        this.disponibilidadParaViajar = disponibilidadParaViajar;
    }

    public RangoProfesional getRangoProfesional() {
        return rangoProfesional;
    }

    public void setRangoProfesional(RangoProfesional rangoProfesional) {
        this.rangoProfesional = rangoProfesional;
    }
}
