/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ConstructorPersona {
    
    public static void main(String[] args) {
        Persona nestor = new Persona();
        
        nestor.setAltura((float)1.6);
        nestor.setColorDeOjos("blanco");
        nestor.setFechaNacimiento("11 de Agosto de 1994");
        nestor.setNombre("Nestor");
        nestor.setaPaterno("Vissarionov");
        nestor.setaMaterno("Ktoto");
        nestor.setPeso((float)51.5);
        nestor.setGenero('H');
        
        System.out.println(nestor.getNombre() + " mide " + nestor.getAltura() + " metros");
        System.out.println(nestor.getNombre() + " nacio el " + nestor.getFechaNacimiento());
        System.out.println(nestor.getNombre() + " tiene ojos color " + nestor.getColorDeOjos());
        
        Persona lalo = new Persona("Lalo", "Madariaga", "del Rio", "Cafe", "un dia hace muchos años", (float)70.0, (float)1.8, 19, 'H');
        
        System.out.println(lalo.getNombre() + " mide " + lalo.getAltura() + " metros");
        System.out.println(lalo.getNombre() + " nacio el " + lalo.getFechaNacimiento());
        System.out.println(lalo.getNombre() + " tiene ojos color " + lalo.getColorDeOjos());
        
        
        System.out.println();
        nestor.jugar("CS:GO");
        nestor.contar();
        nestor.getNombreAlreves();
        lalo.compararEdad(nestor);
        nestor.compararEdad(lalo);
        System.out.println();
        
        Persona superlatosa = new Persona("Fernanda", "Aguilera", "Mc", "Cafe", "Hace 18 años", (float) 60.0, (float)1.6,
        20, 'M');
        
        //Persona bebe1 = nestor.reproducirse(superlatosa);
        Persona bebe2 = superlatosa.reproducirse(nestor);
        
       // System.out.println(bebe1.getNombre() + "\n" + bebe1.getaPaterno() + "\n" + bebe1.getaMaterno());
        System.out.println(bebe2.getNombre() + " " + bebe2.getaPaterno() + " " + bebe2.getaMaterno());
    }
    
}
