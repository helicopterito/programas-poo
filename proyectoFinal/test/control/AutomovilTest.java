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
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Néstor A. M. alvarado.nestor@yandex.com
 */
public class AutomovilTest {
    
    public AutomovilTest() {
    }

    @Test
    public void testGetKilometraje() {
        System.out.println("getKilometraje");
        Automovil instance = new Automovil();
        instance.setKilometraje(0.0);
        double expResult = 0.0;
        double result = instance.getKilometraje();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetKilometraje() {
        System.out.println("setKilometraje");
        double kilometraje = 0.0;
        Automovil instance = new Automovil();
        instance.setKilometraje(kilometraje);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(kilometraje, instance.getKilometraje(), 0.0);
    }

    @Test
    public void testEstaDisponible() {
        System.out.println("estaDisponible");
        Automovil instance = new Automovil();
        instance.setDisponible(false);
        boolean expResult = false;
        boolean result = instance.estaDisponible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        boolean disponible = false;
        Automovil instance = new Automovil();
        instance.setDisponible(disponible);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(disponible, instance.estaDisponible());
    }

    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Automovil instance = new Automovil();
        instance.setMarca("");
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Automovil instance = new Automovil();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(marca, instance.getMarca());
    }

    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Automovil instance = new Automovil();
        instance.setModelo("");
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Automovil instance = new Automovil();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("", instance.getModelo());
    }

    @Test
    public void testGetEstadoActual() {
        System.out.println("getEstadoActual");
        Automovil instance = new Automovil();
        instance.setEstadoActual("");
        String expResult = "";
        String result = instance.getEstadoActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetEstadoActual() {
        System.out.println("setEstadoActual");
        String estadoActual = "";
        Automovil instance = new Automovil();
        instance.setEstadoActual(estadoActual);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(estadoActual, instance.getEstadoActual());
    }

    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Automovil instance = new Automovil();
        instance.setPlaca("");
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String placa = "";
        Automovil instance = new Automovil();
        instance.setPlaca(placa);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(placa, instance.getPlaca());
    }
    
}
