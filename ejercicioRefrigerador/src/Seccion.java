
import java.util.Scanner;

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
    private float temperaturaMinima;
    private float temperaturaMaxima;
    private float capacidad;
    
    public Seccion()
    {
        
    }
    
    public Seccion(String identificador, float temperatura, float temperaturaMinima, float temperaturaMaxima,
            float capacidad)
    {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.capacidad = capacidad;
    }
    
    public void enfriar()
    {
        if(this.temperatura == this.temperaturaMinima)
        {
            System.out.println("No se puede disminuir la temperatura");
        }
        
        this.temperatura /= 2;
    }
    
    public void ajustarTemperatura()
    {
        
        char car;
        Scanner lector = new Scanner(System.in);

        System.out.println("Presione [W] para aumentar la temperatura\nPresione [S] para disminuir la temperatura");
        System.out.println("Presione [X] para salir");
        do {

            car = lector.next().charAt(0);

            if (car == 'W' || car == 'w') {

                if (this.temperatura == (this.temperaturaMaxima - 10)) {
                    System.out.println("No se puede calentar mas");
                } else {
                    System.out.println("Incrementando la temperatura");
                    System.out.println("Temperatura anterior = " + this.temperatura);
                    this.setTemperatura(this.getTemperatura() + 10);

                }

            } else if (car == 'S' || car == 's') {

                if (this.temperatura == (this.temperaturaMinima - 10)) {
                    System.out.println("No se puede enfriar mas");
                } else {
                    System.out.println("Disminuyendo la temperatura");
                    System.out.println("Temperatura anterior = " + this.temperatura);
                    this.setTemperatura(this.getTemperatura() - 10);

                }

            } else {
                break;

            }
            System.out.println("Temperatura actual = " + this.temperatura);

        } while (car != 'x' || car != 'X');
    }
    
    // agregar metodo calentar??
    
    
    //que se refiere?
    public void almacenar(Producto producto)
    {
        System.out.println("El producto + " + producto.getNombre() + " esta almacenado");
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

    public float getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public float getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(float temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
    
}
