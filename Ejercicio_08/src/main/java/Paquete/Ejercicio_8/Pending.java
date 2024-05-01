package Paquete.Ejercicio_8;

public class Pending extends Estado {

	@Override	
	public void start(){
			this.tarea.setEstado(new InProgress());
		}

	@Override
	protected void togglePause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void finish() {
		// TODO Auto-generated method stub
		
	}
}
