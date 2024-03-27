package ejercicio2.paquete;

public class Piedra implements Eleccion{

	@Override
	public String jugarContra(Eleccion contrincante) {
		
		return contrincante.jugarContraPiedra();
	}

	@Override
	public String jugarContraPiedra() {
		return "Empate";
	}

	@Override
	public String jugarContraTijeras() {
		// TODO Auto-generated method stub
		return "Gana Piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Gana Spock";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Gana Piedra";
	}
    
	
}
