/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detecicionintrusos;

class SistemaSeguridad {
    private SensorMovimiento sensor1;
    private SensorMovimiento sensor2;
    private SensorMovimiento sensor3;
    private boolean esDeNoche;
    
    public SistemaSeguridad() {
        this.sensor1 = new SensorMovimiento("S1");
        this.sensor2 = new SensorMovimiento("S2");
        this.sensor3 = new SensorMovimiento("S3");
        this.esDeNoche = false;
    }
    
    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
    
    public void configurarSensores(boolean s1, boolean s2, boolean s3) {
        sensor1.setEstado(s1);
        sensor2.setEstado(s2);
        sensor3.setEstado(s3);
    }
    
    public void verificarSeguridad() {
        sensor1.mostrarEstado();
        sensor2.mostrarEstado();
        sensor3.mostrarEstado();

        int detecciones = 0;
        if (sensor1.getEstado()) detecciones++;
        if (sensor2.getEstado()) detecciones++;
        if (sensor3.getEstado()) detecciones++;
        
        if (detecciones >= 2 && esDeNoche) {
            System.out.println(" Alarma activada: Se detectó intrusión.");
        } else {
            System.out.println(" Sistema seguro.");
        }
    }
}
