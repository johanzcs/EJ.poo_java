/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Sala {
    private Asientos asientos;
    private int reservasRealizadas; // Contador de reservas realizadas

    public Sala(int cantidadAsientos) {
        this.asientos = new Asientos(cantidadAsientos);
        this.reservasRealizadas = 0;
    }

    public boolean realizarReserva() {
        if (asientos.hayAsientosDisponibles()) {
            asientos.reservarAsiento();
            reservasRealizadas++; // Se incrementa el número de reservas
            return true;
        }
        return false;
    }

    public void mostrarAsientosDisponibles() {
        System.out.println("Quedan " + asientos.getAsientosDisponibles() + " asientos disponibles.");
    }

    public void mostrarReservasRealizadas() {
        System.out.println("Número total de reservas realizadas: " + reservasRealizadas);
    }
}


