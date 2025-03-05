package com.equipos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        EquipoService service = new EquipoService();

        while (true) {
           System.out.println("Gestion de equipos y jugadores de futbol");
           System.out.println("1. Agregar equipo");
           System.out.println("2. Listar equipo");
           System.out.println("3. Actualizar equipo");
           System.out.println("4. Eliminar equipo");
           System.out.println("5. Salir");
           System.out.println("Selecciona la opcion");

           int opcion = teclado.nextInt();
           teclado.nextLine();

         switch (opcion) {
            case 1:
                System.out.println("Nombre del equipo: ");
                String nombre = teclado.nextLine();
                System.out.println("ciudad que representa: ");
                String ciudad = teclado.nextLine();
                System.out.println("Fecha de fundacion: ");
                String fecha_de_fundacion = teclado.nextLine();
                System.out.println("Presidente del equipo");
                String presidente = teclado.nextLine();
               
                ArrayList<jugador> jugadores = new ArrayList<>();
                System.out.println("Cuantos jugadores desea agregar:");
                int numjugadores = teclado.nextInt();
                teclado.nextLine();

                break;
         }
        }


         

       
    
    
    }
}