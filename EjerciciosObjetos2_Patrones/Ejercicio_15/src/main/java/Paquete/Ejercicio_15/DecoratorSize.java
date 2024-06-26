package Paquete.Ejercicio_15;

public class DecoratorSize extends FileDecorator{

	public DecoratorSize(FileOO2 file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String prettyPrint() {
		
		// TODO Auto-generated method stub
		return super.prettyPrint() + " " + this.getSize();
		
	}

}
