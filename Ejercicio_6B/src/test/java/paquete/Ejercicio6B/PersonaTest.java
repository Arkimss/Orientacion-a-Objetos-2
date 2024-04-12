/**
 * 
 */
package paquete.Ejercicio6B;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import paquete.Ejercicio6B.Persona;

public class PersonaTest {
			
	Persona james;
	Persona guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona("James", "Glossing");
		guido = new Persona("Guido", "van Rossum");
	}
    @Test
    public void testNombreCompleto() {
        assertEquals("Glossing, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
        
    }
}
