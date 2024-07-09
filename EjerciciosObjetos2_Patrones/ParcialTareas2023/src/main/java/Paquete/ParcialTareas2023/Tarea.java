package Paquete.ParcialTareas2023;

public abstract class Tarea {

   private String descripcion;
   
   public Tarea( String descripcion) {
	this.descripcion = descripcion;
}

public abstract int estimacionDeUnaTarea();
   
   public abstract long tiempoUtilizadoEnUnaTarea();
   
   public abstract void iniciarTarea();
   
   public abstract void completarTarea();
   
   public double avanceDeUnaTarea() {
	   return (this.tiempoUtilizadoEnUnaTarea() / this.estimacionDeUnaTarea());
   }
}
