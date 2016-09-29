
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

        Refrigerador refri = new Refrigerador("Alienware", 1.9f);

        Seccion s1 = new Seccion("Heladera", 10, -20, 11, 200, "hola");

        refri.setSeccion(s1);
        //refri.secciones[0].ajustarTemperatura();

        Producto p1 = new Producto("Pizza Congelada", fecha, "Plastico", "Bueno", 2, 20, 0.2f, 100);
        Producto p2 = new Producto("Jugo", fecha, "Plastico", "Bueno", 2, 30, 0.2f, 300);

        //refri.secciones[0].almacenarProducto(p1);
        refri.secciones[0].guardarProducto(p1, 0);
        refri.secciones[0].guardarProducto(p2, 1);
        System.out.println(refri.secciones[0].productos[0].getNombre());
        System.out.println(refri.secciones[0].productos[1].getNombre());

        ProductoCarne pc1 = new ProductoCarne(fechaa);

        pc1.calcularFechaCaducidad();

        refri.secciones[0].almacenarProducto(p1);

        System.out.println(fecha.compareTo(fechaa));
        refri.secciones[0].pedirProductos();
        System.out.println("****************");
        refri.revisarInventario();
        refri.secciones[0].productos[0].setContenidoActual(0);
        System.out.println("****************");
        refri.revisarInventario();
        
        /*
        
        
        	  ArrayList<String> obj = new ArrayList<>();

	  
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");

	  
	  System.out.println("Currently the array list has following elements:"+obj);

	  
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  
	  obj.remove("Chaitanya");
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  
	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);*/
          
          ArrayList<Seccion> obj1 = new ArrayList<Seccion>();
          
          obj1.add(s1);
          System.out.println(obj1.getClass());
          
          Refrigerador refri2 = new Refrigerador("Asus", 500f, obj1);
          System.out.println(refri2.seccionesDelRefri.get(0).getIdentificador());
         
          System.out.println(refri2.seccionesDelRefri.get(0).productosGuardados.size());
//usar el constructor adecuado
    }

}
