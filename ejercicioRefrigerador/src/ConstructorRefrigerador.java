
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
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
        
        Date fecha = new Date();
        System.out.println(fecha.toString());
        
        String str = String.format("Fecha y Hora actual : %tc", fecha);
        System.out.println(str);
        
        
        LocalDate fecha2 = LocalDate.of(2016, Month.SEPTEMBER, 21);
        System.out.println("Fecha2: " + fecha2);
        
        
        LocalTime fecha3 = LocalTime.of(20, 26);
        System.out.println("fecha3: " + fecha3);
        
        
        
        Refrigerador refri = new Refrigerador("Alienware", 1.9f, 2);
        
        Seccion s1 = new Seccion("Heladera", 10, -20, 11, 200);
        
        refri.setSeccion(s1, 0);
        refri.secciones[0].ajustarTemperatura();
        
        Producto p1 = new Producto("Pizza Congelada", fecha, "Plastico", "Bueno", 2, 200, 0.2f);
        
        refri.secciones[0].almacenarProducto(p1);
        
        
        
    }
    
}
