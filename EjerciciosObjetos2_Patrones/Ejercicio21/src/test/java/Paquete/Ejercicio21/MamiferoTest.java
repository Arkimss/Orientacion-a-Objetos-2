/**
 * 
 */
package Paquete.Ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	
	
	Mamifero abuelo,padre,madre,abuela,gabo;
	
	@BeforeEach
	void setUp() throws Exception {
		abuelo = new Mamifero("AX", "Vaca", LocalDate.of(2010, 10, 10), new MamiferoNull(), new MamiferoNull());
		abuela = new Mamifero("AV", "Vaca", LocalDate.of(2015, 10, 10), new MamiferoNull(), new MamiferoNull());
		padre = new Mamifero("AB", "Vaca", LocalDate.of(2020, 10, 10), abuelo, abuela);
		madre = new Mamifero("AB", "Vaca", LocalDate.of(2020, 10, 10), new MamiferoNull(), new MamiferoNull());
	}
	
	
	
    @Test
    public void testMamifero() {
    	assertEquals(1,1);
        System.out.println(padre.getPadre());
        System.out.println(padre.getAbueloMaterno());
        assertEquals(abuelo, padre.getPadre());
        
    }
}
