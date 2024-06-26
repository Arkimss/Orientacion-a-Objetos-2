package Paquete.ParcialPrimeraFecha2024Prestamos;

public class UVA extends Prestamo{
	private double montoPagado;
	public UVA(double montoSolicitado, int cantidadDeCuotas) {
		super(montoSolicitado, cantidadDeCuotas);
		montoPagado= 0;
	}

	@Override
	protected void registrarPago() {
		this.decrementarUnaCuota();
		this.montoPagado += this.determinarValorDeUnaCuota();
	}

	@Override
	protected double getInteres() {
		// TODO Auto-generated method stub
		return 2.2;
	}

	@Override
	public double calcularMontoPagado() {
		return this.montoPagado;
	}

	@Override
	public double calcularValorDeSello() {
		return 0;
	}

}
