package paquete.Ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Acost
 *
 */
public class ClientTest {		
		Client operador;
		Agua agua;
		Tierra tierra;
		Topografia compuestaEjemploDelEjercicio;
		Topografia compuestaEjemploDelEjercicio2; // Topografia igual a la anterior para probar igualdad
		Topografia mixta;
		List<Topografia> topografias;//Lista de topografias para topografia compuesta del ejemplo del ejercicio
		List<Topografia> topografias2;
		List<Topografia> topografiaMixta;
		
		@BeforeEach
		void setUp() throws Exception {
			
			
			operador= new Client();
			agua = new Agua();
			tierra= new Tierra();
			
			topografiaMixta= new ArrayList<Topografia>(); //lista para topografia mixta
			topografiaMixta.add(agua);
			topografiaMixta.add(tierra);
			topografiaMixta.add(tierra);
			topografiaMixta.add(agua);
			mixta= new Mixta(topografiaMixta);
		
			topografias= new ArrayList<Topografia>(); //Cargo la lista de topografias para topografia compuesta del ejemplo del ejercicio
			topografias.add(agua);
			topografias.add(tierra);
			topografias.add(tierra);
			topografias.add(mixta);
			
			compuestaEjemploDelEjercicio= new Mixta(topografias);
			
			operador.agregarTopografia(compuestaEjemploDelEjercicio);
		}
	    
		@Test
	    public void testIgualdadTopografiasMixtas() {
	    	
				
	    	topografias2= new ArrayList<Topografia>(); //Cargo la lista de topografias para topografia que se va a comparar con la t. compuesta del ejemplo del ejercicio
			topografias2.add(agua);
			topografias2.add(tierra);
			topografias2.add(tierra);
			topografias2.add(mixta);
			
	    	compuestaEjemploDelEjercicio2= new Mixta(topografias2);

	        assertTrue(operador.compararDosTopografias(compuestaEjemploDelEjercicio, compuestaEjemploDelEjercicio2));
	        assertFalse(operador.compararDosTopografias(mixta, compuestaEjemploDelEjercicio));
	        
	    }
		
		@Test
	    public void testIgualdadTopografiasSimples() {
	    	
			Agua agua2= new Agua();
			Tierra tierra2= new Tierra();
	    	assertFalse(operador.compararDosTopografias(mixta, tierra));
	    	assertFalse(operador.compararDosTopografias(mixta, agua));
	        assertTrue(operador.compararDosTopografias(agua, agua2));
	        assertTrue(operador.compararDosTopografias(tierra, tierra2));
	        
	    }
		
		
		@Test
	    public void testCalcularProporcionAgua() {
			assertEquals(0, tierra.calcularProporcionDeAgua());
			assertEquals(1, agua.calcularProporcionDeAgua());
			assertEquals(0.5, mixta.calcularProporcionDeAgua());
			
			assertEquals(0.375, compuestaEjemploDelEjercicio.calcularProporcionDeAgua());
			
	}
		
		@Test
	    public void testCalcularProporcionTierra() {
			assertEquals(1, tierra.calcularProporcionDeTierra());
			assertEquals(0, agua.calcularProporcionDeTierra());
			assertEquals(0.5 , mixta.calcularProporcionDeTierra());
			assertEquals(0.625, compuestaEjemploDelEjercicio.calcularProporcionDeTierra());
			
	}
}




