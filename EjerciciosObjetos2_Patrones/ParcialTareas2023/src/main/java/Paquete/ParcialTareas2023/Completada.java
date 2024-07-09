package Paquete.ParcialTareas2023;

public class Completada extends EstadoTarea {

	


	@Override
	public long tiempoUtilizadoEnUnaTarea(TareaSimple tarea) {
		// TODO Auto-generated method stub
	return tarea.calcularTiempoUtilizado();
	}

}
