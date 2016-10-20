package codigo;

import java.util.Scanner;


/**
 * 
 */
public class Persona {
    
    private String nombre;
    private String direccion;
    
    /**
     * Default constructor
     */
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Persona()
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        this.nombre = lector.nextLine();
        System.out.println("Introduzca la direccion: ");
        this.direccion = lector.nextLine();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
