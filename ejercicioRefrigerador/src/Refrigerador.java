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
    private Seccion secciones[];
    
    public Refrigerador()
    {
        
    }
    
    public Refrigerador(String marca, float tamanio, Seccion secciones[])
    {
        this.marca = marca;
        this.tamanio = tamanio;
        this.secciones = secciones;
    }
}
