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

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Néstor A. M. alvarado.nestor@yandex.com
 */
public class AlquilerTest {
    
    public AlquilerTest() {
    }

    @Test
    public void testGetAuto() {
        System.out.println("getAuto");
        Alquiler instance = new Alquiler();
        Automovil expResult = new Automovil();
        Automovil result = instance.getAuto();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetAuto() {
        System.out.println("setAuto");
        Automovil auto = new Automovil();
        Alquiler instance = new Alquiler();
        
        instance.setAuto(auto);
        assertEquals(auto, instance.getAuto());
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Alquiler instance = new Alquiler();
        Cliente expResult = new Cliente();
        instance.setUsuario(expResult);
        Cliente result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Cliente usuario = new Cliente();
        Alquiler instance = new Alquiler();
        instance.setUsuario(usuario);
        assertEquals(usuario, instance.getUsuario());
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Alquiler instance = new Alquiler();
        Date expResult = new Date();
        instance.setFechaInicio(expResult);
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = new Date();
        Alquiler instance = new Alquiler();
        instance.setFechaInicio(fechaInicio);
        assertEquals(fechaInicio, instance.getFechaInicio());
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Alquiler instance = new Alquiler();
        Date expResult = new Date();
        instance.setFechaFin(expResult);
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = new Date();
        Alquiler instance = new Alquiler();
        instance.setFechaFin(fechaFin);
        assertEquals(fechaFin, instance.getFechaFin());
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetNumeroDeAlquiler() {
        System.out.println("getNumeroDeAlquiler");
        Alquiler instance = new Alquiler();
        int expResult = 0;
        instance.setNumeroDeAlquiler(expResult);
        int result = instance.getNumeroDeAlquiler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumeroDeAlquiler() {
        System.out.println("setNumeroDeAlquiler");
        int numeroDeAlquiler = 0;
        Alquiler instance = new Alquiler();
        instance.setNumeroDeAlquiler(numeroDeAlquiler);
        assertEquals(numeroDeAlquiler, instance.getNumeroDeAlquiler());
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIncidente() {
        System.out.println("getIncidente");
        Alquiler instance = new Alquiler();
        String expResult = "";
        instance.setIncidente("");
        String result = instance.getIncidente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIncidente() {
        System.out.println("setIncidente");
        String incidente = "";
        Alquiler instance = new Alquiler();
        instance.setIncidente(incidente);
        assertEquals(incidente, instance.getIncidente());
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Alquiler instance = new Alquiler();
        boolean expResult = false;
        instance.setEstado(false);
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Alquiler instance = new Alquiler();
        instance.setEstado(estado);
        assertEquals(estado, instance.getEstado());
        //fail("The test case is a prototype.");
    }
    
}
