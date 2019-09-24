package Threads;

import ClasesJava.StringAux;

/**
 * @author Ainoa
 */
public class HiloFichStrAuxV1 extends HiloFichero {

	public HiloFichStrAuxV1(IQuitarEspacios strAux) {
		super(strAux);
	}
	
	@Override
    protected String quitarEspacios(String s) {      
		//return strAux.quitarEspacios(s);
        return StringAux.quitarEspacios1(s);
    }

}
