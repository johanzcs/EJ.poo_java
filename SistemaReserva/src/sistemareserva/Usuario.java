/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Usuario extends Persona {
    private int numeroReservas;

    // Constructor corregido
    public Usuario(String nombre, int edad, String correo) {
        super(nombre, edad, correo);  // Llama al constructor de Persona
        this.numeroReservas = 0;  // Inicializa el número de reservas en 0
    }

    public int getNumeroReservas() {
        return numeroReservas;
    }

    public void setNumeroReservas(int numeroReservas) {
        this.numeroReservas = numeroReservas;
    }

    public boolean hacerReserva(Sala sala) {
        if (numeroReservas < 3) {  // Máximo 3 reservas por usuario
            if (sala.realizarReserva()) {
                numeroReservas++;
                System.out.println("Reserva realizada con éxito.");
                return true;
            } else {
                System.out.println("No hay asientos disponibles.");
                return false;
            }
        } else {
            System.out.println("Has alcanzado el límite de 3 reservas.");
            return false;
        }
    }

    // Método para mostrar la información del usuario
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de reservas realizadas: " + numeroReservas);
    }
}

   

