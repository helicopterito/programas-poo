
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uchitel
 */
public class Seccion {

    private String identificador;
    private float temperatura;
    private float temperaturaMinima;
    private float temperaturaMaxima;
    private float capacidad;
    private float capacidadEnUso;
    private ArrayList<Producto> productos;
    private int productosAlmacenados;

    public Seccion() {

    }

/*    public Seccion(String identificador, float temperatura, float temperaturaMinima, float temperaturaMaxima,
            float capacidad) {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.capacidad = capacidad;
    }
*/


    public Seccion(String identificador, float temperatura, float temperaturaMinima, float temperaturaMaxima,
            float capacidad) {

        this.identificador = identificador;
        this.temperatura = temperatura;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.capacidad = capacidad;
        this.productosAlmacenados = 0;
        this.productos = new ArrayList<>();
   
    }



    public void enfriar() {
        if (this.temperatura == this.temperaturaMinima) {
            System.out.println("No se puede disminuir la temperatura");
        }

        this.temperatura /= 2;
    }

    public void ajustarTemperatura() {

        char car;
        Scanner lector = new Scanner(System.in);

        System.out.println("Presione [W] para aumentar la temperatura\nPresione [S] para disminuir la temperatura");
        System.out.println("Presione [X] para salir");
        do {

            car = lector.next().charAt(0);

            if (car == 'W' || car == 'w') {

                if (this.temperatura == (this.temperaturaMaxima - 10)) {
                    System.out.println("No se puede calentar mas");
                } else {
                    System.out.println("Incrementando la temperatura");
                    System.out.println("Temperatura anterior = " + this.temperatura);
                    this.setTemperatura(this.getTemperatura() + 10);

                }

            } else if (car == 'S' || car == 's') {

                if (this.temperatura == (this.temperaturaMinima - 10)) {
                    System.out.println("No se puede enfriar mas");
                } else {
                    System.out.println("Disminuyendo la temperatura");
                    System.out.println("Temperatura anterior = " + this.temperatura);
                    this.setTemperatura(this.getTemperatura() - 10);

                }

            } else {
                break;

            }
            System.out.println("Temperatura actual = " + this.temperatura);

        } while (car != 'x' || car != 'X');
    }



    
    
    public void guardarProductoEnSeccion(Producto producto)
    {
        if (this.getCapacidadDisponible() >= (producto.getVolumenUnitario() * producto.getCantidad())) {
            this.capacidadEnUso += (producto.getVolumenUnitario() * producto.getCantidad());
            this.getProductos().add(producto);
            this.setProductosAlmacenados(this.getProductosAlmacenados() + 1);
        } else {
            System.out.println("Sin espacio disponible");
        }
    }

    private float getCapacidadDisponible() {
        
        return this.capacidad - this.capacidadEnUso;
    }

    public void sacarProducto(Producto producto) {
        if (this.capacidadEnUso - (producto.getVolumenUnitario() * producto.getCantidad()) < 0) {
            System.out.println("No se pueden sacar mas productos");
        } else {
            this.capacidadEnUso -= (producto.getVolumenUnitario() * producto.getCantidad());
        }
    }

    public void pedirProductos() {
        if (this.capacidadEnUso == 0) {
            System.out.println("Necesito productos, estoy vacio");
        } else {
            System.out.println("No se necesitan productos");
        }

    }
    

    
    public void verProductosPorPedir()
    {
        int contador = 0;
        for(Producto p : this.getProductos())
        {
            if(p.avisoReemplazo())
            {
                contador++;
                System.out.println("El producto " + p.getNombre() + " necesita reabastecerse");
            }
        }
        System.out.println("Total de productos por solicitar: " + contador);
    }
    
    public void listarProducto()
    {
        int i = 0;
        for(Producto p: this.getProductos())
        {
            System.out.println("Nombre del producto: " + p.getNombre() + "Numero: " + i);
            i++;
        }
    }
    
    public void sacarProducto()
    {
        
        Scanner lector = new Scanner(System.in);
        
        this.listarProducto();
        System.out.println("Cual producto desea sacar?\nRespuesta: ");
        this.getProductos().remove(lector.nextInt());
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public float getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(float temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public float getCapacidadEnUso() {
        return capacidadEnUso;
    }

    public void setCapacidadEnUso(float capacidadEnUso) {
        this.capacidadEnUso = capacidadEnUso;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getProductosAlmacenados() {
        return productosAlmacenados;
    }

    public void setProductosAlmacenados(int productosAlmacenados) {
        this.productosAlmacenados = productosAlmacenados;
    }

}

