package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;

/** Singleton porque solo queremos un servicio por aplicaciones/servidor
 * @author Ainoa
 */
public class ServicioPersona {
	
	// <editor-fold defaultstate="collapsed" desc="Codigo patron de diseño Singleton">

	private static ServicioPersona instancia;
	
	private ServicioPersona() {
		personas = new ArrayList<>();
	}
	
	public static ServicioPersona getInstancia(){
		if(instancia == null)
			instancia = new ServicioPersona();
		return instancia;
	}//</editor-fold>
	
	private ArrayList<Persona> personas;
	
	public Persona addPersonas(String nombre, String edad)
		throws NumberFormatException, IOException, IllegalArgumentException{
			int intEdad = Integer.parseInt(edad);
			if (nombre.equals("") ){
				throw new IllegalArgumentException("El nombre esta vacio");
			}else if(nombre.length() < 2){
				throw new IllegalArgumentException("El nombre es demasiado corto");
			}else if(edad.equals("")){
				throw new NumberFormatException("La edad esta vacia");				
			}else{
				if (intEdad <= 12) {
					throw new IllegalArgumentException("La edad debe ser mayor que 12");
				}else{
					Persona p = new Persona(nombre, intEdad);
					personas.add(p);
					return p;
				}
			}
	}
	
	public Persona getPersona(String nombre){
		for (Persona p : personas){
			if(p.getNombre().equalsIgnoreCase(nombre)){
				return p;
			}
		}
		return null;
	}
}
