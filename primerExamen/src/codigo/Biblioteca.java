package codigo;
import java.util.*;


public class Biblioteca {


    public Biblioteca() {
    }


    private ArrayList<Socio> sociosNoFiables;
    private ArrayList<Socio> socios;
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;








    public void darDeAltaSocio(Socio socio) {
        this.socios.add(socio);
        
    }


    public void multarSocio(Socio socio) {
        if(socio.getNumeroDeLibrosEnPrestamo() > 5)
        {
            this.sociosNoFiables.add(socio);
        }
        
    }
    
    public void prestarLibro(Socio socio, Libro libro)
    {
        for(Socio s : this.sociosNoFiables)
        {
            if(s.getNumeroDeSocio().equalsIgnoreCase(socio.getNumeroDeSocio()))
            {
                System.out.println("No se puede prestar el libro");
                break;
            }
        }
        
        Date d1 = new Date();
        Date d2 = new Date(d1.getTime() * 60 *60 *24 *5);
        Prestamo p1 = new Prestamo(d1, d2, libro.getCodigo(), socio.getNumeroDeSocio());
        this.prestamos.add(p1);
    }


    public void adquirirLibro() {
        // TODO implement here
        
    }

    public ArrayList<Socio> getSociosNoFiables() {
        return sociosNoFiables;
    }

    public void setSociosNoFiables(ArrayList<Socio> sociosNoFiables) {
        this.sociosNoFiables = sociosNoFiables;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

}