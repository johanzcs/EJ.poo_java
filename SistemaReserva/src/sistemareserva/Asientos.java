/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Asientos {
    private int totalAsientos;
    private int asientosDisponibles;

    public Asientos(int totalAsientos) {
        this.totalAsientos = totalAsientos;
        this.asientosDisponibles = totalAsientos;
    }

    public boolean hayAsientosDisponibles() {
        return asientosDisponibles > 0;
    }

    public void reservarAsiento() {
        if (hayAsientosDisponibles()) {
            asientosDisponibles--;
            System.out.println("Reserva exitosa. Asientos restantes: " + asientosDisponibles);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
}

