package Paquete.Ejercicio_16;

public class DecoratorPromedioFahrenheit  extends DecoratorWeather{

	public DecoratorPromedioFahrenheit(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaPromedioFahrenheit = this.getTemperaturas().stream().mapToDouble(t -> t ).average().orElse(0); 
	return super.displayData() + "Promedio: " + temperaturaPromedioFahrenheit + "°F;";
	}


}
