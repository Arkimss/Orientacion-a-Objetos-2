package Paquete.Ejercicio_16;

import java.util.List;
import java.util.ArrayList;

public class HomeWeatherStation implements WeatherData{
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		super();
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = temperaturas;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.temperatura;
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return this.presion;
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return 	this.radiacionSolar;
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		
		return temperaturas;
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "";
	}

}
