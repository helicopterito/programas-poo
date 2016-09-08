/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uchitel
 */
public class Profesor extends Persona{
    
    private String numeroDeTrabajador;
    private String materia;
    private double salario;
    
    
    public Profesor()
    {
        super();
        this.numeroDeTrabajador = "";
        this.salario = 0;
        this.materia = "mate";
    }
    
    public void reprobarEstudiante(Estudiante estudiante)
    {
        if(estudiante.getCalificacion() < 6)
        {
            System.out.println("Acabo de reprobar a " + estudiante.getNombre() + " " + estudiante.getaPaterno());
            System.out.println(" en la materia de " + this.materia);
        }
        else
        {
            System.out.print("No pude reprobar a " + estudiante.getNombre() + " " + estudiante.getaPaterno());
            System.out.println(" en la materia de " + this.materia);
        }
        
    }
    
    public void pasarLista(Estudiante estudiantes[])
    {
        
        for(int i = 0; i < estudiantes.length; i++)
        {
            if(estudiantes[i].isVinoAClase())
            {
                System.out.println(estudiantes[i].getNombre() + " " + estudiantes[i].getaPaterno() + " vino a clase");
            }
            else
            {
                System.out.println(estudiantes[i].getNombre() + " " + estudiantes[i].getaPaterno() + " no vino a clase");
            }
        }
        
        /*for (Estudiante est : estudiantes) {
            if(est.isVinoAClase())
            {
                System.out.println(est.getNombre() + " " + est.getaPaterno() + " vino a clase");
            }
            else
            {
                System.out.println(est.getNombre() + " " + est.getaPaterno() + " no vino a clase");
            }
        }*/
    }

    /**
     * @return the numeroDeTrabajador
     */
    public String getNumeroDeTrabajador() {
        return numeroDeTrabajador;
    }

    /**
     * @param numeroDeTrabajador the numeroDeTrabajador to set
     */
    public void setNumeroDeTrabajador(String numeroDeTrabajador) {
        this.numeroDeTrabajador = numeroDeTrabajador;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
