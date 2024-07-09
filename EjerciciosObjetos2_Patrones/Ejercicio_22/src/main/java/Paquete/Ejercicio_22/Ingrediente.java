package Paquete.Ejercicio_22;

public  class Ingrediente {
	private double precio;
	private String nombre;
	
	public Ingrediente(double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	
public double getPrecio()
{
	return this.precio;
}
}
