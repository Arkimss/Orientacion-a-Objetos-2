package Paquete.Ejercicio_16;

public class DecoratorMinimoFahrenheit extends DecoratorWeather{

	public DecoratorMinimoFahrenheit(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaMinimaFahrenheit = this.getTemperaturas().stream().mapToDouble(t -> t ).min().orElse(0.0); 
	return super.displayData() + "Mínimo: " + temperaturaMinimaFahrenheit + "°F";
	}

}
