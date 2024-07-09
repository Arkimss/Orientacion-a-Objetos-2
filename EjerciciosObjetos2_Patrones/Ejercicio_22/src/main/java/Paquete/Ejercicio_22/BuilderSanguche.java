package Paquete.Ejercicio_22;

public abstract class BuilderSanguche {
 protected Sanguche sanguche;
	
	public BuilderSanguche() {
		
		this.sanguche = new Sanguche();
	}
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
	public Sanguche getSanguche() {
		return sanguche;
	}
}
