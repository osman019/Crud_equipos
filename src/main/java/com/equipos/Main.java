package com.equipos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JugadoresService jugadoresService = new JugadoresService();
        EquipoService equipoService = new EquipoService();

        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. CRUD Jugadores");
            System.out.println("2. CRUD Equipos");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> menuJugadores(jugadoresService);
                case 2 -> menuEquipos(equipoService);
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    // Menú para CRUD de Jugadores
    private static void menuJugadores(JugadoresService jugadoresService) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú CRUD Jugadores ---");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Mostrar jugadores");
            System.out.println("3. Actualizar jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Volver");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> jugadoresService.agregarJugador();
                case 2 -> jugadoresService.mostrarJugadores();
                case 3 -> jugadoresService.actualizarJugador();
                case 4 -> jugadoresService.eliminarJugador();
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    // Menú para CRUD de Equipos
    private static void menuEquipos(EquipoService equipoService) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú CRUD Equipos ---");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Mostrar equipos");
            System.out.println("3. Actualizar equipo");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Volver");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> equipoService.agregarEquipo();
                case 2 -> equipoService.mostrarEquipos();
                case 3 -> equipoService.actualizarEquipo();
                case 4 -> equipoService.eliminarEquipo();
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
