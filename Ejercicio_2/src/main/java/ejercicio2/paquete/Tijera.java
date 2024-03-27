package ejercicio2.paquete;

public class Tijera implements Eleccion {

	@Override
	public String jugarContra(Eleccion contrincante) {

		return contrincante.jugarContraTijeras();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraTijeras() {
		
		return "Empate";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Tijeras";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Gana Spock";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Gana Tijeras";
	}

}
