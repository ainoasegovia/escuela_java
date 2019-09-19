package POO;
/**
 * @author Ainoa
 */
public class Pelota implements Rodable{

	@Override
	public byte getNumRuedas() {
		return 1;
	}

	@Override
	public void moverse() {
		System.out.println("Bota y rueda");
	}

}
