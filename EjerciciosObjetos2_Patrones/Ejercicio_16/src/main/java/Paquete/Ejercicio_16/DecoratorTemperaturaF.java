package Paquete.Ejercicio_16;

public class DecoratorTemperaturaF extends DecoratorWeather{

	public DecoratorTemperaturaF(WeatherData datos) {
		super(datos);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
	return super.displayData() + "Temperatura F: " + this.getTemperatura();
	}

}
