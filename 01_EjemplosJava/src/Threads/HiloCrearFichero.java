package Threads;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ainoa
 */
public class HiloCrearFichero {
	
	public static void crearFicheroEjem(String rutaFich) /*throws IOException*/ {
		//String[] palabras = {"Aaaaa", "Bbbbb", "Ccccc", "Ddddd"};
		String[] palabras = new String['Z' - 'A' + 1];
		Random r = new Random(new Date().getTime());
		
		for(char c = 'A'; c < 'Z' + 1;c++){
			int repe = 2 + Math.abs(r.nextInt() % 8); // Numero entre 2 y 9
			palabras[c - 'A'] = "";
			for(int i = 0; i< repe; i++)
				palabras[c - 'A'] += "" + c;
		} 
		
		System.out.println("> " + Arrays.toString(palabras));
		
		//////////////////// CREAR FICHERO ////////////////////
		
		FileWriter fich = null; // No le damos valor todavia
		
		try{
			fich = new FileWriter(rutaFich, false);
			
			for(int i = 0; i < 2000000; i++){
				// Numero aleatorio entre 0 y 2 (3-1)
				if(r.nextInt(2) == 0)
					fich.write(palabras[r.nextInt(palabras.length)]);
				
				if(r.nextInt(2) == 0)
					for(int j = 0; j < 5; j++)
						fich.write(" ");
				
				if(r.nextInt(12) == 0)
					fich.write("\n\r");
			}
		} catch(IOException ex){
			System.err.println("Error en escritura: " + ex.getMessage());
		} catch(Exception ex){
			System.err.println("Otro error: " + ex.getMessage());
		} finally{
			try {
				fich.close();
			} catch (IOException ex) {
				Logger.getLogger(HiloCrearFichero.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		
	}
}
