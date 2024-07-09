package Paquete.Ejercicio_22;

public class BuilderVegano extends BuilderSanguche{

	@Override
	public void agregarPan() {
		// TODO Auto-generated method stub
		this.sanguche.agregarParte(new Ingrediente(100,"Pan integral"));
		
	}

	@Override
	public void agregarAderezo() {
		// TODO Auto-generated method stub
		this.sanguche.agregarParte(new Ingrediente(20,"salsa criolla"));
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.agregarParte(new Ingrediente(500,"Milanesa de girgolas"));
		
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.agregarParte(new Ingrediente(0,""));
		
	}

}