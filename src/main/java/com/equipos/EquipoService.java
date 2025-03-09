package com.equipos;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipoService {
    private ArrayList<Equipos> equipos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // CREATE - Agregar equipo
    public void agregarEquipo() {
        System.out.print("Nombre del equipo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ciudad que representa: ");
        String ciudad = scanner.nextLine();

        System.out.print("Fecha de fundación: ");
        String fechaFundacion = scanner.nextLine();

        System.out.print("Presidente del equipo: ");
        String presidente = scanner.nextLine();

        equipos.add(new Equipos(nombre, ciudad, fechaFundacion, presidente));
        System.out.println("Equipo agregado exitosamente.");
    }

    // READ - Mostrar equipos
    public void mostrarEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
        } else {
            for (Equipos e : equipos) {
                System.out.println(e);
            }
        }
    }

    // UPDATE - Actualizar equipo
    public void actualizarEquipo() {
        System.out.print("Nombre del equipo a actualizar: ");
        String nombre = scanner.nextLine();

        Equipos equipo = buscarEquipo(nombre);
        if (equipo != null) {
            System.out.print("Nuevo nombre: ");
            equipo.setNombre(scanner.nextLine());

            System.out.print("Nueva ciudad: ");
            equipo.setCiudad(scanner.nextLine());

            System.out.print("Nueva fecha de fundación: ");
            equipo.setFechaFundacion(scanner.nextLine());

            System.out.print("Nuevo presidente: ");
            equipo.setPresidente(scanner.nextLine());

            System.out.println("Equipo actualizado exitosamente.");
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    // DELETE - Eliminar equipo
    public void eliminarEquipo() {
        System.out.print("Nombre del equipo a eliminar: ");
        String nombre = scanner.nextLine();

        Equipos equipo = buscarEquipo(nombre);
        if (equipo != null) {
            equipos.remove(equipo);
            System.out.println("Equipo eliminado exitosamente.");
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    // Buscar equipo por nombre
    private Equipos buscarEquipo(String nombre) {
        for (Equipos e : equipos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}
