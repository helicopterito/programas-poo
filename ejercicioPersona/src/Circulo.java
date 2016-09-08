/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvarado Moreno Néstor
 */
public class Circulo {
    
    private int radio;
    
    public Circulo()
    {
        this.radio = 0;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public int calcularDiametro()
    {
        return this.radio * 2;
    }
    
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        
        System.out.println("c1 es de la " + c1.getClass());
        
        c1.setRadio(5);
        System.out.println("El diametro de c1 es " + c1.calcularDiametro());
        
    }
    
}
