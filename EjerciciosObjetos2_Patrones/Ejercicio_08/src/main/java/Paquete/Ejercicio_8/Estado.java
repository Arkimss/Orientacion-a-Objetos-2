package Paquete.Ejercicio_8;

public abstract class Estado {
	

	public void start(ToDoItem item) {
	System.out.println("El estado no se encuentra en Pending");
	}

	public  void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	public void finish(ToDoItem item) {
		System.out.println("El estado no se encuentra en Pending o en pause");
		}
}