package Paquete.Ejercicio_11;

public interface Etapa {

	void aprobarEtapa( Proyecto proyect);
	boolean verificarMargen(double nuevoMargen);
	void modificarMargenDeGanancia(double nuevoMargen, Proyecto p);

}
