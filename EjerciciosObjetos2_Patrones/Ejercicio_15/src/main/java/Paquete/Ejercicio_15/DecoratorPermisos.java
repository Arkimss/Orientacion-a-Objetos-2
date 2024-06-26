package Paquete.Ejercicio_15;

public class DecoratorPermisos extends FileDecorator {

	public DecoratorPermisos(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String prettyPrint() {
		
		// TODO Auto-generated method stub
		return super.prettyPrint() + " " + this.getPermisos();
		
	}

}
