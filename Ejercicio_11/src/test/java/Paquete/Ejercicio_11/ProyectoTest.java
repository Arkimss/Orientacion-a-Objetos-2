package Paquete.Ejercicio_11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
   Proyecto vacacionesDeInvierno, vacacionesDeVerano;
   
   
   @BeforeEach
	void setUp() throws Exception {
	   vacacionesDeInvierno = new Proyecto("vacaciones De Invierno", LocalDate.of(2024,2,3), LocalDate.of(2024,6,3), "Salir con Amigos", 3,5000.0);
	   vacacionesDeInvierno.aprobarEtapa();
   }
   
   @Test
   public void testCostoDelProyecto() {
       assertEquals(15000 ,  vacacionesDeInvierno.costoDelProyecto());
   
   }
   
   @Test
   public void testPrecioDelProyecto() {
       assertEquals(15000 + (15000 * 0.07),  vacacionesDeInvierno.precioDelProyecto() );
   
   }
   @Test
   public void testAprobarEtapa() {
	   assertTrue( vacacionesDeInvierno.getEtapa() instanceof EnEvaluacion);
	   vacacionesDeInvierno.aprobarEtapa();
       assertTrue( vacacionesDeInvierno.getEtapa() instanceof Confirmada);
   
   }
   
   @Test
   public void testModificarMargenDeGanancia() {
	    assertEquals(7,  vacacionesDeInvierno.getMargenDeGanancia());  //Testeo que el margen de ganancia sea el valor inicial dado
	   vacacionesDeInvierno.modificarMargenDeGanancia(0); //No se poner en 0 el valor del margen de ganancia
	   assertEquals(7,  vacacionesDeInvierno.getMargenDeGanancia()); // la linea anterior no debió modificar nada
	   vacacionesDeInvierno.modificarMargenDeGanancia(12); //Si el proyecto esta en etapa de evaluacion y el nuevo margen está entre 11 y 15 se puede modificar
	   assertEquals(12,  vacacionesDeInvierno.getMargenDeGanancia()); 
	 
   }
}
