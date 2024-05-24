package paquete.Ejercicio_4;

public abstract class EmpleadoPago extends Empleado{
	protected boolean estaCasado;
	protected int cantidadDeHijos;
	
	protected double estaCasado() {
		return this.estaCasado? 5000 : 0;
	}
	protected double calcularAdicionalPorHijos() {
		return this.cantidadDeHijos * 2000;
	}
	
	protected double calcularAdicional() {
		return this.estaCasado() + this.calcularAdicionalPorHijos();
	}
}
