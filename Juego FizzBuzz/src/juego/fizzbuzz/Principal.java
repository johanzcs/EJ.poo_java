/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego.fizzbuzz;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\"MENÚ PRINCIPAL");
            System.out.println("1 RESOLVER FIZZbUZZ");
            System.out.println("2 Volver a intentar");
            System.out.println("3 Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                Ejecutor.ejecutarFizzBuzz(scanner);
            } else if (opcion == 2) {
                System.out.println(" Reiniciando...");
            } else if (opcion == 3) {
                System.out.println(" ¡Gracias por usar el programa!");
            } else {
                System.out.println(" Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}




