
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
public class ProductoHortaliza extends Producto{
    
    private Date fechaRecomendacion; // a que se refiere? cu[ales son sus metodos?
    
    public ProductoHortaliza()
    {
        super();
    }

    public Date getFechaRecomendacion() {
        return fechaRecomendacion;
    }

    public void setFechaRecomendacion(Date fechaRecomendacion) {
        this.fechaRecomendacion = fechaRecomendacion;
    }
    
}
