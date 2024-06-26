package Paquete.Ejercicio_16;

public class DecoratorPresion extends DecoratorWeather{

	public DecoratorPresion(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		
	return super.displayData() + "Presión atmosferica: " + this.getPresion() + ";";
	}

}
