package Paquete.Ejercicio_19;

import java.util.List;

public class Thoor extends Personaje{

	public Thoor(String nombre, Arma arma, Armadura armadura, List<Habilidad> habilidades) {
		super(nombre, arma, armadura, habilidades);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void golpear(Personaje objetivo) {
		// TODO Auto-generated method stub
		objetivo.recibirGolpeMartillo();
	}
	
}
