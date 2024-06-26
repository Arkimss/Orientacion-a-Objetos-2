package Paquete.Ejercicio_19;

import java.util.ArrayList;
import java.util.List;

public class CreatorMago implements CreatorPersonaje{

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> list = new ArrayList<Habilidad>();
		list.add(new CombateADistancia());
		list.add(new Magia());
		
		return  new Mago(nombre, new BastonMagico(), new ArmaduraDeCuero(), list);
	}
	
}
