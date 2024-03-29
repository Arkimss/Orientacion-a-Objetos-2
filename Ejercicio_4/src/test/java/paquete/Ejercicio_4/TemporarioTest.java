package paquete.Ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {
Temporario empleado;
	
	
	@BeforeEach
	void setUp() throws Exception {
		empleado= new Temporario(1, true , 1);
	}
    @Test
    public void testSueldo() {
    	
        assertEquals(24311, empleado.sueldo());       
    }
}
