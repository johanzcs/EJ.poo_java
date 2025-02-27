/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperatura;

class ControladorTemperatura extends DispositivoControl {
    public void monitorearTemperatura(int temperatura) {
        System.out.println("Temperatura ingresada: " + temperatura + "°C");

        if (temperatura < 10) {
            System.out.println(" Activando calefactor...");
            activar();
        } else if (temperatura > 25) {
            System.out.println("️ Activando ventilador...");
            activar();
        } else {
            System.out.println(" Sistema inactivo. Temperatura estable.");
            desactivar();
        }
    }
}
