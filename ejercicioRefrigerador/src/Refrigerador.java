
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchitel
 */
public class Refrigerador {

    private String marca;
    private float tamanio;
    private ArrayList<Seccion> seccionesDelRefri;
    private int posicionSeccion;

    public Refrigerador() {

    }

    
    public Refrigerador(String marca, float tamanio, ArrayList<Seccion> seccionesDelRefri)
    {
        this.marca = marca;
        this.tamanio = tamanio;
        this.seccionesDelRefri = seccionesDelRefri;
    }

    // Lo hace el refri o la seccion?
    public void enfriar() {

    }

    // A que se refiere con esto?
    public void conservar() {

    }
    

    // A que se refiere con esto?
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Seccion> getSeccionesDelRefri() {
        return seccionesDelRefri;
    }

    public void setSeccionesDelRefri(ArrayList<Seccion> seccionesDelRefri) {
        this.seccionesDelRefri = seccionesDelRefri;
    }

    public int getPosicionSeccion() {
        return posicionSeccion;
    }

    public void setPosicionSeccion(int posicionSeccion) {
        this.posicionSeccion = posicionSeccion;
    }


}
