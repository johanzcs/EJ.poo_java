/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("Ingrese el nombre del usuario: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la edad del usuario: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Ingrese el correo del usuario: ");
            String correo = scanner.nextLine();


            Usuario usuario = new Usuario(nombre, edad, correo);

            Sala sala = new Sala(10);

            do {
                System.out.println("*****************************");
                System.out.println("Sistema de Reservas de Asientos");
                System.out.println("1. Realizar reserva");
                System.out.println("2. Hacer otro ejercicio");
                System.out.println("3. Salir");
                System.out.println("*****************************");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        usuario.mostrarInformacion();

                        sala.realizarReserva();
                        break;
                    case 2:

                        System.out.println("Realizando otro ejercicio...");
                        break;
                    case 3:

                        System.out.println("¡Gracias por usar el sistema! Hasta luego.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } while (opcion != 3 && opcion != 2); 

        } while (opcion != 3); 
    }
}

