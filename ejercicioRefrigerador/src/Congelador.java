/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
// por aprobar

public class Congelador extends Seccion{
    
    public Congelador()
    {
        
    }
    
    public void congelar()
    {
        this.setTemperatura(this.getTemperatura() / 2);
    }
    
}
