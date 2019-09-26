/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

import threads.FactoriaHiloFich;
import threads.HiloFichero;
import threads.HiloFicheroStrAuxV1;
import threads.HiloFicheroStrAuxV2;
import threads.StringAuxV1;

/**
 *
 * @author alumno
 */
public class TestFicheros {
    
    public static final String RUTA_FICH = "./texto_esp.txt";
    interface IObservador {  // Observer de Java
       void updateTerminado(String nombre, double tiempo);
    }
    class MiObservador implements IObservador { // 

        @Override
        public void updateTerminado(String nombre, double tiempo) {
            System.out.println("El hilo " + nombre + " ha tardado " + tiempo);
        }        
    }
    class Observado {   // Observable de Java
        IObservador observador; // Sería una lista
        public void addObserver(IObservador observador) {
            // Añadir a la lista
            this.observador = observador;
        }
        public void notificar(double tiempo) {
            // Recorrer todos los observadores
            observador.updateTerminado(this.getClass().toString(), tiempo);
        }
    }
    class HiloObservadoV1 extends Observado implements Runnable {

        @Override
        public void run() {
            double tiempoIni = (new Date()).getTime();
            HiloFicheroStrAuxV1 hiloFich = new HiloFicheroStrAuxV1(new StringAuxV1());
            hiloFich.leerFicheroEjem(RUTA_FICH);
            notificar((new Date()).getTime() - tiempoIni);
        }        
    }
    
    class HiloObservadoV2 extends Observado implements Runnable {

        @Override
        public void run() {
            double tiempoIni = (new Date()).getTime();
            HiloFicheroStrAuxV2 hiloFich = new HiloFicheroStrAuxV2(null);
            hiloFich.leerFicheroEjem(RUTA_FICH);
            notificar((new Date()).getTime() - tiempoIni);
        }        
    }
    @Test
    public void lanzarHilosFichero() {
        MiObservador observador = new MiObservador();
        HiloObservadoV1 hiloV1 = new HiloObservadoV1();
        HiloObservadoV2 hiloV2 = new HiloObservadoV2();
        
        hiloV1.addObserver(observador);
        hiloV2.addObserver(observador);
        
        Thread threadV1 = new Thread(hiloV1);
        Thread threadV2 = new Thread(hiloV2);
        
        
        
        threadV1.run();
        
        
        try {
            threadV1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        threadV2.run();
        
        try {
            threadV2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
    public void generacionFicheroAleatorio() {
//        HiloFichero.crearFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
        HiloFichero hf = FactoriaHiloFich.HiloFichero1();
        hf.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
         HiloFichero hf2 = FactoriaHiloFich.HiloFichero2();
        hf2.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
    }
}
