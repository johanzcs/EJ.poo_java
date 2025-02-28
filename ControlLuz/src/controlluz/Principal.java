/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlluz;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorLuces sistema = new ControladorLuces("Sala");

        int opcion;
        do {
            System.out.println("===================================");
            System.out.println("      CONTROL DE LUCES AUTOMÁTICO");
            System.out.println("===================================");
            System.out.println("1. Configurar luces y verificar estado");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Es de noche? (true/false): ");
                    boolean esDeNoche = scanner.nextBoolean();
                    sistema.setEsDeNoche(esDeNoche);

                    System.out.print("¿Hay movimiento en la habitación? (true/false): ");
                    boolean hayMovimiento = scanner.nextBoolean();

                    sistema.configurarSensor(hayMovimiento);
                    sistema.verificarLuces();
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

