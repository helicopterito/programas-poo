/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class Producto {
    private String nombre;
    private String fechaDeCompra;
    private String empaque; // a que se refiere?
    private String estadoConservacion;
    private float cantidad; //?
    private float peso;
    
    public Producto(String nombre, String fechaDeCompra, String empaque, String estadoConservacion,
            float cantidad, float peso)
    {
        this.nombre = nombre;
        this.fechaDeCompra = fechaDeCompra;
        this.empaque = empaque;
        this.estadoConservacion = estadoConservacion;
        this.cantidad = cantidad;
        this.peso = peso;
    }
    
    public Producto()
    {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
