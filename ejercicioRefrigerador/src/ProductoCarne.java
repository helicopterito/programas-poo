
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
public class ProductoCarne extends Producto {

    private Date fechaCaducidad; // si compre la carne con el carnicero?
    private Date fechaRecomendaDeConsumo;

    public ProductoCarne(Date fechaCaducidad, Date fechaRecomendaDeConsumo) {
        super();
        this.fechaCaducidad = fechaCaducidad;
        this.fechaRecomendaDeConsumo = fechaRecomendaDeConsumo;
    }

    public ProductoCarne(Date fechaDeCaducidad) {
        super();
        this.fechaCaducidad = fechaDeCaducidad;
    }

    public void calcularFechaCaducidad() {

        Date fechaHoy = new Date();
        if (this.fechaCaducidad.compareTo(fechaHoy) < 0) {
            System.out.println("El producto ya caduco. Es necesario sacarlo del refrigerador");
        } else {
            System.out.println("Quedan " + (int) (fechaCaducidad.getTime() - fechaHoy.getTime()) / (1000 * 60 * 60 * 24)
                    + " dias para que caduque");
        }
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaRecomendaDeConsumo() {
        return fechaRecomendaDeConsumo;
    }

    public void setFechaRecomendaDeConsumo(Date fechaRecomendaDeConsumo) {
        this.fechaRecomendaDeConsumo = fechaRecomendaDeConsumo;
    }

}
