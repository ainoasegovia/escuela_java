package ejemplosjava;
/**
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("COCHE 1");
        
        Coche miCoche;
        
        miCoche = new Coche("Kia",true); // La instanciacion se hace con new

        miCoche.echarCarburante(30); // Empezamos con medio deposito
        
		System.out.println("Todos los coches tienen: " + Coche.CAPACIDAD_DEPOSITO);
        System.out.println("Marca coche: " + miCoche.getMarca());
        System.out.println("Nivel deposito: " + miCoche.getNivelDep() + " litros");

        /* -------------------------------------------------------------------*/
        
        System.out.println("");
        System.out.println("COCHE 2");
        
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
    }
}
