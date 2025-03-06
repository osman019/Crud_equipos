package com.equiposfutbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JugadorService jugadorService = new JugadorService();

        int opcion;
        do {
            System.out.println("\n--- Menú CRUD Jugadores ---");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Mostrar jugadores");
            System.out.println("3. Actualizar jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> jugadorService.agregarJugador();
                case 2 -> jugadorService.mostrarJugadores();
                case 3 -> jugadorService.actualizarJugador();
                case 4 -> jugadorService.eliminarJugador();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
