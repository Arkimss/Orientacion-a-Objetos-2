package Paquete.Ejercicio_19;

import java.util.List;

public class Mago extends Personaje{

	public Mago(String nombre, Arma arma, Armadura armadura, List<Habilidad> habilidades) {
		super(nombre, arma, armadura, habilidades);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void golpear(Personaje objetivo) {
		if(this.sigueVivo()) {
		objetivo.recibirGolpeBastonMagico();}
	}
	

}
