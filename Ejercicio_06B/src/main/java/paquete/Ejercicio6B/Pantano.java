package paquete.Ejercicio6B;

public class Pantano implements Topografia {

	@Override
	public double calcularProporcionDeAgua() {
		// TODO Auto-generated method stub
		return 0.7;
	}

	@Override
	public double calcularProporcionDeTierra() {
		// TODO Auto-generated method stub
		return 0.3;
	}

	@Override
	public boolean sonIguales(Topografia t) {
		// TODO Auto-generated method stub
		return t.igualPantano();
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
	public boolean igualMixta(Mixta t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean igualPantano() {
		// TODO Auto-generated method stub
		return true;
	}

}
