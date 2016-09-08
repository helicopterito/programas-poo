/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvarado Moreno Nestor
 */
public class Estudiante extends Persona{
    
    private String numeroDeCuenta;
    private int semestresCursados;
    private int calificacion;
    private boolean vinoAClase;
    
    public Estudiante()
    {
        super();
        this.numeroDeCuenta = "";
        this.semestresCursados = 0;
        this.calificacion = 7;
        this.vinoAClase = true;
    }
    
    public Estudiante(String numeroDeCuenta, int semestresCursados, int calificacion, boolean vinoAClase)
    {
        super();
        this.numeroDeCuenta = numeroDeCuenta;
        this.semestresCursados = semestresCursados;
        this.calificacion = calificacion;
        this.vinoAClase = vinoAClase;
        
    }
    
    public Estudiante(String nombre, String apaterno, String amaterno, String colorDeOjos,
            String fechaNacimiento, float peso, float altura, int edad, char genero, String numeroDeCuenta,
            int semestresCursados, int calificacion, boolean vinoAClase)
    {
        super(nombre, apaterno, amaterno, colorDeOjos, fechaNacimiento,
                peso, altura, edad, genero);
        this.numeroDeCuenta = numeroDeCuenta;
        this.semestresCursados = semestresCursados;
        this.calificacion = calificacion;
        this.vinoAClase = vinoAClase;
    }
    
    public void calificar(String materia, int calificacion)
    {
        if(calificacion < 6)
        {
            System.out.println(materia + " reprobada");
        }
        else if(calificacion >= 6 && calificacion < 9)
        {
            System.out.println(materia + " aprobada");
        }
        else
        {
            System.out.println(materia + " exentada");
        }
    }
    
    public boolean reprobar()
    {
        if(this.calificacion < 6)
        {
            return true;
        }
        else
        {
            return false;
        }
       
        
    }
    
    public void estudiar(String materia)
    {
        System.out.println(this.getNombre() + " estudia " + materia);
    }

    /**
     * @return the numeroDeCuenta
     */
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta the numeroDeCuenta to set
     */
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return the semestresCursados
     */
    public int getSemestresCursados() {
        return semestresCursados;
    }

    /**
     * @param semestresCursados the semestresCursados to set
     */
    public void setSemestresCursados(int semestresCursados) {
        this.semestresCursados = semestresCursados;
    }

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the vinoAClase
     */
    public boolean isVinoAClase() {
        return vinoAClase;
    }

    /**
     * @param vinoAClase the vinoAClase to set
     */
    public void setVinoAClase(boolean vinoAClase) {
        this.vinoAClase = vinoAClase;
    }
    
}
