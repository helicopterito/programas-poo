package codigo;
import java.util.Date;

/**
 * 
 */
public class Prestamo {

    /**
     * Default constructor
     */


    private Date fechaDePrestamo;
    private Date fechaDeEntrega;
    private String codigoDeLibro;
    private String numeroDeSocio;
    

    public Prestamo(Date fechaDePrestamo, Date fechaDeEntrega, String codigoDeLibro, String numeroDeSocio) {
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.codigoDeLibro = codigoDeLibro;
        this.numeroDeSocio = numeroDeSocio;
    }

    public Date getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(Date fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public String getCodigoDeLibro() {
        return codigoDeLibro;
    }

    public void setCodigoDeLibro(String codigoDeLibro) {
        this.codigoDeLibro = codigoDeLibro;
    }

    public String getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(String numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }



}