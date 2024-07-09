package Paquete.Ejercicio_22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testSanguches {
	BuilderClasico builderB;
	BuilderVegano builderV;
	DirectorSubway director;
	
	@BeforeEach
	void SetUp() throws Exception {
		 director= new DirectorSubway();
		 
	}
	
	
	@Test
	public void veganoTest() {
		director.setBuilder(new BuilderVegano());
		Sanguche sanguche = director.build();
		System.out.println(sanguche.calcularPrecio());
		assertEquals(620, sanguche.calcularPrecio());
	}
	
	@Test
	public void clasicoTest() {
		director.setBuilder(new BuilderClasico());
		Sanguche sanguche = director.build();
		System.out.println(sanguche.calcularPrecio());
		assertEquals(500, sanguche.calcularPrecio());
	}
}
