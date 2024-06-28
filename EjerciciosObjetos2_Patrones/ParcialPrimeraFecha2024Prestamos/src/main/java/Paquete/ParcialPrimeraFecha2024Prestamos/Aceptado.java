package Paquete.ParcialPrimeraFecha2024Prestamos;

public class Aceptado implements EstadoPrestamo {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		if(prestamo.getCantidadDeCuotasRestantes() == 1) { // acceso a variable de instancia, {ARREGLADO}
			prestamo.setState(new Finalizado());
		}
		prestamo.registrarPago();
	}

	@Override
	public double calcularGastosDeCancelacion(Prestamo prestamo) {
		return prestamo.calcularGastos();
	}

}
