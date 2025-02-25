/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        Cine objCine = new Cine("Cine Central", new Sala("S1", "IMAX", 100, "Avengers: Endgame"));

        int opcion;
        do {
            System.out.println("\n********** SISTEMA DE RESERVAS **********");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Ver estado de sala");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
            objTeclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el nombre: ");
                    String nombre = objTeclado.nextLine();
                    System.out.print("Digite el apellido: ");
                    String apellido = objTeclado.nextLine();
                    System.out.print("Digite la cédula: ");
                    String cedula = objTeclado.nextLine();
                    Usuario objUsuario = new Usuario(nombre, apellido, cedula);
                    System.out.println("\nUsuario registrado con éxito.");
                    objUsuario.imprimirDatos();
                    break;

                case 2:
                    System.out.print("Ingrese la cédula del usuario: ");
                    String id = objTeclado.nextLine();
                    Usuario usuarioReserva = new Usuario("Temp", "Temp", id);
                    objCine.realizarReserva(usuarioReserva);
                    break;

                case 3:
                    objCine.mostrarEstadoSala();
                    break;

                case 4:
                    System.out.println("¡Gracias por usar el sistema de reservas!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        objTeclado.close();
    }
}






