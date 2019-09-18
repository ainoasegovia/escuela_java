package ejemplosjava;

/**
 * @author Ainoa
 */

public class StringAux{

	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public StringAux(String string) {
		this.string = string;
	}
	
	public String quitarEspacios(){
		return quitarEspacios(string);
	}
	public int contarPalabras(){
		return contarPalabras(string);
	}
	public static String quitarEspacios1(String texto){
		// Recorrer caracter a caracter quitando los espacios
		String resultado = "";
		texto = texto.trim();
		for (int i = 0; i < texto.length(); i ++){
			if(texto.charAt(i) != ' '){
				resultado += texto.charAt(i);
			}else if(i < texto.length() - 1){ //Si es espacio
				if(texto.charAt(i + 1) != ' ')
					resultado += ' ';
			}
		}
		return resultado; // Hardcodeado
	}
	public static String quitarEspacios2(String texto){
		texto = texto.trim();
		String[] palabras = texto.split(" ");
		String resultado = "";
		for(String palabra : palabras){
			if(! palabra.isEmpty())
				resultado += palabra + " ";
		}
		return resultado.trim(); 
	}
	public static String quitarEspacios(String texto){
		texto = texto.trim();
		String resultado = "";
		while(texto.contains("   ")){
			texto = texto.replace("  ", " ");
		}
		return texto; 
	}
	public static int contarPalabras(String texto){
		return 0;
	}
	
}
