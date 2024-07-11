package Paquete.Parcial3raFecha2023ComponentesVisuales;

public abstract class Elemento implements Componente {
	private String estilo;
	private String texto;
	
	
	
	public Elemento(String estilo, String texto) {
		super();
		this.estilo = estilo;
		this.texto = texto;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String imprimir() {
		return "estilo=' " + this.estilo + " ' >" + this.texto  ;
	}
	
	
	
}
