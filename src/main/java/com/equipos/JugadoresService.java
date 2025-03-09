package com.equipos;

import java.util.ArrayList;
import java.util.Scanner;

public class JugadoresService {
    private ArrayList<Jugadores> jugadores = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // CREATE
    public void agregarJugador() {
        System.out.print("Número de dorsal: ");
        int dorsal = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        jugadores.add(new Jugadores(dorsal, nombre, ciudad, edad));
        System.out.println("Jugador agregado exitosamente.");
    }

    // READ
    public void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            for (Jugadores j : jugadores) {
                System.out.println(j);
            }
        }
    }

    // UPDATE
    public void actualizarJugador() {
        System.out.print("Número de dorsal del jugador a actualizar: ");
        int dorsal = scanner.nextInt();
        scanner.nextLine();

        Jugadores jugador = buscarJugador(dorsal);
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

        Jugadores jugador = buscarJugador(dorsal);
        if (jugador != null) {
            jugadores.remove(jugador);
            System.out.println("Jugador eliminado exitosamente.");
        } else {
            System.out.println("Jugador no encontrado.");
        }
    }

    // Buscar jugador por dorsal
    private Jugadores buscarJugador(int dorsal) {
        for (Jugadores j : jugadores) {
            if (j.getNumeroDorsal() == dorsal) {
                return j;
            }
        }
        return null;
    }
}
