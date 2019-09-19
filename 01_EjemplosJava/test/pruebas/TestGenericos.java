package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author Ainoa
 */
public class TestGenericos {
	
	@Test
	public void metodosGenericos() {
		ArrayList<Integer> listaInt = new ArrayList<>();
		insertarDobleGenerico(listaInt, 10);
		insertarDobleGenerico(listaInt, 20);
		System.out.println("Enteros: " + listaInt.toString());
		
		ArrayList<String> listaStr = new ArrayList<>();
		insertarDobleGenerico(listaStr, "Texto 1");
		insertarDobleGenerico(listaStr, "Texto 2");	
		//insertarDobleGenerico(listaStr, 30); NO SE PUEDE

		System.out.println("Textos: " + listaStr.toString());
		
		mostrarDatos(listaStr.toArray());
		
		Float[] arrayF = {1.2f, 1.5f, 2.8f};
		ArrayList<Float> listaF = convertir(arrayF);
		mostrarDatos(listaF.toArray());
	}
	
	// PLANTILLAS QUE SE BASA EN EL <TIPO> (TEMPLATES)
	
	public static<Tipo> void insertarDobleGenerico(ArrayList<Tipo> lista, Tipo valor){ // Coge el valor del Tipo que es el ArrayList
		lista.add(valor);
		lista.add(valor);
	}
	public static<Tipo> void mostrarDatos(Tipo[] array){ // Pide un array de lo que haya indicado el usuario
		System.out.println(" ");
		for (Tipo obj : array){
			System.out.println(" - " + obj.toString());
		}
	}
	
	public static<Tipo> ArrayList<Tipo> convertir1(Tipo[] array){
		ArrayList<Tipo> listaArray = new ArrayList<>();
		System.out.println(" ");

		listaArray.addAll(Arrays.asList(array));
		
		return listaArray;
	}
	public static<Tipo> ArrayList<Tipo> convertir(Tipo[] array){
		ArrayList<Tipo> listaArray = new ArrayList<>();
		System.out.println(" ");

		for(Tipo obj : array)
			listaArray.add(obj);
		 		
		return listaArray;
	}
	/*
	public static void insertarDobleGenerico(ArrayList<Integer> lista, Integer valor){ // Coge el valor del Tipo que es el ArrayList
		lista.add(valor);
		lista.add(valor);
	}
	
	public static void insertarDobleGenerico(ArrayList<String> lista, String valor){ // Coge el valor del Tipo que es el ArrayList
		lista.add(valor);
		lista.add(valor);
	}*/
}
