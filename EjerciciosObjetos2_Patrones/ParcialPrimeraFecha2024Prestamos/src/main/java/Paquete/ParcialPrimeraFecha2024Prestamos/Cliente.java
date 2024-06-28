package Paquete.ParcialPrimeraFecha2024Prestamos;

public class Cliente {
 private String nombre;
 private double salarioMensual;
public Cliente(String nombre, double salarioMensual) {
	super();
	this.nombre = nombre;
	this.salarioMensual = salarioMensual;
}
public double calcular30PorcientoDelSueldo() {
	// TODO Auto-generated method stub
	return this.salarioMensual * 0.3;
}
 
// este tiene que hacer el calculo del 30% del sueldo
 
}
