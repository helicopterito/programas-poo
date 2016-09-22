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
    protected  Seccion[] secciones;
    
    public Refrigerador()
    {
        
    }
    
    public Refrigerador(String marca, float tamanio, int numeroDeSecciones)
    {
        this.marca = marca;
        this.tamanio = tamanio;
        this.secciones = new Seccion[numeroDeSecciones];
        
        /*for(int i = 0; i < numeroDeSecciones; i++)
        {
            secciones[i] = new Seccion();
        }*/
    }
    
    // Lo hace el refri o la seccion?
    
    public void enfriar()
    {
        
    }
    
    // A que se refiere con esto?
    
    public void conservar()
    {
        
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

    public Seccion getSeccion(int i) {
        return secciones[i];
    }

    public void setSeccion(Seccion seccion, int i) {
        this.secciones[i] = seccion;
    }
    
    
}
