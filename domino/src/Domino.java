

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class Domino {

    ArrayList<Ficha> fichasDeJuego;
    ArrayList<Jugador> jugadores;
    ArrayList<Ficha> fichasTiradas;
    int turno;
    boolean hayGanador;
    
    public void iniciarJuego()
    {
        crearSopa();
        repartirAlJugador();
    }
    
    public void repartirFichas()
    {
        
        Collections.shuffle(fichasDeJuego);
        
        System.out.println("Fichas");
        this.jugadores.get(0).fichasDeJugador.add(fichasDeJuego.get(0));
        this.fichasDeJuego.remove(fichasDeJuego.get(0));
        this.jugadores.get(1).fichasDeJugador.add(fichasDeJuego.get(0));       
        this.fichasDeJuego.remove(fichasDeJuego.get(0));
        this.jugadores.get(0).fichasDeJugador.add(fichasDeJuego.get(0));
        this.fichasDeJuego.remove(fichasDeJuego.get(0));
        this.jugadores.get(1).fichasDeJugador.add(fichasDeJuego.get(0));       
        this.fichasDeJuego.remove(fichasDeJuego.get(0));
        
    }
    
    public void repartirAlJugador()
    {
        Collections.shuffle(fichasDeJuego);
        for(Jugador j : this.jugadores)
        {
            for (int i = 0; i < 7; i++) {
                j.fichasDeJugador.add(fichasDeJuego.get(0));
                this.fichasDeJuego.remove(0);
                
            }
        }
    }
    
    public void crearSopa()
    {
        
        int limite=0;
        for(int i=0;i<=6;i++)
        { 
            if(i>=1)
            { 
                limite++;
            }
            for(int j=6;j>=limite;j--)
            {
                fichasDeJuego.add(new Ficha(i,j));
            }
        }
    }
    
    

    public boolean  validarFicha(Ficha ficha, char car)
    {
        
        switch (car) {
            case 'D':
                if ((this.fichasTiradas.get(this.fichasTiradas.size() - 1).getLadoDerecho() == ficha.getLadoIzquierdo())
                        || (this.fichasTiradas.get(this.fichasTiradas.size() - 1).getLadoDerecho() == ficha.getLadoDerecho())
                        || (this.fichasTiradas.get(this.fichasTiradas.size() - 1).getLadoIzquierdo() == ficha.getLadoIzquierdo()
                        || (this.fichasTiradas.get(this.fichasTiradas.size() - 1).getLadoIzquierdo() == ficha.getLadoDerecho()))
                        ) {
                    return true;
                } else {
                    return false;
                }
            case 'I':
                if ((this.fichasTiradas.get(0).getLadoIzquierdo() == ficha.getLadoDerecho())
                        || this.fichasTiradas.get(0).getLadoIzquierdo() == ficha.getLadoIzquierdo()
                        || (this.fichasTiradas.get(0).getLadoDerecho() == ficha.getLadoIzquierdo())
                        || (this.fichasTiradas.get(0).getLadoDerecho() == ficha.getLadoDerecho())) {
                    return true;
                } else {
                    return false;
                }
                
            default:
                return false;
        }
        
    }
    
    
    public int buscarMulaDeSeis()
    {
        int posicion = 0;
        for (int i = 0; i < this.jugadores.size(); i++) {
            for(Ficha f : this.jugadores.get(i).fichasDeJugador)
            {
                if(f.getLadoDerecho() == 6 && f.getLadoIzquierdo() == 6)
                {
                   posicion = i;
                }
            }
            
        }
        
        return posicion;
    }

    public void comenzarJuego() {
        Scanner lector = new Scanner(System.in);

        iniciarJuego();
        turno = buscarMulaDeSeis();

        char direccion;

        while (!hayGanador) {
            System.out.println("Turno del jugador #" + (turno + 1));

            if (this.fichasTiradas.size() == 0) {
                try {
                    fichasTiradas.add(this.jugadores.get(turno).tirarFicha());
                    this.turno++;
                } catch (IOException ex) {
                    Logger.getLogger(Domino.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.imprimirFichasEnJuego();
                try {
                    Ficha fichaATirar = this.jugadores.get(turno).tirarFicha();

                    if (fichaATirar.isEsValida()) {
                        System.out.println("Tirar por la [D]erecha o [I]zquierda ");
                        direccion = lector.next().toUpperCase().charAt(0);

                        if (direccion == 'D') {
                            if (validarFicha(fichaATirar, direccion)) {
                                fichasTiradas.add(fichaATirar);
                                this.jugadores.get(turno).fichasDeJugador.remove(fichaATirar);
                            } else {
                                System.out.println("Movimiento no permitido");
                                continue;
                            }

                        } else if (direccion == 'I') {

                            if (validarFicha(fichaATirar, direccion)) {
                                fichasTiradas.add(0, fichaATirar);
                                this.jugadores.get(turno).fichasDeJugador.remove(fichaATirar);
                            } else {
                                System.out.println("Movimiento no permitido");
                                continue;
                            }

                        }
                    } else {
                        System.out.println("El jugador ha pasado su turno");
                        this.turno++;
                        if (this.turno == 4) {
                            this.turno = 0;
                        }
                        continue;

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Domino.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (this.jugadores.get(turno).fichasDeJugador.isEmpty()) {
                    this.hayGanador = true;
                }
                turno++;
            }

            if (this.turno == 4) {
                this.turno = 0;
            }

        }
        
        System.out.println("El jugador #" + (turno + 1) + " ha ganado");
    }
    
    public void imprimirFichasEnJuego()
    {
        System.out.println("Fichas del juego: ");
        for(Ficha f : this.fichasTiradas)
        {
            System.out.println(f.getLadoIzquierdo() + "|" + f.getLadoDerecho());
        }
        
    }
    
    public Domino()
    {
        this.fichasDeJuego = new ArrayList();
        this.jugadores = new ArrayList();
        this.fichasTiradas = new ArrayList();
        this.turno = 0;
        this.hayGanador = false;
        
    }
    
    
    public static void main(String[] args) {
        Domino d1 = new Domino();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        Jugador j3 = new Jugador();
        Jugador j4 = new Jugador();
        d1.jugadores.add(j1);
        d1.jugadores.add(j2);
        d1.jugadores.add(j3);
        d1.jugadores.add(j4);        
        d1.comenzarJuego();
 
        
    }
}
