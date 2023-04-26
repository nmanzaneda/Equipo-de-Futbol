package com.ap.equipodefutbol.model;

public class Equipo {
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;
    
    public Equipo() {
        // Constructor vacío
    }
    
    public Equipo(String nombre, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    }
    
    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTitulares() {
        return titulares;
    }
    
    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }
    
    public int getSuplentes() {
        return suplentes;
    }
    
    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }
    
    public String getDirectorTecnico() {
        return directorTecnico;
    }
    
    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }
    
    public int getPuntos() {
        return puntos;
    }
    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public int getPartidosJugados() {
        return partidosJugados;
    }
    
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}
