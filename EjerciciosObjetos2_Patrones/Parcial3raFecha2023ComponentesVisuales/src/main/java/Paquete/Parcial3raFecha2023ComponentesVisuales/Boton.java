package Paquete.Parcial3raFecha2023ComponentesVisuales;

public class Boton extends Elemento{
	private String accion;
	
	
	
	public Boton(String estilo, String texto, String accion) {
		super(estilo, texto);
		this.accion = accion;
	}

	@Override
	public void aplicarEstilo(String estilo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		String aux= "<Boton " + this.imprimir() +"accion=" + this.accion +" ' /> \n";
		return aux;
	}

}