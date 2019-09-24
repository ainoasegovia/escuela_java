package Threads;

import ClasesJava.StringAux;

/**
 * @author Ainoa
 */
public class HiloFichStrAuxV2 extends HiloFichero {

	public HiloFichStrAuxV2(IQuitarEspacios strAux) {
		super(strAux);
	}
	

	@Override
    protected String quitarEspacios(String s) {
		//return strAux.quitarEspacios(s);
        return StringAux.quitarEspacios2(s);
    }

}
