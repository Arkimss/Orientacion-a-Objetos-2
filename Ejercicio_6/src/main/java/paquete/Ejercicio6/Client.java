package paquete.Ejercicio6;

import java.util.ArrayList;
import java.util.List;
public class Client {
	private List<Topografia> topografias;

	public Client() {
		topografias= new ArrayList<Topografia>();
	}
	
	public void agregarTopografia(Topografia t) {
		this.topografias.add(t);
	}
	public boolean compararDosTopografias(Topografia topografia1, Topografia topografia2) {
		
		return topografia1.sonIguales(topografia2);
	}
	
			

}

