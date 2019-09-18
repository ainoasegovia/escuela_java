package ejemplosjava;
/**
 * @author Ainoa
 */
public class CocheRally extends Coche {
	private float rozamiento;

	public CocheRally(String marca, TipoCarburante carburante, TipoColor color,float roz){
		super(marca,carburante,color); // Invocamos al constructor de la clase que hereda en este caso Coche
		this.rozamiento = roz;
	}	
	
	// Sobrecarga de constructor
	public CocheRally(String marca, TipoCarburante carburante, String color,float roz){ // Invocamos al constructor de la clase que hereda en este caso Coche
		super(marca,carburante,color);
		this.rozamiento = roz;
	}	
	
	public void derrapar(){
		System.out.println("Derrapeeeeee!!!");
		super.explosionCilindro();
	}
	
	// Sobrecarga de metodo
	public void derrapar(float cuanto){
		System.out.println("Derrapeeeeee de " + cuanto + " newtons!");
		super.explosionCilindro();
	}
	
	// Sobreescritura de metodo
	@Override
	public void acelerar(){
		System.out.println("Acelerando a tope!!!!!");
		if (this.isArrancado())  
			super.acelerar();
			setNivDeposito(getNivDeposito() - .4);
			//nivDeposito -= 0.1;
			explosionCilindro();
	}
	public float getRozamiento() {
		return rozamiento;
	}

	public void setRozamiento(float rozamiento) {
		this.rozamiento = rozamiento;
	}
}
