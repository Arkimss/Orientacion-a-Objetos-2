package Paquete.Ejercicio7;

import java.time.LocalDate;

abstract class Contenido {
	protected String nombre;
	protected LocalDate fechaDeCreacion;
	
	
	protected abstract int calcularEspacioOcupadoEnBytes();
	protected abstract Archivo archivoMasGrande();
	
}
