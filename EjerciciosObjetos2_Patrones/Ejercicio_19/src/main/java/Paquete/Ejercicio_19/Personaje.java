package Paquete.Ejercicio_19;

import java.util.List;

public abstract class Personaje {
private int cantidadDeVida = 100;
 private String nombre;
 private Arma arma;
 private Armadura armadura;
 private List<Habilidad> habilidades;
 
public Personaje(String nombre, Arma arma, Armadura armadura, List<Habilidad> habilidades) {
	this.nombre = nombre;
	this.arma = arma;
	this.armadura = armadura;
	this.habilidades = habilidades;
}
 
public abstract void golpear(Personaje objetivo);

protected boolean sigueVivo() {
	return (this.cantidadDeVida > 0);
}
protected  void recibirGolpeBastonMagico() {
	if(this.sigueVivo()) {
	this.setVida(this.armadura.calcularDamageBastonMagico()); 
	}


}
protected  void recibirGolpeEspada() {
	if(this.sigueVivo()) {
	this.setVida(this.armadura.calcularDamageEspada());}
}
protected void recibirGolpeArco() {
	if(this.sigueVivo()) {
	this.setVida(this.armadura.calcularDamageArco()); }
}
 
	 void setVida(int damage) {
			if(this.sigueVivo()) {
	this.cantidadDeVida= this.cantidadDeVida - damage;}
}

public int getCantidadDeVida() {
	// TODO Auto-generated method stub
	return this.cantidadDeVida;
}

protected void recibirGolpeMartillo() {
	if(this.sigueVivo()) {
	this.setVida(this.armadura.calcularDamageMartillo()); 
	}

}

 
 
 
}
