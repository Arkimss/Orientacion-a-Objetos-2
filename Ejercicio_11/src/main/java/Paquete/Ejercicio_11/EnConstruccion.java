package Paquete.Ejercicio_11;

public class EnConstruccion implements Etapa {

	@Override
	public void aprobarEtapa(Proyecto proyect) {
		if(proyect.precioDelProyecto() > 0) {
		proyect.cambiarEtapa(new EnEvaluacion());	}	
	else {
		throw new RuntimeException("El precio del proyecto es 0");
	}
	}

	@Override
	public void modificarMargenDeGanancia(double nuevoMargen, Proyecto p) {
		if(this.verificarMargen(nuevoMargen)) {
				p.setMargen(nuevoMargen);
		}
		
	}

	@Override
	public boolean verificarMargen(double nuevoMargen) {
		// TODO Auto-generated method stub
		return (nuevoMargen >= 8.0) && (nuevoMargen <= 10.0);
	}

}
