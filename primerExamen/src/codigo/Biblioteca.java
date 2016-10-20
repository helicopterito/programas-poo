package codigo;
import java.util.*;


public class Biblioteca {

    private ArrayList<Socio> sociosNoFiables;
    private ArrayList<Socio> socios;
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;
    private String nombre;
    private String direccion;

    public Biblioteca() {
//        this.sociosNoFiables = null;
        this.socios = new ArrayList();
  //      this.bibliotecarios = null;
    //    this.libros = null;
      //  this.prestamos = null;
        this.nombre = "";
        this.direccion = "";
    }

    public void darDeAltaSocio(Socio socio) {
        this.socios.add(socio);

    }
    
    
        public void darDeAltaLibro()
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Cuantos libros van a ser? ");
        int total = lector.nextInt();
        
        Libro lis[] = new Libro[total];
        
        for (int i = 0; i < total; i++) {
            lis[i] = new Libro();
            this.libros.add(lis[i]);           
            
        }
    }
        
        public void darDeBajaLibro()
    {
        
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Seleccione el libro a dar de baja");
        this.listarSocios();
        System.out.println("Respuesta: ");
        socios.remove(lector.nextInt());
    }
        
        
    public void darDeAltaSocio()
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Cuantos socios van a ser? ");
        int total = lector.nextInt();
        
        Socio sos[] = new Socio[total];
        
        for (int i = 0; i < total; i++) {
            sos[i] = new Socio();
            this.socios.add(sos[i]);           
            
        }
    }
    
    public void darDeBajaSocio()
    {
        
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Seleccione el socio a dar de baja");
        this.listarSocios();
        System.out.println("Respuesta: ");
        socios.remove(lector.nextInt());
    }
    
    public void modificarSocio() {

        Scanner lector = new Scanner(System.in);
        int respuesta;
        int opcion;
        
        System.out.println("Seleccione el socio a modificar");
        this.listarSocios();
        System.out.println("Respuesta: ");
        respuesta = lector.nextInt();
        System.out.println("Seleccione la opciona a modificar");
        System.out.println("[1] Nombre: " + socios.get(respuesta).getNombre());
        System.out.println("[2] Direccion: " + socios.get(respuesta).getDireccion());
        System.out.println("[3] Numero de Cuenta: " + socios.get(respuesta).getNumeroDeSocio());
        System.out.println("[4] Numero de libros en prestamo: " + socios.get(respuesta).getNumeroDeLibrosEnPrestamo());
        opcion = lector.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Introduzca el nombre: ");
                socios.get(respuesta).setNombre(lector.next());
                break;
            case 2:
                System.out.println("Introduzca la direccion: ");
                socios.get(respuesta).setDireccion(lector.next());
                break;
            case 3:
                System.out.println("Introduzca el numero de socio: ");
                socios.get(respuesta).setNumeroDeSocio(lector.next());
                break;
            case 4:
                System.out.println("Introduzca el numero de libros: ");
                socios.get(respuesta).setNumeroDeLibrosEnPrestamo(lector.nextInt());
                break;
            default:
                System.out.println("Opcion mo valida");
                break;
        }
        
        System.out.println("Datos modificados");
        System.out.println("Nombre: " + socios.get(respuesta).getNombre());
        System.out.println("Direccion: " + socios.get(respuesta).getDireccion());
        System.out.println("Numero de Cuenta: " + socios.get(respuesta).getNumeroDeSocio());
        System.out.println("Numero de libros en prestamo: " + socios.get(respuesta).getNumeroDeLibrosEnPrestamo());
        
        
        
    }

    public void multarSocio(Socio socio) {
        if (socio.getNumeroDeLibrosEnPrestamo() > 5) {
            this.sociosNoFiables.add(socio);
        }

    }
    
    public void listarSocios()
    {
        
        for(int i = 0; i < socios.size(); i++)
        {
            System.out.print("[" + i + "]\tNombre: " + socios.get(i).getNombre());
            System.out.println("\tNumeroSocio: " + socios.get(i).getNumeroDeSocio());
        }
    }
    
    public void listarLibros()
    {
        for(int i = 0; i < libros.size(); i++)
        {
            System.out.println("[" + i + "]\nCodigo: " + libros.get(i).getCodigo());

            System.out.println("Titulo: " + libros.get(i).getTitulo());

            System.out.println("Autor: " + libros.get(i).getAutor());

            System.out.println("Signatura: " + libros.get(i).getSignatura());

            System.out.println("Ubicacion: " + libros.get(i).getUbicacion());
            System.out.println("Disponible: " + libros.get(i).isDisponible());

            System.out.println("Estado de conservacion: " + libros.get(i).getEstadoDeConservacion());
        
        }        
    }

    public void prestarLibro(Socio socio, Libro libro) {
        for (Socio s : this.sociosNoFiables) {
            if (s.getNumeroDeSocio().equalsIgnoreCase(socio.getNumeroDeSocio())) {
                System.out.println("No se puede prestar el libro");
                break;
            }
        }


        Prestamo p1 = new Prestamo(libro, socio);
        this.prestamos.add(p1);
    }

    public void adquirirLibro() {
        // TODO implement here
        

    }
    
    public int mostrarTotalDePrestamos()
    {
        return prestamos.size();
    }
    
    public int mostrarTotalDeSocios()
    {
        return socios.size();
    }
    
    public int mostrarTotalDeSociosNoFiables()
    {
        return sociosNoFiables.size();
    }
    
    public int mostrarTotalDeLibros()
    {
        return libros.size();
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
