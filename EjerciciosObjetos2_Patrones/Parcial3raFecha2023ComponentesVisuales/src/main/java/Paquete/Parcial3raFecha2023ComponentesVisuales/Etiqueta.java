package Paquete.Parcial3raFecha2023ComponentesVisuales;

public class Etiqueta extends Elemento{

	public Etiqueta(String estilo, String texto) {
		super(estilo, texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarEstilo(String estilo) {
		this.setEstilo(estilo);
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		String aux= "<Etiqueta " + this.imprimir() + "</Etiqueta> \n";
		return aux;
	}

}
