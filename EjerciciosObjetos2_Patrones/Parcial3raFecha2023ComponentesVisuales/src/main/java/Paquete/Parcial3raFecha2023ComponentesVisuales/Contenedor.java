package Paquete.Parcial3raFecha2023ComponentesVisuales;

import java.util.List;

public class Contenedor implements Componente{
	List<Componente> contenido;

	@Override
	public void aplicarEstilo(String estilo) {
		this.contenido.stream().forEach(c -> c.aplicarEstilo(estilo));
		
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		
		String aux= "<contenedor>  \n";
		for(int i=0; i<this.contenido.size(); i++) {
			aux+= this.contenido.get(i).imprimir();
		}
		aux += "\n </contenedor>";
		return aux;
	}
	
	
	
}
