package Paquete.Ejercicio7;

import java.time.LocalDate;

public class Archivo extends Contenido {
private int sizeEnBytes;
	@Override
	protected int calcularEspacioOcupadoEnBytes() {
		// TODO Auto-generated method stub
		return this.sizeEnBytes;
	}
	@Override
	protected boolean esArchivo() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public LocalDate getFecha() {
		return this.fechaDeCreacion;
	}

}
