package codigo;



public class Socio extends Persona {


    public Socio(String nombre, String numeroDeSocio, String direccion, int numeroDeLibrosEnPrestamo) {
        super(nombre);
        this.direccion = direccion;
        this.numeroDeSocio = numeroDeSocio;
        this.numeroDeLibrosEnPrestamo = numeroDeLibrosEnPrestamo;
    }


    private String numeroDeSocio;
    private String direccion;
    private int numeroDeLibrosEnPrestamo;




    public void pedirLibroPrestado() {
        
        
    }

    public String getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(String numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeLibrosEnPrestamo() {
        return numeroDeLibrosEnPrestamo;
    }

    public void setNumeroDeLibrosEnPrestamo(int numeroDeLibrosEnPrestamo) {
        this.numeroDeLibrosEnPrestamo = numeroDeLibrosEnPrestamo;
    }

}