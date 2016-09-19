/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class ProductoCarne extends Producto{
    
    private String fechaCaducidad; // si compre la carne con el carnicero?
    private String fechaRecomendaDeConsumo;
    
    public ProductoCarne(String fechaCaducidad, String fechaRecomendaDeConsumo)
    {
        super();
        this.fechaCaducidad = fechaCaducidad;
        this.fechaRecomendaDeConsumo = fechaRecomendaDeConsumo;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaRecomendaDeConsumo() {
        return fechaRecomendaDeConsumo;
    }

    public void setFechaRecomendaDeConsumo(String fechaRecomendaDeConsumo) {
        this.fechaRecomendaDeConsumo = fechaRecomendaDeConsumo;
    }
    
}
