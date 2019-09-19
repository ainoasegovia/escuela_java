package ejemplosjava;

import ClasesJava.ProbandoString;
import POO.Coche;
import POO.CocheRally;
import POO.TipoCarburante;
import POO.TipoColor;

/**
 * @author Ainoa
 */
public class Main {

    public static void main(String[] args) {
		//ProbandoString.tratarCadenas();
		mainCoches(args);
	}
	public static void mainCoches(String[] args) {
        Coche miCoche;
        
        //miCoche = new Coche("Kia",TipoCarburante.DIESEL,TipoColor.VERDE); // La instanciacion se hace con new
        miCoche = new Coche("Kia",TipoCarburante.GASOLINA,"Rojo"); // La instanciacion se hace con new

        miCoche.echarCarburante(30); // Empezamos con medio deposito
        
		System.out.println("Todos los coches tienen: " + Coche.CAPACIDAD_DEPOSITO);
        System.out.println("Marca coche: " + miCoche.getMarca());
        System.out.println("Nivel deposito: " + miCoche.getNivelDep() + " litros");

        /* -------------------------------------------------------------------*/
        
        System.out.println("");
        
        Coche otroCoche = miCoche; // new Coche()
        
        //otroCoche.marca; = "Seat"; YA NO SE PUEDE
        
        System.out.println("Marca coche: " + otroCoche.getMarca());
        //vaciarDeposito(miCoche);
        miCoche.vaciarDeposito();
        System.out.println("Nivel deposito: " + otroCoche.getNivelDep() + " litros");
       
		miCoche.setArrancado(true);
		miCoche.echarCarburante(-2);
		for (int i = 0; i < 3;i++)
			miCoche.acelerar();
		
		miCoche.mostrar();
		
		/* -------------------------------------------------------------------*/
		
		CocheRally miSupra = new CocheRally("SKODA", TipoCarburante.DIESEL, TipoColor.AZUL, 3.5f);
		miSupra.echarCarburante(50);
		miSupra.setArrancado(true);
		miSupra.acelerar();
		miSupra.acelerar();
		miSupra.derrapar();
		//miSupra.setNivDeposito(4); // SOLO DENTRO DEL PAQUETE
		//miSupra.explosionCilindro();
		miSupra.mostrar();
	
		Coche supraNormal = miSupra; // CONVERSION IMPLICITA
		//supraNormal.explosionCilindro();
		//supraNormal.derrapar(); // NO SE PUEDE PORQUE EL COCHE NORMAL NO TIENE EL METODO DE DERRAPAR, ES EL COCHE DE RALLY EL QUE DERRAPA,
								// PORQUE TIENE LA FORMA DEL PADRE
		supraNormal.acelerar();
		supraNormal.mostrar();
		
		CocheRally cr = (CocheRally) supraNormal; // CONVERSION EXPLICITA O CASTING 
												  // EL COCHE NORMAL NO SE PUEDE CONVERTIR EN COCHE DE RALLY
		System.out.println("Y el rozamiento?? " + cr.getRozamiento());
		
		// ESTE LANZA EXCEPCION
		
		/*cr = (CocheRally) miCoche;
		System.out.println("Y el rozamiento?? " + cr.getRozamiento());*/
		
		
		
    }
}
