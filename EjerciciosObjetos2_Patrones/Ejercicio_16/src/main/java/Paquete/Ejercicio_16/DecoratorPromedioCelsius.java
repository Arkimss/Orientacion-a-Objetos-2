package Paquete.Ejercicio_16;

public class DecoratorPromedioCelsius extends DecoratorWeather{

	public DecoratorPromedioCelsius(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaPromedioCelsius = this.getTemperaturas().stream().mapToDouble(t -> ((t - 32) / 1.8) ).average().orElse(0); 
	return super.displayData() + "  Promedio C: " + temperaturaPromedioCelsius + "°C";
	}

}
