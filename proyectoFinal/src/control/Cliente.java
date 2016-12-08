package control;

import visual.VentanaPrincipal;

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
public class Cliente extends Persona{

    //para identificar al cliente
    private int numeroDeCliente;
    
   
    //constructor con todos los atributos inicializados
    public Cliente(String nombre, String aPaterno, String aMaterno, String direccion) {
        super(nombre, aPaterno, aMaterno, direccion);
        this.numeroDeCliente = (VentanaPrincipal.listaDeClientes.size() + 1);
    }

    public Cliente() {
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
    
    
    
}
