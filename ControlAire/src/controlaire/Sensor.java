/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaire;

class Sensor {
    protected double valor;

    public Sensor() {
        this.valor = 0.0;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void mostrarValor() {
        System.out.println("Valor del sensor: " + valor);
    }
}
