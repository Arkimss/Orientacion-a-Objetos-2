package Paquete.Ejercicio_11;

public class EnEvaluacion implements Etapa {


	@Override
	public void aprobarEtapa(Proyecto proyect) {
		proyect.cambiarEtapa(new Confirmada());
		
	}
	
	@Override
	public void modificarMargenDeGanancia(double nuevoMargen, Proyecto p) {
		if(this.verificarMargen(nuevoMargen)) {
				p.setMargen(nuevoMargen);
		}
		
	}
	@Override
	public boolean verificarMargen(double nuevoMargen) {
		
		return (nuevoMargen >= 11.0) && (nuevoMargen <= 15.0);
	}

}
