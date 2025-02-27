/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("===================================");
        System.out.println(" BIENVENIDO A LA CALCULADORA ");
        System.out.println("===================================");
        System.out.println(" Esta calculadora permite realizar operaciones básicas (+, -, *, /).");
        System.out.println(" Puede resolver un ejercicio o salir.");
        System.out.println("===================================");

        while (continuar) {
            
            System.out.println("\n MENÚ PRINCIPAL");
            System.out.println("1 Resolver una operación");
            System.out.println("2 Salir");
            System.out.print(" Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el primer número: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();

                    System.out.print("Ingrese la operación (+, -, *, /): ");
                    String operacion = scanner.next();

                    Operacion calculo = new Operacion(num1, num2, operacion);
                    calculo.calcular();
                    break;

                case 2:
                    System.out.println("\n Gracias por usar la calculadora. ¡Hasta la próxima!");
                    continuar = false;
                    break;

                default:
                    System.out.println(" Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}




