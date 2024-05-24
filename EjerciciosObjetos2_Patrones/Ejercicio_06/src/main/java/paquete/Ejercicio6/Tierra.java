package paquete.Ejercicio6;

public class Tierra implements Topografia  {

	@Override
	public double calcularProporcionDeAgua() {
		return 0;
	}

	@Override
	public double calcularProporcionDeTierra() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean sonIguales(Topografia t) {
		return t.igualTierra();
		
	}

	@Override
	public boolean igualAgua() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean igualTierra() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean igualMixta(Mixta t) {
		// TODO Auto-generated method stub
		return false;
	}

}
