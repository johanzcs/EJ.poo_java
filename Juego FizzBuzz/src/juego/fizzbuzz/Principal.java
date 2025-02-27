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
            System.out.println("\n Menú de FizzBuzz ");
            System.out.println("1 Ingresar número y calcular FizzBuzz");
            System.out.println("2 salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                int num = Numero.solicitarNumero(scanner);
                FizzBuzz fizzBuzz = new FizzBuzz(num);
                System.out.println(" Resultado: " + fizzBuzz.calcularFizzBuzz());
            } else if (opcion != 2) {
                System.out.println("Opción inválida.");
            }
        } while (opcion != 2);

        System.out.println(" ¡Gracias por jugar FizzBuzz!");
        scanner.close();
    }
}





