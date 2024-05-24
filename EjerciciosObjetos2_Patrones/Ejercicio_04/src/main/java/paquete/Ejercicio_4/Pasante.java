package paquete.Ejercicio_4;

public class Pasante extends Empleado{

	private int cantidadDeExamenesRendidos;
	
	
	
	public Pasante(int cantidadDeExamenesRendidos) {
		this.cantidadDeExamenesRendidos = cantidadDeExamenesRendidos;
	}

	@Override
	double calcularBasico() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	double calcularAdicional() {
		// TODO Auto-generated method stub
		return 2000 * this.cantidadDeExamenesRendidos	;
	}

}
