package Paquete.Ejercicio_09;

public class Definitiva implements EstadoInscripcion{

	@Override
	public void inscribirUsuario(Usuario user, Excursion excursion) {
		if(excursion.cantidadDeInscripcionesFaltantesParaCupoMaximo() == 0) {
			excursion.cambiarEstado(new Completa());
			excursion.addUsersEnEspera(user);
		}
		else {
			excursion.addUsersInscriptos(user);
		}
		
	}

	@Override
	public String obtenerInformacionExtra(Excursion excursion) {
	    String aux="Cantidad faltante para cupo Maximo: " +  excursion.cantidadDeInscripcionesFaltantesParaCupoMaximo();
		return aux;
	}

}
