/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juan Pablo Ospina
 */
public class rentaModel {
    long idRenta;
    double precio;
    int fechaAlquiler;
    automovilModel idAutomovil;
    usuarioModel idUsuario;

    public long getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(long idRenta) {
        this.idRenta = idRenta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(int fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public automovilModel getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(automovilModel idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public usuarioModel getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(usuarioModel idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
