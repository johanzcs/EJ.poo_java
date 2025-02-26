/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.fizzbuzz;

import java.util.Scanner;

public class Ejecutor {
    public static void ejecutarFizzBuzz(Scanner scanner) {
        int numeroIngresado = Numero.solicitarNumero(scanner);
        FizzBuzz fizzBuzz = new FizzBuzz(numeroIngresado);
        System.out.println(" Resultado: " + fizzBuzz.calcularFizzBuzz());
        System.out.println("\n-------------------------------------");
    }
}

