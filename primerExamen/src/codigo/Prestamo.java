package codigo;
import java.util.ArrayList;
import java.util.Date;


public class Prestamo {

    private Date fechaDePrestamo;
    private Date fechaDeEntrega;
    private Libro libro;
    private ArrayList<Libro> libros;
    private Socio socio;
    

    
    public Prestamo(Date fechaDePrestamo, Date fechaDeEntrega, Libro libro, Socio socio) {
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.socio = socio;
        this.libro = libro;
    }
    
    public Prestamo(Libro libro, Socio socio) {
        //Fecha en que se realiza el préstamo. Toma la fecha en que se ejecuta el método
        this.fechaDePrestamo = new Date();
        //El libro se tiene que entregar 5 días a partir de la fecha en que se realiza el prestamo
        this.fechaDeEntrega = new Date(fechaDePrestamo.getTime() * 60 *60 *24 *5);
        this.socio = socio;
        this.libro = libro;
        this.libros = null;
    }
    
    public Prestamo(ArrayList<Libro> libros, Socio socio)
    {
           //Fecha en que se realiza el préstamo. Toma la fecha en que se ejecuta el método
        this.fechaDePrestamo = new Date();
        //El libro se tiene que entregar 5 días a partir de la fecha en que se realiza el prestamo
        this.fechaDeEntrega = new Date(fechaDePrestamo.getTime() * 60 *60 *24 *5);
        this.socio = socio;
        this.libros = libros;
        this.libro = null;
    }
    
    public void imprimirDatos()
    {
        System.out.println("Nombre del socio: " + socio.getNombre());
        System.out.println("Direccion del socio: " + socio.getDireccion());
        System.out.println("Titulo del libro: " + libro.getTitulo());
        System.out.println("Fecha en que se realizo el prestamo: " + fechaDePrestamo);
        System.out.println("Fecha de entrega: " + fechaDeEntrega);
    }
    
    public void imprimirDatos(int i) {
        System.out.println("Nombre del socio: " + socio.getNombre());
        System.out.println("Direccion del socio: " + socio.getDireccion());

        for (Libro l : libros) {
            System.out.println("Titulo del libro: " + l.getTitulo());
        }
        System.out.println("Fecha en que se realizo el prestamo: " + fechaDePrestamo);
        System.out.println("Fecha de entrega: " + fechaDeEntrega);

    }

    public Date getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(Date fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }


}
