/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class Ficha {
    
    private int ladoIzquierdo;
        private int ladoDerecho;
        
        public Ficha(int derecha, int izquierda)
        {
            this.ladoDerecho = derecha;
            this.ladoIzquierdo = izquierda;
        }

        public int getLadoIzquierdo() {
            return ladoIzquierdo;
        }

        public void setLadoIzquierdo(int ladoIzquierdo) {
            this.ladoIzquierdo = ladoIzquierdo;
        }

        public int getLadoDerecho() {
            return ladoDerecho;
        }

        public void setLadoDerecho(int ladoDerecho) {
            this.ladoDerecho = ladoDerecho;
        }
    
}
