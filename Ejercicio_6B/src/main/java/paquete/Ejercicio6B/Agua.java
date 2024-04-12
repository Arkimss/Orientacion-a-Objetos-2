package paquete.Ejercicio6B;

public class Agua implements Topografia {

	@Override
	public double calcularProporcionDeAgua() {
		return 1;
	}

	@Override
	public double calcularProporcionDeTierra() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sonIguales(Topografia t) {
		// TODO Auto-generated method stub
		return t.igualAgua();
	}

	@Override
	public boolean igualAgua() {
		// TODO Auto-generated method stub
		return true;
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
		return false;
	}

}
