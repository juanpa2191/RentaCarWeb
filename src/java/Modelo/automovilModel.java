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
public class automovilModel {
    long idAutomovil;
    int gama;
    int fechaCreacion;
    double precio;
    boolean ocupado;
    boolean activo;
    marcaModel idMarca;
    tipoModel idTipo;

    public long getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(long idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public marcaModel getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(marcaModel idMarca) {
        this.idMarca = idMarca;
    }

    public tipoModel getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(tipoModel idTipo) {
        this.idTipo = idTipo;
    }
    
    
}
