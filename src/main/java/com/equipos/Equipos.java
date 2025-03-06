package com.equiposfutbol;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String ciudad;
    private String fechaFundacion;
    private String presidente;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String ciudad, String fechaFundacion, String presidente) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaFundacion = fechaFundacion;
        this.presidente = presidente;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "Nombre='" + nombre + '\'' +
                ", Ciudad='" + ciudad + '\'' +
                ", Fundación='" + fechaFundacion + '\'' +
                ", Presidente='" + presidente + '\'' +
                ", Jugadores=" + jugadores +
                '}';
    }
}
