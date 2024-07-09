package Paquete.Ejercicio_22;

public class BuilderClasico extends BuilderSanguche{

	@Override
	public void agregarPan() {
		// TODO Auto-generated method stub
		this.sanguche.agregarParte(new Ingrediente(100,"Pan Brioche"));
		
	}

	@Override
	public void agregarAderezo() {
		// TODO Auto-generated method stub
		this.sanguche.agregarParte(new Ingrediente(20,"Mayonesa"));
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.agregarParte(new Ingrediente(300,"Carne de ternera"));
		
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.agregarParte(new Ingrediente(80,"tomate"));
		
	}

}
