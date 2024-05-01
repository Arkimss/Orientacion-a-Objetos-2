package Paquete.Ejercicio_09;

public class Completa implements EstadoInscripcion {

	@Override
	public void inscribirUsuario(Usuario user, Excursion excursion) {
		excursion.addUsersEnEspera(user);

	}

	@Override
	public String obtenerInformacionExtra(Excursion excursion) {
		// TODO Auto-generated method stub
		return " ";
	}

}
