/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Asientos {
    private int totalAsientos;
    private int asientosDisponibles;

    public Asientos(int cantidad) {
        this.totalAsientos = cantidad;
        this.asientosDisponibles = cantidad;
    }

    public boolean reservarAsiento() {
        if (asientosDisponibles > 0) {
            asientosDisponibles--;
            System.out.println("Reserva realizada con éxito. Asientos restantes: " + asientosDisponibles);
            return true;
        } else {
            System.out.println("No hay asientos disponibles.");
            return false;
        }
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
}




