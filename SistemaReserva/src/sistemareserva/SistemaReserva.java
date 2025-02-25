/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemareserva;

import java.util.Scanner;

public class SistemaReserva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Sala sala = new Sala(90); 

        do {
            System.out.println("\n******************************************");
            System.out.println("   Bienvenido al Sistema de Reservas   ");
            System.out.println("******************************************");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Ver historial de reservas");
            System.out.println("3. Salir");
            System.out.println("******************************************");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del usuario: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el correo del usuario: ");
                    String correo = scanner.nextLine();

                    Usuario usuario = new Usuario(nombre, edad, correo);
                    System.out.println("\nInformación del usuario:");
                    usuario.mostrarInformacion();
                    usuario.hacerReserva(sala); 

                    break;

                case 2:
                    sala.mostrarReservasRealizadas();
                    break;

                case 3:
                    System.out.println("¡Gracias por usar el sistema! Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close(); 
    }
}





