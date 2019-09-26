package com.sinensia.modelo.servicios;

import com.sinensia.modelo.Persona;
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
	
	public void addPersonas(String nombre, String edad){
		//try {
			int intEdad = Integer.parseInt(edad);
			if (intEdad > 12 && !nombre.equals("")) {
				Persona p = new Persona(nombre, intEdad);
				personas.add(p);
			}
		/*} catch (NumberFormatException numberFormatException) {
		}*/
	}
}
