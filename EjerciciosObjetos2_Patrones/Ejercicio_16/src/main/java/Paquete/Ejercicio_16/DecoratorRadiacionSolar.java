package Paquete.Ejercicio_16;

public class DecoratorRadiacionSolar  extends DecoratorWeather{

	public DecoratorRadiacionSolar(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		
	return super.displayData() + "Radiación solar: " + datos.getRadiacionSolar() + ";";
	}


}
