package ClasesJava;
/**
 * @author Ainoa
 */
public class ProbandoString {
	public static void tratarCadenas(){
		String texto = "En un lugar de la Mancha de cuyo nombre no quiero acordarme, vivia...";
		String texto2 = "En un lugar de Madrid...";
		String texto3 = "             en       un      LUGAR";

		System.out.println(texto);
		
		// CHARAT
		System.out.println("\nCuarta letra: " + texto.charAt(3));
		
		// COMPARETO
		
		System.out.println("Comparacion: " + texto.compareTo(texto2));
		
		texto2 = texto2.substring(0, 10);
		System.out.println("Texto2 ahora es: " + texto2);
		
		// CONTAINS
		if(texto.contains(texto2))
			System.out.println("El texto contiene texto2");
		else
			System.out.println("El texto NO contiene texto2");
		
		// INDEX OF
		System.out.println("\"Mancha\" esta en la posicion: " + texto.indexOf("Mancha"));
		
		// REPLACE
		texto = texto.replace("lugar", "campo");
		System.out.println(texto);
		
		// TOUPPERCASE Y TRIM (QUITA ESPACIOS EXTERIORES EL TRIM)
		texto3 = texto3.toUpperCase().trim();
		System.out.println(texto3);
				
	}

}
