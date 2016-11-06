
import java.util.ArrayList;
import java.util.Scanner;

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

    public Ficha tirarFicha() throws java.io.IOException {

        Scanner lector = new Scanner(System.in);

        int respuesta;

        System.out.println("Selecciona la ficha que quieres tirar: ");
        mostrarFicha();
        System.out.println("[" + 9 + "] " + " Pasar");
        respuesta = lector.nextInt();
        Ficha ficha;
        if (respuesta == 9) {
            ficha = new Ficha();
            return ficha;
        } else {
            ficha = this.fichasDeJugador.get(respuesta);
            this.fichasDeJugador.remove(this.fichasDeJugador.get(respuesta));
            return ficha;
        }

    }

    public void mostrarFicha() {
        for (int i = 0; i < this.fichasDeJugador.size(); i++) {
            System.out.println("[" + i + "] " + this.fichasDeJugador.get(i).getLadoIzquierdo() + "|" + this.fichasDeJugador.get(i).getLadoDerecho());

        }

    }

    public Jugador() {
        this.fichasDeJugador = new ArrayList();
    }

}
