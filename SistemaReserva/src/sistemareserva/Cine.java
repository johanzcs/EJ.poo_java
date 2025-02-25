/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Cine {
    private String nombre;
    private Sala sala;

    public Cine(String nombre, Sala sala) {
        this.nombre = nombre;
        this.sala = sala;
    }

    public void realizarReserva(Usuario usuario) {
        if (usuario.getNumeroReservas() < 3) {
            if (sala.realizarReserva()) {
                usuario.incrementarReservas();
                System.out.println(usuario.getNombre() + " ha realizado una reserva.");
            }
        } else {
            System.out.println("El usuario ha alcanzado el límite de reservas.");
        }
    }

    public void mostrarEstadoSala() {
        System.out.println("\nCine: " + nombre);
        sala.mostrarEstado();
    }
}


