/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

import java.util.Scanner;

public class Sala extends Reserva {
    
    public Sala(int totalAsientos) {
        super(totalAsientos);
    }

    public void realizarReserva() {
        Scanner scanner = new Scanner(System.in);
        if (hayAsientosDisponibles()) {
            System.out.println("¡Bienvenido al sistema de reservas! Realizando la reserva...");
            actualizarAsientos();
        } else {
            System.out.println("No se puede realizar la reserva, ya no hay asientos disponibles.");
        }
    }
}

