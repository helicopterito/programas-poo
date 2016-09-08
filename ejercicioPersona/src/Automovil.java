
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alvarado Moreno Nestor
 */


public class Automovil {

    private String marca;
    private String color;
    private int numeroDePuertas;
    private int velocidadMaxima;
    private int numeroDeVentanas;
    private int velocidad;
    private float corriente;
   // private AL velocimetro;

    public Automovil() {
        this.marca = "";
        this.color = "";
        this.numeroDePuertas = 4;
        this.velocidadMaxima = 200;
        this.numeroDeVentanas = 5;
        this.corriente = 20;
    }

    public Automovil(String marca, String color, int numeroDePuertas, int velocidadMaxima,
            int numeroDeVentanas, float corriente) {
        this.marca = marca;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroDeVentanas = numeroDeVentanas;
        this.corriente = corriente;
    }

    public void compararVelocidad(Automovil automovil) {
        if (this.velocidadMaxima > automovil.getVelocidadMaxima()) {
            System.out.println("El automovil de la marca " + this.getMarca()
                    + " es mas rapidado que el de la marca " + automovil.getMarca());
        } else if (this.velocidadMaxima < automovil.getVelocidadMaxima()) {
            System.out.println("El automovil de la marca " + automovil.getMarca()
                    + " es mas rapidado que el de la marca " + this.getMarca());
        } else {
            System.out.println("Ambos tienen la misma velocidad");
        }

    }
    
    public void pasarCorriente(Automovil automovil)
    {
        
        /*
        TODO:
        */
        
        if(this.corriente <= 0)
        {
            System.out.println("No hay suficiente carga en la bateria del auto");
        }
        else
        {
            automovil.setCorriente(automovil.getCorriente() + (this.corriente / 2));
            this.setCorriente(this.corriente /2);
        }
    }
    
    public void acelerar() {
        char car = 'W';
        Scanner lector = new Scanner(System.in);
        /*velocimetro = new AL("Acelerando");
        velocimetro.setSize(350, 100);
        velocimetro.setVisible(true);
*/
        System.out.println("Presione [W] para acelerar");
        System.out.println("Presione [X] para salir");
        while (car == 'W' || car == 'w') {
            
            car = lector.next().charAt(0);

            if (this.velocidad == (this.velocidadMaxima -10)) {
                System.out.println("No se puede acelerar mas");
            } else {
                System.out.println("Incrementando la velocidad");
                System.out.println("Velocidad anterior = " + this.velocidad);
                this.setVelocidad(this.getVelocidad() + 10);

            }
            
            System.out.println("Velocidad actual = " + this.velocidad);

        }

    }
    
    public void acelerar(int a) {

        char car;
        Scanner lector = new Scanner(System.in);

        System.out.println("Presione [W] para acelerar\nPresione [S] para desacelerar");
        System.out.println("Presione [X] para salir");
        do{

            car = lector.next().charAt(0);
            

            if (car == 'W' || car == 'w') {

                if (this.velocidad == (this.velocidadMaxima - 10)) {
                    System.out.println("No se puede acelerar mas");
                } else {
                    System.out.println("Incrementando la velocidad");
                    System.out.println("Velocidad anterior = " + this.velocidad);
                    this.setVelocidad(this.getVelocidad() + 10);

                }
                
            } else if (car == 'S' || car == 's') {


                if (this.velocidad == 0) {
                    System.out.println("No se puede DESACELERAR mas");
                } else {
                    System.out.println("Disminuyendo la velocidad");
                    System.out.println("Velocidad anterior = " + this.velocidad);
                    this.setVelocidad(this.getVelocidad() - 10);

                }
                

            } else {
             break;
                
            }
            System.out.println("Velocidad actual = " + this.velocidad);

        }
        while (car != 'x' || car != 'X');

    }

    public void frenar() {
        char car = 'S';
        Scanner lector = new Scanner(System.in);

        System.out.println("Presione [S] para acelerar");
        System.out.println("Presione [X] para salir");
        while (car == 'S' || car == 's') {
            
            car = lector.next().charAt(0);

            if (this.velocidad == 10) {
                System.out.println("No se puede frenar mas");
            } else {
                System.out.println("Disminuyendo la velocidad");
                System.out.println("Velocidad anterior = " + this.velocidad);
                this.setVelocidad(this.getVelocidad() - 10);

            }
            
            System.out.println("Velocidad actual = " + this.velocidad);

        }

    }
    
    public void compararColores(Automovil automovil)
    {
        if(this.getColor().equalsIgnoreCase(automovil.getColor()))
        {
            System.out.println("Los automoviles son del mismo color");
        }
        else
        {
            System.out.println("Los automoviles son de color distinto\n");
            System.out.println(this.getMarca() + " es de color " + this.getColor());
            System.out.println(automovil.getMarca() + " es de color " + automovil.getColor());
        }
        
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numeroDePuertas
     */
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    /**
     * @param numeroDePuertas the numeroDePuertas to set
     */
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    /**
     * @return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return the numeroDeVentanas
     */
    public int getNumeroDeVentanas() {
        return numeroDeVentanas;
    }

    /**
     * @param numeroDeVentanas the numeroDeVentanas to set
     */
    public void setNumeroDeVentanas(int numeroDeVentanas) {
        this.numeroDeVentanas = numeroDeVentanas;
    }

    /**
     * @return the corriente
     */
    public float getCorriente() {
        return corriente;
    }

    /**
     * @param corriente the corriente to set
     */
    public void setCorriente(float corriente) {
        this.corriente = corriente;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
