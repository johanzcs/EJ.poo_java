/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluz;

class Dispositivo {
    protected boolean estado;

    public Dispositivo() {
        this.estado = false;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + (estado ? "Encendido" : "Apagado"));
    }
}

