package pruebas;

import ejemplosjava.Coche;
import ejemplosjava.CocheRally;
import ejemplosjava.TipoCarburante;
import ejemplosjava.TipoColor;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ainoa
 */
public class TestColecciones {
	
	@Test
	public void arrays() {
		Coche[] coches = new Coche[3]; // Coche coches[];
		
		coches[0] = new Coche("Skoda",TipoCarburante.ELECTRICO,TipoColor.PLATEADO);
		coches[1] = new Coche("Ferrari",TipoCarburante.DIESEL,TipoColor.BLANCO);
		coches[2] = new Coche("Seat",TipoCarburante.GASOLINA,TipoColor.NEGRO);
		
		//Coche[] coches1 = { coches[2], coches[1], coches[0]}; // Copia inversa del otro array
		
		Coche[] cochesBis = { coches[2],
			coches[1], 
			new Coche("Skoda",TipoCarburante.ELECTRICO,TipoColor.PLATEADO)
		};
		
		Coche elMio = new Coche("Skoda",TipoCarburante.ELECTRICO,TipoColor.PLATEADO);
		elMio = coches[2];
		elMio.setArrancado(true);
		elMio.acelerar();
		
		//////////////////
	
		coches[2].mostrar();
		
		// ARRAYLIST 
		
		ArrayList arrayListObj = new ArrayList();
		arrayListObj.add(45);
		arrayListObj.add("Aaaaaaa");
		arrayListObj.add(elMio);
		arrayListObj.add(false);

		for (Object obj : arrayListObj){
			System.out.println("OBJ: " + obj);
		}
		
		// ARRAY GENERICO,se genera a partir de otra clase
		
		ArrayList<Integer> ventasAnuales = new ArrayList<Integer>(); // Integer tiene metodos estaticos, es un objeto
		Integer objEntero = new Integer(200);
		objEntero.longValue();
		ventasAnuales.add(objEntero);
		ventasAnuales.add(3000000);
		//ventasAnuales.add("Aaaaaa"); NO SE PUEDE
		
		ArrayList<Coche> cochesVender = new ArrayList<>();
		cochesVender.add(new Coche("Kia",TipoCarburante.DIESEL,TipoColor.VERDE));
		cochesVender.add(coches[0]); // Coches que existen
		cochesVender.add(coches[1]); // Coches que existen
		cochesVender.add(coches[2]); // Coches que existen
		//cochesVender.add("NO SE PUEDE"); // NO SE PUEDE

		cochesVender.add(new CocheRally("Ford"));
		
		if(cochesVender.contains(coches[0])){
			System.out.println("El coche existe");
		}
		
		//TestColecciones.mostrarCoche(elMio); // Lo invocamos nosotros
		cochesVender.forEach(TestColecciones::mostrarCoche);
				/*(coche) -> { // Funcion Lamda/flecha/anonima
					System.out.println(" -> " + coche.toString());
				}
		);*/
	}
	
	public static void mostrarCoche(Coche coche){
		System.out.println(" -> " + coche.toString());
	}
}
