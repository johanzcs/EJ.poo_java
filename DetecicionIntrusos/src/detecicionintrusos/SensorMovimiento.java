/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detecicionintrusos;

class SensorMovimiento extends Sensor {
    private String id;

    public SensorMovimiento(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void mostrarEstado() {
        System.out.println(" Sensor " + id + ": " + (estado ? "Detecta movimiento" : "Sin movimiento"));
    }
}
