/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

public class Operacion extends OperacionBase {
    private String tipoOperacion;

    public Operacion(double num1, double num2, String tipoOperacion) {
        super(num1, num2);
        this.tipoOperacion = tipoOperacion;
    }

    public void calcular() {
        double resultado;

        switch (tipoOperacion) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(" Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(" Resultado: " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(" Resultado: " + resultado);
                } else {
                    System.out.println(" Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println(" Error: Operación no válida. Use +, -, * o /.");
        }
    }
}



