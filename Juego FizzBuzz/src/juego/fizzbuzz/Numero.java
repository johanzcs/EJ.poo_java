/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.fizzbuzz;

import java.util.Scanner;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;  
    }

    public int getValor() {
        return valor;
    }

    public static int solicitarNumero(Scanner scanner) {
        int numero;
        do {
            System.out.print("\nIngrese un número entre 1 y 100: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println(" Número fuera de rango. Intente nuevamente.");
            }
        } while (numero < 1 || numero > 100);
        
        return numero;
    }
}

