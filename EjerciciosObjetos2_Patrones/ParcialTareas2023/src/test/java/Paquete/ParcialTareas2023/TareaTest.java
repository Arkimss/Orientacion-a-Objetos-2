package Paquete.ParcialTareas2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
public class TareaTest {
   TareaCompuesta prepararAlmuerzo, realizarCompras;
   TareaSimple irAlSuper,irALaVerduleria,prepararLaMesa,cocinar;
	
   @BeforeEach
   void setUp() throws Exception{
	   irAlSuper = new TareaSimple("ir Al supermercado", 3);
	   irALaVerduleria= new TareaSimple("ir a la verduleria", 1);
	   cocinar =  new TareaSimple("cocinar", 2);
	   prepararLaMesa= new TareaSimple("poner la mesa", 3);
	   
	   List<Tarea> tareas= new ArrayList<Tarea>();
	   tareas.add(irAlSuper);
	   tareas.add(irALaVerduleria);
	   
	   realizarCompras= new TareaCompuesta("realizar compras", tareas);
	   
	   List<Tarea> tareas2= new ArrayList<Tarea>();
	   
	   tareas2.add(realizarCompras);
	   tareas2.add(cocinar);
	   tareas2.add(prepararLaMesa);
	   
	   prepararAlmuerzo = new TareaCompuesta("prepararAlmuerzo", tareas2);
	   
   }
   
   
  @Test
  public void testAvanceDeUnaTarea() {
	  prepararAlmuerzo.iniciarTarea();
	  prepararAlmuerzo.completarTarea();  
	  System.out.println(prepararAlmuerzo.avanceDeUnaTarea());
	  assertEquals(0.43, prepararAlmuerzo.avanceDeUnaTarea());
  }
}
