/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluz;

class ControladorLuces {
    private SensorMovimiento sensor;
    private Luz luz;
    private boolean esDeNoche;

    public ControladorLuces(String ubicacion) {
        this.sensor = new SensorMovimiento(ubicacion);
        this.luz = new Luz(ubicacion);
        this.esDeNoche = false;
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void configurarSensor(boolean hayMovimiento) {
        sensor.setEstado(hayMovimiento);
        luz.actualizarEstado(esDeNoche, hayMovimiento);
    }

    public void verificarLuces() {
        sensor.mostrarEstado();
        luz.mostrarEstado();
    }
}

