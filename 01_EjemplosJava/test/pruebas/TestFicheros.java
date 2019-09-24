package pruebas;

import Threads.HiloCrearFichero;
import org.junit.Test;

/**
 * @author Ainoa
 */
public class TestFicheros {
	
	public TestFicheros() {
	}

	@Test
	public void generacionFicheroAleatorio() {
		HiloCrearFichero.crearFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemplosJava\\texto_esp.txt");
	}
}
