package Paquete.ParcialPrimeraFecha2024Prestamos;

public class Simple extends Prestamo{
	private double tasaDeInteres;
	public Simple(double montoSolicitado, int cantidadDeCuotas, double tasaDeInteres) {
		super(montoSolicitado, cantidadDeCuotas);
		this.tasaDeInteres = tasaDeInteres;
		
	}

	@Override
	protected void registrarPago() {
		// TODO Auto-generated method stub
		this.decrementarUnaCuota();
	}

	@Override
	protected double getInteres() {
		return this.tasaDeInteres;
	}

	@Override
	public double calcularMontoPagado() {	
		double totalAPagar = this.montoSolicitado + (this.montoSolicitado * this.tasaDeInteres);
		double montoRestante = this.calcularMontoRestante();
		
		return totalAPagar - montoRestante;
	}

	@Override
	public double calcularValorDeSello() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
