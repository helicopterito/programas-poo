/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class ConstructorBiblioteca {

    public static void main(String[] args) {
        Libro l1 = new Libro("123456789", "Programacion en Java", "Dennis Ritchie", true, "Programacion", "P-201.2", "Mal");
        Libro l2 = new Libro("123456788", "Programacion en C", "Dennis Ritchie", false, "Programacion", "P-201.3", "Bueno");
        Libro l3 = new Libro("123456787", "Java Para Dummies", "Guido Von R.", true, "Programacion", "P-201.5", "Mal");
        Libro l4 = new Libro("123456786", "Programacion en Java 2da Edicion", "Dennis Ritchie", false, "Programacion", "P-201.2", "Bueno");
        Libro l5 = new Libro("123456785", "La Biblia", "VV. AA.", true, "Religion", "R-201.2", "Bueno");

        Socio s1 = new Socio("Un nombre", "Un lugar de la mancha", "123456789", 0);
        Socio s2 = new Socio("Juan", "Citadel", "123456788", 0);
        Socio s3 = new Socio("Alex", "Marte", "123456787", 0);

        Biblioteca b1 = new Biblioteca();
        Bibliotecario bi1 = new Bibliotecario("Juan Licea Gayosso", "Av Siempre Viva");

        Prestamo p1 = new Prestamo(l1, s1);
        
        System.out.println(p1.getFechaDeEntrega());
        p1.imprimirDatos();
        
        Date d1 = new Date();
        Date d2 = new Date(d1.getTime() * 5000000);
        Prestamo p2 = new Prestamo(d1, d2, l2, s2);
        p2.imprimirDatos();
        
        ArrayList<Libro> ls1 = new ArrayList();
        ls1.add(l1);
        ls1.add(l2);
        ls1.add(l3);
        ls1.add(l4);
        ls1.add(l5);
        
        Prestamo p3 = new Prestamo(ls1, s3);
        p3.imprimirDatos(0);

    }


}
