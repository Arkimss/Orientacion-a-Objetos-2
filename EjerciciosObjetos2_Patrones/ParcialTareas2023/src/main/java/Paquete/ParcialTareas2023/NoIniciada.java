package Paquete.ParcialTareas2023;

public class NoIniciada extends EstadoTarea {

	@Override
	public void iniciarUnaTarea(TareaSimple tarea) {
		tarea.setEstado(new Iniciada());
		tarea.registrarInicio();
	}



}
