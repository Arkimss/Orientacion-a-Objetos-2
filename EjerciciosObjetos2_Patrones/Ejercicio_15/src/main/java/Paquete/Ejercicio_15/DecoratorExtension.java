package Paquete.Ejercicio_15;

import java.time.LocalDate;

public class DecoratorExtension extends FileDecorator {

	public DecoratorExtension(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return super.prettyPrint() + " " + this.getExtension();
	}

	
}
