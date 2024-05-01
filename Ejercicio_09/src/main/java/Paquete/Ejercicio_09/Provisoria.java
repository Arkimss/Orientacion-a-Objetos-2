package Paquete.Ejercicio_09;

public class Provisoria implements EstadoInscripcion{

	
 public Provisoria () {

 }

@Override
public void inscribirUsuario(Usuario user, Excursion excursion) {
	//supongo que al estar en provisoria, no se va a exceder del cupo máximo y por eso agrego a la lista de inscriptos
	excursion.addUsersInscriptos(user);
	if(excursion.cantidadDeInscripcionesFaltantesParaCupoMinimo()  == 0) {
		excursion.cambiarEstado(new Definitiva());
	}
	
	
}

@Override
public String obtenerInformacionExtra(Excursion excursion) {
    String aux="Cantidad faltante para cupo minimo: " +  excursion.cantidadDeInscripcionesFaltantesParaCupoMinimo();
	return aux;
}

}
