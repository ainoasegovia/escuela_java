package pruebas;

import POO.Coche;
import POO.CocheRally;
import POO.Pelota;
import POO.TipoCarburante;
import POO.TipoColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Ainoa
 */
public class TestColecciones {
	
	//@Test
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
		
		System.out.println(" ");
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
			System.out.println("\nEl coche existe");
		}
		
		//TestColecciones.mostrarCoche(elMio); // Lo invocamos nosotros
		System.out.println("");
		cochesVender.forEach(TestColecciones::mostrarCoche);
				/* cochesVender.forEach(
								(coche) -> { // Funcion Lambda/flecha/anonima
									System.out.println(" -> " + coche.toString());
								}
				);*/
	}
	
	public static void mostrarCoche(Coche coche){
		System.out.println("-> " + coche.toString());
	}
	
	//@Test
	public void sets(){
		HashSet<Pelota> pelotas = new HashSet<>();
		Pelota p1 = new Pelota();
		pelotas.add(p1);
		Pelota p2 = new Pelota();
		pelotas.add(p2);
		Pelota p3 = new Pelota();
		pelotas.add(p3);
		
		pelotas.add(p2);
		pelotas.add(p3);
		
		System.out.println("Set pelotas: " + pelotas);
		assertEquals(pelotas.size(), 3);
		
		for(Pelota p : pelotas){
			System.out.println(p.toString());
		}	
	}
	@Test
	public void maps(){
		HashMap<String,Boolean> coloresCalidos = new HashMap<>();
		coloresCalidos.put("NEGRO", Boolean.FALSE);
		coloresCalidos.put("AZUL", true);
		coloresCalidos.put("VERDE", false);
		coloresCalidos.put("AMARILLO", false);
		coloresCalidos.put("ROJO", true);
		
		if(coloresCalidos.get("ROJO")){
			System.out.println("Rojo es calido");
		}
		if(coloresCalidos.get("VERDE")){
			System.out.println("Verde es calido");
		}
		System.out.println("AZUL es " + coloresCalidos.get("AZUL"));
		
		coloresCalidos.put("AMARILLO",false);
		System.out.println("AMARILLO es " + coloresCalidos.get("AMARILLO"));
	}
}
