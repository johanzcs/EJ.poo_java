/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.fizzbuzz;

public class FizzBuzz {
    private int numero;

    public FizzBuzz(int numero) {
        this.numero = numero;
    }

    public String calcularFizzBuzz() {
        if (numero % 3 == 0 && numero % 5 == 0) {
             System.out.println("Es divisible por 3 y 5. Resultado: FizzBuzz");
            return " FizzBuzz";
        } else if (numero % 3 == 0) {
            System.out.println("Es divisible por 3. Resultado: Fizz");
            return "Fizz";
        } else if (numero % 5 == 0) {
             System.out.println("Es divisible por 5. Resultado: Buzz");
            return "Buzz";
        } else {
            System.out.println("No es divisible por 3 ni por 5. Resultado: " + numero);
            return String.valueOf(numero);
        }
    }
}
