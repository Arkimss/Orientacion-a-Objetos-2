package Paquete.Ejercicio_8;

public class Paused extends Estado {

	@Override
	public void togglePause(ToDoItem item) {
		item.setEstado(new InProgress());
	}


	@Override
	public void finish(ToDoItem item) {
		item.setEstado(new Finished());
		}

}
