/**
 * 
 */
package Paquete.Ejercicio_09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	Usuario user1, user2, user3;
	Excursion kayakCompleta;
	
	
		
	@BeforeEach
	void setUp() throws Exception {
		user1= new Usuario("Jose Luis", "JoseLuis@gmail.com");
		user2= new Usuario("Yael Cuestas", "Cuestas@gmail.com");
		user3= new Usuario("Alejandro Acosta", "Acosta@gmail.com");
		
		kayakCompleta= new Excursion("Dos días en kayak bajando el Paraná", 500.2, 1, 2, LocalDate.now(),LocalDate.now(),"El Paraná" );
		kayakCompleta.inscribirUsuario(user1);
		kayakCompleta.inscribirUsuario(user2);
	}
    @Test
    public void testCupoMaximoCompleto() {
    	kayakCompleta.inscribirUsuario(user3);
        assertTrue(kayakCompleta.getEstado() instanceof Completa);
        
    }
}
