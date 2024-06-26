package Paquete.Ejercicio_15;

import java.time.LocalDate;

public interface FileOO2 {
	public abstract String prettyPrint();
	public String getNombre();
	public String getExtension();
	public double getSize();
	public LocalDate getFechaDeCreacion();
	public LocalDate getFechaDeModificacion();
	public String getPermisos();
}
