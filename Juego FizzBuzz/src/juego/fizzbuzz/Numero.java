/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.fizzbuzz;

import java.util.Scanner;


public class Numero extends NumeroBase {

    public Numero(int valor) {
        super(valor); 
        if (valor < 1 || valor > 100) {
            throw new IllegalArgumentException(" El número debe estar entre 1 y 100.");
        }
    }

    public static int solicitarNumero(Scanner scanner) {
        int numero;
        while (true) {
            System.out.print("\nIngrese un número entre 1 y 100: ");
            numero = scanner.nextInt();

            if (numero >= 1 && numero <= 100) {
                return numero;
            } else {
                System.out.println("Número fuera de rango. Intente nuevamente.");
            }
        }
    }
}



