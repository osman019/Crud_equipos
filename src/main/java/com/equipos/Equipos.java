package com.equipos;

import java.util.ArrayList;

public class Equipos {
    private String nombre;
    private String ciudad;
    private String fechaFundacion;
    private String presidente;
    private ArrayList<Jugadores> jugadores;

    public Equipos(String nombre, String ciudad, String fechaFundacion, String presidente) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaFundacion = fechaFundacion;
        this.presidente = presidente;
        this.jugadores = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getFechaFundacion() { return fechaFundacion; }
    public void setFechaFundacion(String fechaFundacion) { this.fechaFundacion = fechaFundacion; }

    public String getPresidente() { return presidente; }
    public void setPresidente(String presidente) { this.presidente = presidente; }

    public ArrayList<Jugadores> getJugadores() { return jugadores; }
    public void agregarJugador(Jugadores jugador) { jugadores.add(jugador); }

    @Override
    public String toString() {
        return "Equipo: " + nombre + ", Ciudad: " + ciudad + ", Fundado: " + fechaFundacion + ", Presidente: " + presidente;
    }
}
