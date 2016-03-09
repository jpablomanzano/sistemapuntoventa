/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Grupo Lorca
 */
public class vhabitacion {
    private int idhabitacion;
    private String numero_habitacion;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private double preciodiario_habitacion;
    private String estado;
    private String tipo_habitacion;

    public vhabitacion(int idhabitacion, String numero, String piso, String descripcion, String caracteristicas, double preciodiario_habitacion, String estado, String tipo_habitacion) {
        this.idhabitacion = idhabitacion;
        this.numero_habitacion = numero_habitacion;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.preciodiario_habitacion = preciodiario_habitacion;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

    public vhabitacion() {
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(String numero) {
        this.numero_habitacion = numero_habitacion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPreciodiario_habitacion() {
        return preciodiario_habitacion;
    }

    public void setPreciodiario_habitacion(double preciodiario_habitacion) {
        this.preciodiario_habitacion = preciodiario_habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }
    
    
    
}
