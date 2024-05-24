package paquete.Ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {
	Planta empleado1;
	
	
	@BeforeEach
	void setUp() throws Exception {
		empleado1= new Planta(true, 1 , 1);
	}
    @Test
    public void testSueldo() {
        assertEquals(52050, empleado1.sueldo());       
    }
}
