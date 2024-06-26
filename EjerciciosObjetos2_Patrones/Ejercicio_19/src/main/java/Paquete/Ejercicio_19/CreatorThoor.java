package Paquete.Ejercicio_19;

import java.util.ArrayList;
import java.util.List;

public class CreatorThoor implements CreatorPersonaje {

	@Override
	public Personaje crearPersonaje(String nombre) {
		// TODO Auto-generated method stub
		List<Habilidad> list = new ArrayList<Habilidad>();
		list.add(new CombateADistancia());
		list.add(new LanzarRayos());
		
		return new Thoor(nombre, new Martillo(), new ArmaduraDeHierro(), list);
	}

}
