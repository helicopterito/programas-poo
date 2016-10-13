package codigo;

import java.util.Scanner;



public class Libro {



    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponible;
    private String signatura;
    private String ubicacion;
    private String estadoDeConservacion;
    
    public Libro(String codigo, String titulo, String autor, boolean disponible, String signatura,
            String ubicacion, String estadoDeConservacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.signatura = signatura;
        this.ubicacion = ubicacion;
        this.estadoDeConservacion = estadoDeConservacion;
    }
    public void cambiarDeLugar() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el nuevo lugar: ");
        this.ubicacion = lector.nextLine();
        this.cambiarSignatura(ubicacion + (Math.random() * 10));

    }

    public void cambiarSignatura(String signatura) {
        
        this.setSignatura(signatura);

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstadoDeConservacion() {
        return estadoDeConservacion;
    }

    public void setEstadoDeConservacion(String estadoDeConservacion) {
        this.estadoDeConservacion = estadoDeConservacion;
    }

}
