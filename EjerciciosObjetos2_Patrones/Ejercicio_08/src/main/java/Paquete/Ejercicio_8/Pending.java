package Paquete.Ejercicio_8;

public class Pending extends Estado {

	@Override	
	public void start(ToDoItem item){
			item.setEstado(new InProgress());
		}
}
