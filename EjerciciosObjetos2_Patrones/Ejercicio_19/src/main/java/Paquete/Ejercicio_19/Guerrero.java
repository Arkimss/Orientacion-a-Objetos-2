	package Paquete.Ejercicio_19;
	
	import java.util.List;
	
	public class Guerrero extends Personaje{
	
		public Guerrero(String nombre, Arma arma, Armadura armadura, List<Habilidad> habilidades) {
			super(nombre, arma, armadura, habilidades);
			// TODO Auto-generated constructor stub
		}
	
		@Override
		public void golpear(Personaje objetivo) {
			// TODO Auto-generated method stub
			if(this.sigueVivo()) {
			objetivo.recibirGolpeEspada();
		}}
	
	}
