/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorTemperatura controlador = new ControladorTemperatura();

        int opcion;
        do {
            System.out.println("===================================");
            System.out.println(" BIENVENIDO AL CONTROL DE TEMPERATURA ");
            System.out.println("===================================");
            System.out.println("1. Ingresar temperatura");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la temperatura actual (°C): ");
                    int temperatura = scanner.nextInt();
                    controlador.monitorearTemperatura(temperatura);
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