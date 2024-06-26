package Paquete.Ejercicio_16;

import java.util.List;

public abstract class DecoratorWeather implements WeatherData {
    protected WeatherData datos;
    
    
	public DecoratorWeather(WeatherData datos) {
		this.datos = datos;
	}
	public WeatherData getDatos() {
		return datos;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.getDatos().getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return  this.getDatos().getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return  this.getDatos().getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return datos.getTemperaturas();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "";
	}

}
