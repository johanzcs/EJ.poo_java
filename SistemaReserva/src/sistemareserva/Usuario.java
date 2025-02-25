/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Usuario extends Persona {
    private int numeroReservas;

    public Usuario(String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.numeroReservas = 0;
    }

    public int getNumeroReservas() {
        return numeroReservas;
    }

    public void incrementarReservas() {
        numeroReservas++;
    }

    public void mostrarInformacion() {
        imprimirDatos();
        System.out.println("Número de reservas realizadas: " + numeroReservas);
    }
}




   

