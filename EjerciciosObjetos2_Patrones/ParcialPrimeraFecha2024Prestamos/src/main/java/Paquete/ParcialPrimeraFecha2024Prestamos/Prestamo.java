package Paquete.ParcialPrimeraFecha2024Prestamos;

public abstract class Prestamo {
	protected double montoSolicitado;
	protected int cantidadDeCuotas;
	protected int cantidadDeCuotasRestantes;

	protected EstadoPrestamo estado;
	public Prestamo(double montoSolicitado, int cantidadDeCuotas) {
		super();
		this.montoSolicitado = montoSolicitado;
		this.cantidadDeCuotas = cantidadDeCuotas;
		this.cantidadDeCuotasRestantes = cantidadDeCuotas;
	
	}
	protected  void registrarPago() {
		this.decrementarUnaCuota();
		this.actualizarMontoPagado();
		// convertir a template -: decrementarCuota() + algo y el algo en UVA es el que incrementa el monto ese
	}
	
	protected abstract void actualizarMontoPagado(); // Metodo agregado
	public void setState(EstadoPrestamo nuevoEstado) {
		// TODO Auto-generated method stub
		this.estado = nuevoEstado;
	}
	public double determinarValorDeUnaCuota() { 
		// TODO Auto-generated method stub
		return (this.montoSolicitado / this.cantidadDeCuotas) + (this.montoSolicitado / this.cantidadDeCuotas) * this.getInteres();
	}
	protected abstract double getInteres();
	
	
	public int getCantidadDeCuotasRestantes() {
		return cantidadDeCuotasRestantes;
	}
	
	public void pagarCuota() {
		this.estado.pagarCuota(this);
	}
	protected void decrementarUnaCuota() {
		this.cantidadDeCuotasRestantes = this.cantidadDeCuotasRestantes - 1;
	}
	public abstract double calcularMontoPagado();
	
	public double calcularMontoRestante() {
		return this.determinarValorDeUnaCuota() * this.cantidadDeCuotasRestantes;
	}
	public double calcularValorAdministrativo() {
		return this.calcularMontoRestante() * 0.1;
	}
	
	public abstract double calcularValorDeSello();
	
	public double calcularGastosDeCancelacion() {
		return this.estado.calcularGastosDeCancelacion(this);
	}
	protected double calcularGastos() { // template method
		// TODO Auto-generated method stub
		return this.calcularMontoRestante() + this.calcularValorDeSello() + this.calcularValorAdministrativo();
	}
	
}
