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
 

public Cliente registrarCliente (String nombre, double salarioMensual) {
	Cliente nuevoCliente = new Cliente(nombre,salarioMensual);
	this.clientes.add(nuevoCliente);
	return nuevoCliente;
}
   
// no es void, retorna la instancia del prestamo
/*public void solicitarPrestamo(Prestamo p, String nombre, double salarioMensual ) { // mal. son dos metodos distintos, no recibe la instancia
	this.registrarCliente(nombre, salarioMensual); // esto es otro metodo
	double valorCuota = p.determinarValorDeUnaCuota();
	// esto es parte del codigo de inicializacion, mover al constructor de prestamo
	if(valorCuota > (salarioMensual * 0.3 )) { // el cliente debe calcular el 30% de su sueldo
		p.setState(new Rechazado());
	}
	else {
		p.setState(new Aceptado());
	}
	this.prestamos.add(p);
	
}*/
public Simple solicitarPrestamoSimple(int cantidadDeCuotas, double montoSolicitado, Cliente cliente ) { // mal. son dos metodos distintos, no recibe la instancia
	Simple prestamoSimple = new Simple(montoSolicitado,cantidadDeCuotas,tasaDeInteres);
	this.asignarEstado(prestamoSimple,cliente);
	this.prestamos.add(prestamoSimple);
	
	return prestamoSimple;
}

public UVA solicitarPrestamoUVA(int cantidadDeCuotas, double montoSolicitado, Cliente cliente ) { // mal. son dos metodos distintos, no recibe la instancia
	UVA prestamoUVA = new UVA(montoSolicitado,cantidadDeCuotas);
	this.asignarEstado(prestamoUVA,cliente);
	this.prestamos.add(prestamoUVA);
	
	return prestamoUVA;
}


private void asignarEstado(Prestamo prestamo, Cliente cliente) {
	// TODO Auto-generated method stub
	if(prestamo.determinarValorDeUnaCuota() > (cliente.calcular30PorcientoDelSueldo() )) { // el cliente debe calcular el 30% de su sueldo: ARREGLADO
		prestamo.setState(new Rechazado());
	}
	else {
		prestamo.setState(new Aceptado());
	}
}
}
