package Paquete.Ejercicio_15;
import java.time.LocalDate;

public class Archivo implements FileOO2{
		private String nombre;
		private String extension ;
		private double size;
		private LocalDate fechaDeCreacion;
		private LocalDate fechaDeModificacion;
		private String Permisos;
	
		public Archivo(String nombre, String extension, double size, LocalDate fechaDeCreacion,
				LocalDate fechaDeModificacion, String permisos) {
			super();
			this.nombre = nombre;
			this.extension = extension;
			this.size = size;
			this.fechaDeCreacion = fechaDeCreacion;
			this.fechaDeModificacion = fechaDeModificacion;
			Permisos = permisos;
		}
		public String getNombre() {
			return nombre;
		}
		public String getExtension() {
			return extension;
		}
		public double getSize() {
			return size;
		}
		public LocalDate getFechaDeCreacion() {
			return fechaDeCreacion;
		}
		public LocalDate getFechaDeModificacion() {
			return fechaDeModificacion;
		}
		public String getPermisos() {
			return Permisos;
		}
		
		public String prettyPrint()   {
			return "";
		}
	}
	
