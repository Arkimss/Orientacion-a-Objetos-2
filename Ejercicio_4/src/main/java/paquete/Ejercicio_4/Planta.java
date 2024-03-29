package paquete.Ejercicio_4;

public class Planta extends EmpleadoPago{
	
	  private int antiguedad;
	
	  public Planta(boolean estaCasado, int cantidadDeHijos, int antiguedad) {
		    this.cantidadDeHijos = cantidadDeHijos;
			this.estaCasado = estaCasado;
			this.antiguedad = antiguedad;
		}
	  
	  @Override
	double calcularBasico() {
		return 50000;
	}

	@Override
	protected double calcularAdicional() {
		// TODO Auto-generated method stub
		return super.calcularAdicional() + this.calcularAntiguedad() ;
	}
	private double calcularAntiguedad() {
		return this.antiguedad * 2000;
	}

	//Mal olor, Consultar solución.
}
