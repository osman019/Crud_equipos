package com.equipos;

public class Jugadores {
    private int numeroDorsal;
    private String nombre;
    private String ciudad;
    private int edad;

    public Jugadores(int numeroDorsal, String nombre, String ciudad, int edad) {
        this.numeroDorsal = numeroDorsal;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    // Getters y Setters
    public int getNumeroDorsal() { return numeroDorsal; }
    public void setNumeroDorsal(int numeroDorsal) { this.numeroDorsal = numeroDorsal; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return "Dorsal: " + numeroDorsal + ", Nombre: " + nombre + ", Ciudad: " + ciudad + ", Edad: " + edad;
    }
}
