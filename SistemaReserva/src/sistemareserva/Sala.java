/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareserva;

public class Sala {
    private String idSala;
    private String tipoSala;
    private Asientos asientos;
    private String pelicula;

    public Sala(String idSala, String tipoSala, int totalAsientos, String pelicula) {
        this.idSala = idSala;
        this.tipoSala = tipoSala;
        this.asientos = new Asientos(totalAsientos);
        this.pelicula = pelicula;
    }

    public boolean realizarReserva() {
        return asientos.reservarAsiento();
    }

    public void mostrarEstado() {
        System.out.println("\nSala: " + idSala + " (" + tipoSala + ")");
        System.out.println("Película en proyección: " + pelicula);
        System.out.println("Asientos disponibles: " + asientos.getAsientosDisponibles());
    }
}





