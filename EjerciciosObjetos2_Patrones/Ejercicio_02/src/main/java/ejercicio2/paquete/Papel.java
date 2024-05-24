package ejercicio2.paquete;

public class Papel implements Eleccion{

	@Override
	public String jugarContra(Eleccion contrincante) {
		
		return contrincante.jugarContraPapel();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraTijeras() {
		
		return "Gana Tijeras";
	}

	@Override
	public String jugarContraPapel() {
		return "Empate";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Gana Papel";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Gana Lagarto";
	}

}
