package Paquete.Ejercicio_22;

public class DirectorSubway {
	private BuilderSanguche builder;
	
	public void setBuilder(BuilderSanguche builder) {
		this.builder = builder;
	}
	
	
	public Sanguche build() {
		builder.agregarPan();
		builder.agregarAderezo();
		builder.agregarPrincipal();
		builder.agregarAdicional();
		return builder.getSanguche();
	}
}
