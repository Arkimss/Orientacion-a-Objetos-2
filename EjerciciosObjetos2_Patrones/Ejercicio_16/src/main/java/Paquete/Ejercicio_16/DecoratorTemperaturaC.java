package Paquete.Ejercicio_16;

public class DecoratorTemperaturaC  extends DecoratorWeather{

	public DecoratorTemperaturaC(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		double temperaturaC = ((this.getTemperatura() - 32) / 1.8);
	return super.displayData() + "Temperatura C: " + temperaturaC;
	}

}
