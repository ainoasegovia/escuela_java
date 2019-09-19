package POO;
/**
 * @author Ainoa
 */
public class Moto extends Vehiculo implements Rodable {
	
	public static final byte RUEDAS = 2;
	
	public Moto(String marca){
		super(marca,"SIN MATRICULAR");
	}
	
	@Override
	public void abrirPuerta() {
		System.out.println("Loco, no hay puertas, no te tires...");
	}	

	@Override
	public void acelerar() {
		System.out.println("Moto " + getMatricula() + " acelerando");
	}

	@Override
	public byte getNumRuedas() {
		return RUEDAS;
	}

	@Override
	public void moverse() {
		System.out.println("Moviendo motillo " + toString());
	}

}
