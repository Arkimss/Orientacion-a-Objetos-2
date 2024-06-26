package Paquete.Ejercicio_16;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData  {
	private HomeWeatherStation home;

	
	public HomeWeatherStationAdapter(HomeWeatherStation home) {
		this.home = home;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return home.getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return home.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return home.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return home.getTemperaturas();
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "";
	}
	

  
    
    
}
