/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaire;

class AireAcondicionado {
    private boolean estado;

    public AireAcondicionado() {
        this.estado = false;
    }

    public void actualizarEstado(double temperatura, double humedad) {
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            estado = true;
        } else {
            estado = false;
        }
    }

    public void mostrarEstado() {
        System.out.println("️ Aire Acondicionado: " + (estado ? "Encendido" : "Apagado"));
    }
}

