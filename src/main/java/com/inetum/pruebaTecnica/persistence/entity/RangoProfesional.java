package com.inetum.pruebaTecnica.persistence.entity;

public class RangoProfesional {
    private int aniosDeExperiencia;
    private String nivel;

    public RangoProfesional(int aniosDeExperiencia, String nivel) {
        this.aniosDeExperiencia = aniosDeExperiencia;
        this.nivel = nivel;
    }

    public int getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setAniosDeExperiencia(int aniosDeExperiencia) {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
