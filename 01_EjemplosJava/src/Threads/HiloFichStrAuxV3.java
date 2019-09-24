package Threads;

import ClasesJava.StringAux;

/**
 * @author Ainoa
 */
public class HiloFichStrAuxV3 extends HiloFichero {

	public HiloFichStrAuxV3(IQuitarEspacios strAux) {
		super(strAux);
	}

	@Override
    protected String quitarEspacios(String s) {
        return StringAux.quitarEspacios3(s);
    }

}
