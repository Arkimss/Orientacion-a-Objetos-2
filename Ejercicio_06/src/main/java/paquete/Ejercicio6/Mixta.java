package paquete.Ejercicio6;

import java.util.List;
import java.util.ArrayList;

public class Mixta implements Topografia {
	private List<Topografia> topografias;

	public Mixta(List<Topografia> topografias) {
		this.topografias = topografias;
		
	}
	
	
	public void agregarTopografia(Topografia t)
	{
	  this.topografias.add(t);	
	}


	@Override
	public double calcularProporcionDeAgua() {
		return this.topografias.stream().mapToDouble(t -> t.calcularProporcionDeAgua()).sum() / 4;
	}


	@Override
	public double calcularProporcionDeTierra() {
		// TODO Auto-generated method stub
		 return this.topografias.stream().mapToDouble(t -> t.calcularProporcionDeTierra()).sum() / 4;
	}


	@Override
	public boolean sonIguales(Topografia t) {
		// TODO Auto-generated method stub
		return t.igualMixta(this);
	}


	@Override
	public boolean igualAgua() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean igualTierra() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	//public boolean igualMixta(Topografia t) {
//		return this.topografias.stream().filter(top -> top.sonIguales(t)).allMatch(null);
	//}
	public boolean igualMixta(Mixta t) {
		boolean res= true;
		for(int i = 0; i < 4; i++)
        {
            res = this.topografias.get(i).sonIguales(t.getPartes().get(i));
           	
        }
		
		return res;
			
			
	}


	private List<Topografia> getPartes() {
		List<Topografia> copia= new ArrayList<Topografia>();
		copia.addAll(this.topografias);
		return copia;
	}
	}
	
	

