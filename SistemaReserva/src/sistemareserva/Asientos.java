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

    public boolean hayAsientosDisponibles() {
        return asientosDisponibles > 0;
    }

    public void reservarAsiento() {
        if (asientosDisponibles > 0) {
            asientosDisponibles--;
        }
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
}



