package Paquete.ParcialPrimeraFecha2024Prestamos;

public class Rechazado implements EstadoPrestamo {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		throw new Error("error");
	}

	@Override
	public double calcularGastosDeCancelacion(Prestamo prestamo) {
		// TODO Auto-generated method stub
		throw new Error("error");
	}

}
