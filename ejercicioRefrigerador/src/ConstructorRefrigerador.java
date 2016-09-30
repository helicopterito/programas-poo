
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Néstor Alvarado Moreno
 */
public class ConstructorRefrigerador {

    public static void main(String[] args) {

        Date fecha = new Date(2016, 9, 22);
        Date fechaa = new Date(2015, 11, 12, 20, 30, 0);
        System.out.println(fecha.toString());

        String str = String.format("Fecha y Hora actual : %tc", fecha);
        System.out.println(str);

        LocalDate fecha2 = LocalDate.of(2016, Month.SEPTEMBER, 21);
        System.out.println("Fecha2: " + fecha2);

        LocalDate fecha3 = LocalDate.of(2015, Month.DECEMBER, 22);
        System.out.println("fecha3: " + fecha3);

        System.out.println(fecha2.compareTo(fecha3));

        Seccion s1 = new Seccion("Heladera", 10, -20, 11, 200);

        Producto p1 = new Producto("Pizza Congelada", fecha, "Plastico", "Bueno", 2, 20, 0.2f, 100);
        Producto p2 = new Producto("Jugo", fecha, "Plastico", "Bueno", 2, 30, 0.2f, 300);

        ProductoCarne pc1 = new ProductoCarne(fechaa);

        pc1.calcularFechaCaducidad();

        ArrayList<Seccion> obj1 = new ArrayList<Seccion>();

        obj1.add(s1);
        System.out.println(obj1.getClass());

        Refrigerador refri2 = new Refrigerador("Asus", 500f, obj1);
        System.out.println(refri2.getSeccionesDelRefri().get(0).getIdentificador());

        refri2.getSeccionesDelRefri().get(0).getProductos().add(p1);
        System.out.println(refri2.getSeccionesDelRefri().get(0).getProductos().get(0).getNombre());
//usar el constructor adecuado
    }

}
