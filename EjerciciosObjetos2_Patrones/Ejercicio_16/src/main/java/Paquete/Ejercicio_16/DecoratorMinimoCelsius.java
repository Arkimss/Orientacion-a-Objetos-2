package Paquete.Ejercicio_16;

public class DecoratorMinimoCelsius  extends DecoratorWeather{

	public DecoratorMinimoCelsius(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaMinimaCelsius = this.getTemperaturas().stream().mapToDouble(t -> ((t - 32) / 1.8)).min().orElse(0.0); 
	return super.displayData() + "  Temperatura Minima: " + temperaturaMinimaCelsius + "°C";
	}


}
