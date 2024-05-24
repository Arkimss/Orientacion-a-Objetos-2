package Paquete.Ejercicio_8;

public abstract class Estado {
	protected ToDoItem tarea; 
	

	public void start(ToDoItem item) {
	System.out.println("El estado no se encuentra en Pending");
	}

	protected abstract void togglePause();

	protected abstract void finish();
	
	
}