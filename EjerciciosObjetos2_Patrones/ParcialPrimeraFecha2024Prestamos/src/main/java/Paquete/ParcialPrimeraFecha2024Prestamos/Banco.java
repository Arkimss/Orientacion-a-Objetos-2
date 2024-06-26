package Paquete.ParcialPrimeraFecha2024Prestamos;

import java.util.List;
import java.util.ArrayList;

public class Banco {
   private List<Prestamo> prestamos;
   private List<Cliente> clientes;
   private double tasaDeInteres;
public Banco(double tasaDeInteres) {
	super();
	this.tasaDeInteres = tasaDeInteres;
	prestamos = new ArrayList<Prestamo>();  
	clientes = new ArrayList<Cliente>(); 
}
 

public void registrarCliente (String nombre, double salarioMensual) {
	Cliente nuevoCliente = new Cliente(nombre,salarioMensual);
	this.clientes.add(nuevoCliente);
}
   
public void solicitarPrestamo(Prestamo p, String nombre, double salarioMensual ) {
	this.registrarCliente(nombre, salarioMensual);
	double valorCuota = p.determinarValorDeUnaCuota();
	if(valorCuota > (salarioMensual * 0.3 )) {
		p.setState(new Rechazado());
	}
	else {
		p.setState(new Aceptado());
	}
	this.prestamos.add(p);
	
}
}
