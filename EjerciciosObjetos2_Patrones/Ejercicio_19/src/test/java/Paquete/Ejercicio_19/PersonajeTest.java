package Paquete.Ejercicio_19;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
	
	Personaje merlin, choso,thorfinn, askeladd, dumbledore, thor;
	CreatorPersonaje mago,arquero, guerrero, thoor;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mago = new CreatorMago();
		arquero = new CreatorArquero();
		guerrero = new CreatorGuerrero();
		thoor = new CreatorThoor();
		merlin = mago.crearPersonaje("merlin");
		choso =arquero.crearPersonaje("choso");
		thorfinn = guerrero.crearPersonaje("thorfinn");
		askeladd= guerrero.crearPersonaje("askeladd");
		dumbledore= mago.crearPersonaje("dumbledore");
		thor= thoor.crearPersonaje("Thor");
		
	}
	//Testeo si a cada instancia se le aplica el daño del golpe de otro personaje
    @Test 
    public void testGolpeGuerrero() {
    	thorfinn.golpear(choso);	
    	assertEquals(92, choso.getCantidadDeVida());
    	thorfinn.golpear(askeladd);
    	assertEquals(97, askeladd.getCantidadDeVida());
    	thorfinn.golpear(merlin);
    	assertEquals(92, merlin.getCantidadDeVida());
    }
    @Test 
    public void testGolpeMago() {
    	merlin.golpear(choso);	
    	assertEquals(98, choso.getCantidadDeVida());
    	merlin.golpear(askeladd);
    	assertEquals(99, askeladd.getCantidadDeVida());
    	merlin.golpear(dumbledore);
    	assertEquals(98, dumbledore.getCantidadDeVida());
    	
    }
    @Test 
    public void testGolpeArquero() {
    	choso.golpear(choso);	
    	assertEquals(95, choso.getCantidadDeVida());
    	choso.golpear(askeladd);
    	assertEquals(98, askeladd.getCantidadDeVida());
    	choso.golpear(dumbledore);
    	assertEquals(95, dumbledore.getCantidadDeVida());
    	
    }
    @Test 
    public void testGolpeThoor() {
    	thor.golpear(choso);	
    	assertEquals(89, choso.getCantidadDeVida());
    	thor.golpear(askeladd);
    	assertEquals(95, askeladd.getCantidadDeVida());
    	thor.golpear(dumbledore);
    	assertEquals(89, dumbledore.getCantidadDeVida());
    	thor.golpear(thor);
    	assertEquals(92, thor.getCantidadDeVida());
    }
    //Testeo que un personaje no ejecute el golpear si tiene vida menor o igual a 0
    @Test 
    public void testGolpeConPersonajeMuerto() {
    	choso.setVida(100);
    	choso.golpear(choso);	
    	assertEquals(0, choso.getCantidadDeVida());
    	choso.golpear(askeladd);
    	assertEquals(100, askeladd.getCantidadDeVida());
    	choso.golpear(dumbledore);
    	assertEquals(100, dumbledore.getCantidadDeVida());
    	
    }
}
