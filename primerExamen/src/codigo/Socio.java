package codigo;

import java.util.Scanner;

public class Socio extends Persona {

    private String numeroDeSocio;
    private int numeroDeLibrosEnPrestamo;

    public Socio(String nombre, String direccion, String numeroDeSocio, int numeroDeLibrosEnPrestamo) {
        super(nombre, direccion);
        this.numeroDeSocio = numeroDeSocio;
        this.numeroDeLibrosEnPrestamo = numeroDeLibrosEnPrestamo;
    }
    
    public Socio()
    {
        super();
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de socio: ");
        this.numeroDeSocio = lector.nextLine();
        this.numeroDeLibrosEnPrestamo = 0;
        
    }

    public void pedirLibroPrestado() {

    }

    public String getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(String numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    

    public int getNumeroDeLibrosEnPrestamo() {
        return numeroDeLibrosEnPrestamo;
    }

    public void setNumeroDeLibrosEnPrestamo(int numeroDeLibrosEnPrestamo) {
        this.numeroDeLibrosEnPrestamo = numeroDeLibrosEnPrestamo;
    }

}
