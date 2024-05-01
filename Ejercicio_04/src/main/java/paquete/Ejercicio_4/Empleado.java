package paquete.Ejercicio_4;

public abstract class Empleado {
	
	
	protected double sueldo() {
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}
	
	protected double calcularDescuento() {
		return (this.calcularBasico() * 0.13) + (this.calcularAdicional() * 0.05);
	}
	
	abstract double calcularBasico();
	abstract double calcularAdicional();
}
