package Paquete.Ejercicio_16;

public class DecoratorMaximoCelsius extends DecoratorWeather {
	public DecoratorMaximoCelsius(WeatherData home) {
		super(home);
		// TODO Auto-generated constructor stub
	}
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaMaximaEnCelsius = this.getTemperaturas().stream().mapToDouble(t -> ((t - 32) / 1.8) ).max().orElse(0);
		return super.displayData() + temperaturaMaximaEnCelsius  + "°C";
	}
}
