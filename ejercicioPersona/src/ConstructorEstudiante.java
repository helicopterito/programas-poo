/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvarado Moreno Nestor
 */
public class ConstructorEstudiante {
    
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante();
        
        e1.setNombre("Andres");
        e1.setaPaterno("ktoto");
        e1.estudiar("mate");

        Estudiante e2 = new Estudiante();
        e2.setNombre("Cris");
        e2.setaPaterno("Liador de cigarrillos");
        e2.setVinoAClase(false);
        
        Estudiante e3 = new Estudiante("Juan", "Sanchez", "Gutierrez", "azul", "1996-05-15", 60, (float) 1.6, 20,
                'M', "789456321", 4, 6, true);
        
        System.out.println(e1.getGenero());
        System.out.println(e1.getSemestresCursados());
        e1.calificar("mate", e1.getCalificacion());
        

        if(e1.reprobar())
        {
            System.out.println("Reprobo");
        }
        else
        {
            System.out.println("Paso");
        }
        
        Profesor p1 = new Profesor();
        
        p1.reprobarEstudiante(e1);
        

        
        System.out.println("");
        System.out.println("");
        Estudiante estudiantes[] = {e1, e2, e3};
        p1.pasarLista(estudiantes);
    }
    
}
