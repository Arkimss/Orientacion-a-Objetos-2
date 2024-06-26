package Paquete.ParcialPrimeraFecha2024Prestamos;

public class Aceptado implements EstadoPrestamo {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		if(prestamo.cantidadDeCuotasRestantes == 1) {
			prestamo.setState(new Finalizado());
		}
		prestamo.registrarPago();
	}

	@Override
	public double calcularGastosDeCancelacion(Prestamo prestamo) {
		return prestamo.calcularGastos();
	}

}
