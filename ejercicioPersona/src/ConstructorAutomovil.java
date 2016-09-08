/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchitel
 */
public class ConstructorAutomovil {
    
    public static void main(String[] args) {
        
        Automovil a1 = new Automovil();
        Automovil a2 = new Automovil();
        
        System.out.println("corriente a1 " + a1.getCorriente());
        System.out.println("corriente a2 " + a2.getCorriente());
        a1.pasarCorriente(a2);
        System.out.println("corriente a1 " + a1.getCorriente());
        System.out.println("corriente a2 " + a2.getCorriente());
        //a1.acelerar();
        //a1.frenar();
        //a2.acelerar(0);
        a1.compararColores(a2);
        
    }
    
}
