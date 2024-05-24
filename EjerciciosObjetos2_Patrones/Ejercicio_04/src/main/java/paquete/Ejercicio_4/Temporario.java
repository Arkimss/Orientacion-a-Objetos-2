package paquete.Ejercicio_4;

public class Temporario extends EmpleadoPago {

  private int cantidadDeHorasDeTrabajo;
  
/*public Temporario(boolean estaCasado, int cantidadDeHijos, int cantidadDeHorasDeTrabajo) {	
	super(estaCasado, cantidadDeHijos, cantidadDeHorasDeTrabajo);
	this.estaCasado = estaCasado;
	this.cantidadDeHijos = cantidadDeHijos;
	this.cantidadDeHorasDeTrabajo= cantidadDeHorasDeTrabajo;
}*/
  

public Temporario(int cantidadDeHorasDeTrabajo, boolean estaCasado, int cantidadDeHijos) {
	super();
	this.cantidadDeHorasDeTrabajo = cantidadDeHorasDeTrabajo;
	this.estaCasado = estaCasado;
	this.cantidadDeHijos = cantidadDeHijos;
}
@Override
double calcularBasico() {
	return 20000 + (this.cantidadDeHorasDeTrabajo * 300);
}
 
}
