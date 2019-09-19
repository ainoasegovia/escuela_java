package pruebas;

import POO.Coche;
import POO.CocheRally;
import POO.Moto;
import POO.Pelota;
import POO.Rodable;
import POO.TipoCarburante;
import POO.Vehiculo;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Ainoa
 */
public class TestAbstractInterfaces { // Creamos una clase anonima

	@Test
	public void abstractos() {
		
		Vehiculo miVehiculo = new Vehiculo("Fabricacion propia" ,"SIN MATRICULAR") {
            @Override
            public void abrirPuerta() {
                    System.out.println("Abriendo puertas...");
            }
            @Override
            public void acelerar() { 
                System.out.println(toString() + " acelera.");
            }
        };
        miVehiculo.acelerar();
        Vehiculo miMoto = new Moto("CBR 900");
        System.out.println(miMoto.toString());
        miMoto.abrirPuerta();
        miMoto.acelerar();
        
        miVehiculo.abrirPuerta();
        Coche coche = new Coche("Audi", "4567-JGH");
        coche.setArrancado(true);
        coche.echarCarburante(50);
        coche.acelerar();
        coche.acelerar();
        coche.mostrar();
        assertEquals(coche.getNivDeposito(), 49.8, 0.01);
        
        CocheRally miSupra = new CocheRally("TOYOTA", TipoCarburante.DIESEL, "AZUL", 2.1f);
        miSupra.echarCarburante(40);
        miSupra.setArrancado(true);
        miSupra.acelerar();
        miSupra.acelerar();
        miSupra.derrapar();
        //miSupra.setNivDeposito(4); Solo dentro del paquete
        //miSupra.explosionCilindro();
        miSupra.mostrar();
        assertEquals(miSupra.getNivDeposito(), 39, 0.01);
	}
	
	@Test
	public void interfaces(){
		Coche coche = new Coche("Audi",  "8569-LMI");
		coche.setArrancado(true);
		coche.echarCarburante(60);
		coche.moverse();
		coche.mostrar();
		
		Moto miMoto = new Moto("SUBARU 250");
		miMoto.moverse();
		
		Pelota bola = new Pelota();
		bola.moverse();
		
		ArrayList<Rodable> cosasQueRuedan = new ArrayList<>();
		cosasQueRuedan.add(bola);
		cosasQueRuedan.add(miMoto);
		cosasQueRuedan.add(coche);
		
		for(Rodable rod : cosasQueRuedan){
			System.out.println(">> Rodando " + rod.toString());
			System.out.println("Ruedas " + rod.getNumRuedas());

			rod.moverse();
		}

	}
}
