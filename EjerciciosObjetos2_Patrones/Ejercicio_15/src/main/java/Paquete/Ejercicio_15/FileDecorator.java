package Paquete.Ejercicio_15;

import java.time.LocalDate;

public abstract class FileDecorator implements FileOO2{
	protected FileOO2 file;

	
	public FileDecorator(FileOO2 file) {
		this.file= file;
	}
	
	
	public String prettyPrint()   {
		return file.prettyPrint() + "";
	}


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return file.getNombre();
	}


	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return file.getExtension();
	}


	@Override
	public double getSize() {
		// TODO Auto-generated method stub
		return file.getSize();
	}


	@Override
	public LocalDate getFechaDeCreacion() {
		// TODO Auto-generated method stub
		return file.getFechaDeCreacion();
	}


	@Override
	public LocalDate getFechaDeModificacion() {
		// TODO Auto-generated method stub
		return file.getFechaDeModificacion();
	}


	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return file.getPermisos();
	}
}
