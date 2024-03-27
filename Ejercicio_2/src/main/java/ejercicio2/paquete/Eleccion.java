package ejercicio2.paquete;

public interface Eleccion {
	
	String jugarContra(Eleccion contrincante);

	String jugarContraPiedra();
	String jugarContraTijeras();
	String jugarContraPapel();
	String jugarContraSpock();
	String jugarContraLagarto();
	
}
