package Paquete.Ejercicio_15;

public class DecoratorName extends FileDecorator{

	
	
	public DecoratorName(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		
		// TODO Auto-generated method stub
		return super.prettyPrint() + "" + file.getNombre();
		
	}

}
