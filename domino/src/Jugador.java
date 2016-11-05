
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class Jugador {
    
    ArrayList<Ficha> fichasDeJugador;
        
        int tirarFicha() throws java.io.IOException
        {
           do
           {
               int respuesta, ignorar;
               
               mostrarFicha();
           }
     
            
            do {
                ignorar = System.in.read();    
            } while (ignorar != '\n');
            
        }
        
        void mostrarFicha()
        {
            for (int i = 0; i < this.fichasDeJugador.size(); i++) {
                System.out.println("[" + i + "] " + this.fichasDeJugador.get(i).getLadoIzquierdo() +  this.fichasDeJugador.get(i).getLadoDerecho());
                
            }
            
            
        }
        
        public Jugador()
        {
            this.fichasDeJugador = new ArrayList();
        }
    
}
