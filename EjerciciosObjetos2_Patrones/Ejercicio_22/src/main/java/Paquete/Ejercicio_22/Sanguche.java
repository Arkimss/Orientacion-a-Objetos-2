package Paquete.Ejercicio_22;

import java.util.List;
import java.util.ArrayList;

public class Sanguche {
	List<Ingrediente> ingredientes;
	
	
	
	public Sanguche() {
	
		this.ingredientes = new ArrayList<Ingrediente>();
	}



	public void agregarParte(Ingrediente in) {
		this.ingredientes.add(in);

	}
	
	public double calcularPrecio()
	{
		return this.ingredientes.stream().mapToDouble(i -> i.getPrecio()).sum();
	}
}
