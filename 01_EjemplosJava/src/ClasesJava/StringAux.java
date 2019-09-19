package ClasesJava;

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
	public static String quitarEspacios3(String texto){
		texto = texto.trim();
		while(texto.contains("  ")){
			texto = texto.replace("  ", " ");
		}
		return texto; 
	}
	public static String quitarEspacios(String texto){
		return texto.trim().replaceAll(" +", " "); // El caracter anterior repetido una o mas veces
	}
	public static int contarPalabras1(String texto) {
        texto = texto.trim();
		
        if (texto.isEmpty())
            return 0;
        else
            return quitarEspacios(texto).split(" ").length;
    }
    public static int contarPalabras2(String texto) {
        int contador = 1;
        texto = quitarEspacios(texto);
        texto = texto.trim();
		
        if (texto.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == ' ' ) 
                    contador++;
            }
        }
		
        return contador;
    }
    public static int contarPalabras(String texto) {
        int contador = 1;
        
        texto = texto.trim();
		
        if (texto.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < texto.length() - 1; i++) {
                if (texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' ') 
                    contador++;
            }
        }
		
        return contador;
    }
	
}
