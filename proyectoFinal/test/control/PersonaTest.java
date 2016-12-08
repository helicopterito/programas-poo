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
public class PersonaTest {
    
    public PersonaTest() {
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testGetaPaterno() {
        System.out.println("getaPaterno");
        Persona instance = new Persona();
        instance.setaPaterno("");
        String expResult = "";
        String result = instance.getaPaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetaPaterno() {
        System.out.println("setaPaterno");
        String aPaterno = "";
        Persona instance = new Persona();
        instance.setaPaterno(aPaterno);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(aPaterno, instance.getaPaterno());
    }

    @Test
    public void testGetaMaterno() {
        System.out.println("getaMaterno");
        Persona instance = new Persona();
        instance.setaMaterno("");
        String expResult = "";
        String result = instance.getaMaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetaMaterno() {
        System.out.println("setaMaterno");
        String aMaterno = "";
        Persona instance = new Persona();
        instance.setaMaterno(aMaterno);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(aMaterno, instance.getaMaterno());
    }

    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Persona instance = new Persona();
        instance.setDireccion("");
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Persona instance = new Persona();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(direccion, instance.getDireccion());
    }
    
}
