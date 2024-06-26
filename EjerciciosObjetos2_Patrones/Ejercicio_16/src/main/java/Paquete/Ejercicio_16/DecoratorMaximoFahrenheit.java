package Paquete.Ejercicio_16;

public class DecoratorMaximoFahrenheit extends DecoratorWeather {

	public DecoratorMaximoFahrenheit(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaMaximaFahrenheit = this.getTemperaturas().stream().mapToDouble(t -> t ).max().orElse(0.0);
		return super.displayData() + "Máximo: " + temperaturaMaximaFahrenheit + "°F";
	}

}
