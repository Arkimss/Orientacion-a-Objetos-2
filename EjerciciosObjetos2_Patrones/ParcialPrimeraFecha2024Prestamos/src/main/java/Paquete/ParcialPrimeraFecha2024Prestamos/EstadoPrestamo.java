package Paquete.ParcialPrimeraFecha2024Prestamos;

public interface EstadoPrestamo {
	 public void pagarCuota(Prestamo prestamo);
	 public double calcularGastosDeCancelacion(Prestamo prestamo);
}
