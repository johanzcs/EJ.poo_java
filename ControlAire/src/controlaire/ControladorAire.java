/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaire;

class ControladorAire {
    private SensorTemperatura sensorTemp;
    private SensorHumedad sensorHum;
    private AireAcondicionado aire;

    public ControladorAire() {
        this.sensorTemp = new SensorTemperatura();
        this.sensorHum = new SensorHumedad();
        this.aire = new AireAcondicionado();
    }

    public void configurarSensores(double temperatura, double humedad) {
        sensorTemp.setValor(temperatura);
        sensorHum.setValor(humedad);
        aire.actualizarEstado(temperatura, humedad);
    }

    public void verificarSistema() {
        sensorTemp.mostrarValor();
        sensorHum.mostrarValor();
        aire.mostrarEstado();
    }
}

