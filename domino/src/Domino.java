
import java.util.ArrayList;
import java.util.Collections;


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
    
   
    
    class Nodo<Ficha>
    {
        Nodo siguiente;
        Nodo anterior;
        Ficha ficha;
        
        public Nodo(Ficha valor)

        {
            this.ficha = valor;
        }
    
    }
    
    
    
    Nodo inicio;
    Nodo fin;
    ArrayList<Ficha> fichasDeJuego;
    ArrayList<Jugador> jugadores;
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
    
    
    public void agregarInicio(Ficha ficha)
    {
        Nodo nuevoNodo = new Nodo(ficha);
        
        if(estaVacia())
        {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }
        else
        {
            
            inicio.anterior = nuevoNodo;
            nuevoNodo.siguiente = inicio;
            inicio = nuevoNodo;
        }
    }
    
    public boolean  validarFicha()
    {
    //    if(inicio.ficha)
        return true;
    }
    
    public boolean estaVacia()
    {
        return inicio == null;
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
    
    public void comenzarJuego()
    {
        while(!hayGanador)
        {
            
        }
    }
    
    public Domino()
    {
        this.fichasDeJuego = new ArrayList();
        this.jugadores = new ArrayList();
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
        System.out.println(d1.fichasDeJuego.size());
        d1.crearSopa();
        System.out.println(d1.fichasDeJuego.size());
        //d1.repartirFichas();
        d1.repartirAlJugador();
        int i = 0;
        for(Ficha f : d1.fichasDeJuego)
        {
            System.out.println(i + " " + f.getLadoIzquierdo() + "|" + f.getLadoDerecho());
            i++;
        }
        
      
        
       for(Jugador j : d1.jugadores)
       {
           System.out.println("\nJugador");
           for(Ficha f : j.fichasDeJugador)
           {
               System.out.println(f.getLadoIzquierdo() + "|" + f.getLadoDerecho());
           }
       }
       
        System.out.println(d1.buscarMulaDeSeis());
        
    }
}
