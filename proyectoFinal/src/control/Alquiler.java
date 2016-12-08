package control;

import java.util.Date;


/*
 * Copyright (C) 2016 Néstor A. M. alvarado.nestor@yandex.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Néstor A. M. alvarado.nestor@yandex.com
 */
public class Alquiler {
    
    private Automovil auto;
    private Cliente usuario;
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroDeAlquiler;
    private String incidente;
    private boolean estado;

    public Alquiler() {
    }


    

//constructior con todos los atributos inicializados
    public Alquiler(Automovil auto, Cliente usuario, Date fechaInicio, Date fechaFin, int numeroDeAlquiler) {
        this.auto = auto;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroDeAlquiler = numeroDeAlquiler;
        this.incidente = "";
    }

    //getters y setters

    public Automovil getAuto() {
        return auto;
    }

    public void setAuto(Automovil auto) {
        this.auto = auto;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroDeAlquiler() {
        return numeroDeAlquiler;
    }

    public void setNumeroDeAlquiler(int numeroDeAlquiler) {
        this.numeroDeAlquiler = numeroDeAlquiler;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
