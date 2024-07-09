package Paquete.ParcialTareas2023;

import java.util.List;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
	
	private List<Tarea> tareas;
	
	public TareaCompuesta(String descripcion, List<Tarea> tareas) {
		super(descripcion);
		this.tareas = new ArrayList<Tarea>(tareas);
		// TODO Auto-generated constructor stub
	}


	
	
	
	

	@Override
	public int estimacionDeUnaTarea() {
		// TODO Auto-generated method stub
		return this.tareas.stream().mapToInt(t -> t.estimacionDeUnaTarea()).sum();
	}

	@Override
	public long tiempoUtilizadoEnUnaTarea() {
		// TODO Auto-generated method stub
		return this.tareas.stream().mapToLong(t -> t.tiempoUtilizadoEnUnaTarea()).sum();
	}

	@Override
	public void iniciarTarea() {
		for (Tarea tarea : tareas) {
	            tarea.iniciarTarea();
	        }
	}

	@Override
	public void completarTarea() {
		for (Tarea tarea : tareas) {
            tarea.completarTarea();
        }
	}

}
