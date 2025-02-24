/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;


public abstract class Reserva {
     protected int totalAsientos;
    protected int asientosDisponibles;
    
    public Reserva(int totalAsientos) {
        this.totalAsientos = totalAsientos;
        this.asientosDisponibles = totalAsientos;
    }

    public abstract void realizarReserva();

    public boolean hayAsientosDisponibles() {
        return asientosDisponibles > 0;
    }

    public void actualizarAsientos() {
        if (asientosDisponibles > 0) {
            asientosDisponibles--;
            System.out.println("Reserva exitosa! Quedan " + asientosDisponibles + " asientos disponibles.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }
}
