/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchitel
 */
public class Seccion {
    
    private String identificador;
    private float temperatura;
    private float capacidad;
    
    public Seccion()
    {
        
    }
    
    public Seccion(String identificador, float temperatura, float capacidad)
    {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.capacidad = capacidad;
    }
    
    

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    
}
