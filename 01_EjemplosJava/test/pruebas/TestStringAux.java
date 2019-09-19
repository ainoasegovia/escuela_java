package pruebas;

import ClasesJava.StringAux;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Ainoa
 */
public class TestStringAux {
	
	@Test
	public void probandoQuitarEspacios() {
		String texto = "En un lugar de la Mancha de cuyo nombre no quiero acordarme, vivia...";
		String texto2 = "En un lugar de Madrid...";
		String texto3 = "             en       un      LUGAR";
		
		String resultadoOK = "en un LUGAR";
		StringAux texto3sinEsp = new StringAux(texto3);
		String resultadoAux = texto3sinEsp.quitarEspacios(); // Futura llamada
		
		assertEquals(resultadoOK, resultadoAux);
		
		assertEquals("En un lugar de Madrid...", 
                StringAux.quitarEspacios("En un lugar de Madrid...") );
        assertEquals("En un lugar de Madrid...", 
                StringAux.quitarEspacios("    En un lugar de Madrid...") );
        assertEquals("En un lugar de Madrid...", 
                StringAux.quitarEspacios("En un    lugar de Madrid...   ") );
	}
	
	@Test
    public void probandoContarPalabras() {
        assertEquals(5,  StringAux.contarPalabras("En un lugar de Madrid...") );
        assertEquals(3,  StringAux.contarPalabras("        en   un     LUGAR    "));
        assertEquals(0,  StringAux.contarPalabras("        "));
        assertEquals(1,  StringAux.contarPalabras("aaaaaaa"));
    }
}
