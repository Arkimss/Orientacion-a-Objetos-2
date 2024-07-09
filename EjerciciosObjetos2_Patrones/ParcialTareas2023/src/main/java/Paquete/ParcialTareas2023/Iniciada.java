package Paquete.ParcialTareas2023;

public class Iniciada extends EstadoTarea {


	@Override
	public void completarUnaTarea(TareaSimple tarea) {
		tarea.setEstado(new Completada());
		tarea.registrarFin();
	}

	

}
