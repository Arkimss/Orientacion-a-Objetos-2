package ejercicio2.paquete;

public class Lagarto implements Eleccion{

	@Override
	public String jugarContra(Eleccion contrincante) {
		
		return contrincante.jugarContraLagarto();
	}

	@Override
	public String jugarContraPiedra() {
		
		return "Gana Piedra";
	}

	@Override
	public String jugarContraTijeras() {
		// TODO Auto-generated method stub
		return "Gana Tijeras";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Empate";
	}

}
