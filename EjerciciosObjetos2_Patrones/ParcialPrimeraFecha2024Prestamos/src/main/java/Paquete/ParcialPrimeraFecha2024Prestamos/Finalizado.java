package Paquete.ParcialPrimeraFecha2024Prestamos;

public class Finalizado implements EstadoPrestamo {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		System.out.println("FIN");
		throw new Error("error");  // duplicado. rremplazar el msj o subir arriba
	}

	@Override
	public double calcularGastosDeCancelacion(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
