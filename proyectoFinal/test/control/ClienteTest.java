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
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void testGetNumeroDeCliente() {
        System.out.println("getNumeroDeCliente");
        Cliente instance = new Cliente();
        instance.setNumeroDeCliente(0);
        int expResult = 0;
        int result = instance.getNumeroDeCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetNumeroDeCliente() {
        System.out.println("setNumeroDeCliente");
        int numeroDeCliente = 0;
        Cliente instance = new Cliente();
        instance.setNumeroDeCliente(numeroDeCliente);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(numeroDeCliente, instance.getNumeroDeCliente());
    }
    
}
