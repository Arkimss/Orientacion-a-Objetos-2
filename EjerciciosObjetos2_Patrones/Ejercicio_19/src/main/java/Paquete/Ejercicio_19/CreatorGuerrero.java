package Paquete.Ejercicio_19;

import java.util.ArrayList;
import java.util.List;

public class CreatorGuerrero implements CreatorPersonaje {

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> list = new ArrayList<Habilidad>();
		list.add(new CombateCuerpoACuerpo());
		
		return new Guerrero(nombre, new Espada(), new ArmaduraDeAcero(), list);
	}

}
