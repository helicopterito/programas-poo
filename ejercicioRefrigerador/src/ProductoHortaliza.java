/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Néstor Alvarado Moreno
 */
public class ProductoHortaliza extends Producto{
    
    private String fechaRecomendacion; // a que se refiere? cu[ales son sus metodos?
    
    public ProductoHortaliza()
    {
        super();
    }

    public String getFechaRecomendacion() {
        return fechaRecomendacion;
    }

    public void setFechaRecomendacion(String fechaRecomendacion) {
        this.fechaRecomendacion = fechaRecomendacion;
    }
    
}
