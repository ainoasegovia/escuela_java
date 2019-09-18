/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import ejemplosjava.StringAux;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Ainoa
 */
public class TestStringAux {
	
	public TestStringAux() {
	}
	
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void probandoQuitarEspacios() {
		String texto = "En un lugar de la Mancha de cuyo nombre no quiero acordarme, vivia...";
		String texto2 = "En un lugar de Madrid...";
		String texto3 = "             en       un      LUGAR";
		
		String resultadoOK = "en un LUGAR";
		StringAux texto3sinEsp = new StringAux(texto3);
		String resultadoAux = texto3sinEsp.quitarEspacios(); // Futura llamada
		
		assertEquals(resultadoOK, resultadoAux);
		
		/*System.out.println("Hola");		
		assertTrue( 9 % 2 == 1 );
		
		System.out.println("Adios");
		assertFalse( 8 % 2 == 1 );

		System.out.println("Hola de nuevo");
		assertEquals("s".toUpperCase(), "A");*/
		
	}
}
