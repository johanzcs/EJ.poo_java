/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Numero extends NumeroBase {
    public Numero(double valor) {
        super(valor);
    }

    public static double solicitarNumero(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        return scanner.nextDouble();
    }
}


