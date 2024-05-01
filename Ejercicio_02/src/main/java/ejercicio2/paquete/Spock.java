package ejercicio2.paquete;

public class Spock implements Eleccion{

	@Override
	public String jugarContra(Eleccion contrincante) {
		
		return contrincante.jugarContraSpock();
	}

	@Override
	public String jugarContraPiedra() {
		// TODO Auto-generated method stub
		return "Gana Spock";
	}

	@Override
	public String jugarContraTijeras() {
		
		return "Gana Spock";
	}

	@Override
	public String jugarContraPapel() {
		// TODO Auto-generated method stub
		return "Gana Papel";
	}

	@Override
	public String jugarContraSpock() {

		return "Empate";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Gana Lagarto";
	}

}
