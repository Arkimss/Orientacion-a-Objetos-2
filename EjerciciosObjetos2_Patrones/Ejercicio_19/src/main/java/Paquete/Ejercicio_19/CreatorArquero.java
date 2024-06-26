package Paquete.Ejercicio_19;
import java.util.List;
import java.util.ArrayList;
public class CreatorArquero implements CreatorPersonaje {

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> list = new ArrayList<Habilidad>();
		list.add(new CombateADistancia());
		Arco arma= new Arco();
		ArmaduraDeCuero armadura= new ArmaduraDeCuero();
		return new Arquero(nombre, arma, armadura, list);
	}

}
