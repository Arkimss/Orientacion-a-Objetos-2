package paquete.Ejercicio_4;

import org.junit.jupiter.api.BeforeEach;

public class PasanteTest {
Temporario empleado;
	
	
	@BeforeEach
	void setUp() throws Exception {
		empleado= new Temporario(1, true , 1);
	}
}
