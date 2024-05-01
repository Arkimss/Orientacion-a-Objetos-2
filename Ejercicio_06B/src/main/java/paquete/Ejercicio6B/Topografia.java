package paquete.Ejercicio6B;

public interface Topografia {
 
	double calcularProporcionDeAgua();
	double calcularProporcionDeTierra();
	boolean sonIguales(Topografia t);
	boolean igualAgua();
	boolean igualTierra();
	boolean igualMixta(Mixta t);
	boolean igualPantano();	
}
