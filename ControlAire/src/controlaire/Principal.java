/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlaire;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorAire sistema = new ControladorAire();

        int opcion;
        do {
            System.out.println("===================================");
            System.out.println("     CONTROL DE AIRE ACONDICIONADO ");
            System.out.println("===================================");
            System.out.println("1. Configurar sensores y verificar estado");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la temperatura (°C): ");
                    double temperatura = scanner.nextDouble();
                    System.out.print("Ingrese la humedad (%): ");
                    double humedad = scanner.nextDouble();

                    sistema.configurarSensores(temperatura, humedad);
                    sistema.verificarSistema();
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println(" Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}

