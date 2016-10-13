package codigo;

public class Socio extends Persona {

    private String numeroDeSocio;
    private int numeroDeLibrosEnPrestamo;

    public Socio(String nombre, String direccion, String numeroDeSocio, int numeroDeLibrosEnPrestamo) {
        super(nombre, direccion);
        this.numeroDeSocio = numeroDeSocio;
        this.numeroDeLibrosEnPrestamo = numeroDeLibrosEnPrestamo;
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
