/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detecicionintrusos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaSeguridad sistema = new SistemaSeguridad();

        int opcion;
        do {
            System.out.println("===================================");
            System.out.println("      SISTEMA DE SEGURIDAD");
            System.out.println("===================================");
            System.out.println("1. Configurar sensores y verificar seguridad");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Es de noche? (true/false): ");
                    boolean esDeNoche = scanner.nextBoolean();
                    sistema.setEsDeNoche(esDeNoche);
                    
                    System.out.print("¿Sensor 1 detecta movimiento? (true/false): ");
                    boolean s1 = scanner.nextBoolean();
                    System.out.print("¿Sensor 2 detecta movimiento? (true/false): ");
                    boolean s2 = scanner.nextBoolean();
                    System.out.print("¿Sensor 3 detecta movimiento? (true/false): ");
                    boolean s3 = scanner.nextBoolean();
                    
                    sistema.configurarSensores(s1, s2, s3);
                    sistema.verificarSeguridad();
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

