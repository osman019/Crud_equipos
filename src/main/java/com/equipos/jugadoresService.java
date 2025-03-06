package com.equiposfutbol;

import java.util.ArrayList;
import java.util.Scanner;

public class JugadorService {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // CREATE
    public void agregarJugador() {
        System.out.print("Número de dorsal: ");
        int dorsal = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        jugadores.add(new Jugador(dorsal, nombre, ciudad, edad));
        System.out.println("Jugador agregado exitosamente.");
    }

    // READ
    public void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            for (Jugador j : jugadores) {
                System.out.println(j);
            }
        }
    }

    // UPDATE
    public void actualizarJugador() {
        System.out.print("Número de dorsal del jugador a actualizar: ");
        int dorsal = scanner.nextInt();
        scanner.nextLine();

        Jugador jugador = buscarJugador(dorsal);
        if (jugador != null) {
            System.out.print("Nuevo nombre: ");
            jugador.setNombre(scanner.nextLine());

            System.out.print("Nueva ciudad: ");
            jugador.setCiudad(scanner.nextLine());

            System.out.print("Nueva edad: ");
            jugador.setEdad(scanner.nextInt());

            System.out.println("Jugador actualizado exitosamente.");
        } else {
            System.out.println("Jugador no encontrado.");
        }
    }

    // DELETE
    public void eliminarJugador() {
        System.out.print("Número de dorsal del jugador a eliminar: ");
        int dorsal = scanner.nextInt();

        Jugador jugador = buscarJugador(dorsal);
        if (jugador != null) {
            jugadores.remove(jugador);
            System.out.println("Jugador eliminado exitosamente.");
        } else {
            System.out.println("Jugador no encontrado.");
        }
    }

    // Buscar jugador por dorsal
    private Jugador buscarJugador(int dorsal) {
        for (Jugador j : jugadores) {
            if (j.getNumeroDorsal() == dorsal) {
                return j;
            }
        }
        return null;
    }
}
