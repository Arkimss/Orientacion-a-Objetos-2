package Paquete.Ejercicio_16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataTest {
		private HomeWeatherStationAdapter adapter;
		private HomeWeatherStation data;
		private DecoratorMaximoCelsius temperaturaMaximaC;
		private DecoratorTemperaturaC temperaturaC;
		private DecoratorPromedioCelsius temperaturaPromedioC;
		private DecoratorMaximoFahrenheit temperaturaMaximaF,temperaturaMaximaFEj5;
		private DecoratorMinimoFahrenheit temperaturaMinimaF;
		private DecoratorRadiacionSolar radiacionSolar;
		
		
		@BeforeEach
		void setUp() throws Exception {
			List<Double> temperaturas= new ArrayList<Double>();
			temperaturas.add(41.0);
			temperaturas.add(10.0);
			temperaturas.add(10.0);
			data = new HomeWeatherStation(41.0,20.0,30.0,temperaturas);
			adapter = new HomeWeatherStationAdapter(data);
			temperaturaMaximaC = new DecoratorMaximoCelsius(adapter);
			temperaturaMaximaF = new DecoratorMaximoFahrenheit(temperaturaMaximaC);
		}
	    @Test
	    public void testTemperaturaMaximaC() {

	        assertEquals("5.0°C", temperaturaMaximaC.displayData());
	        
	    }
	    
	    @Test
	    public void testTemperaturaMaximaF() {
	    	
	        assertEquals("5.0°CMáximo: 41.0°F", temperaturaMaximaF.displayData());
	        
	    }
	    
	    
	    //Ej 5: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;”
	    @Test
	    public void testEjemplo5() {
	    	List<Double> temperaturas2= new ArrayList<Double>();
	    	temperaturas2.add(27.0);
			temperaturas2.add(31.0);
			temperaturas2.add(32.0);
	    	data = new HomeWeatherStation(86,1008.0,200.0,temperaturas2);
	    	adapter = new HomeWeatherStationAdapter(data);
	    	temperaturaC = new DecoratorTemperaturaC(adapter);
	    	radiacionSolar = new DecoratorRadiacionSolar(temperaturaC);
	    	temperaturaPromedioC  = new DecoratorPromedioCelsius(radiacionSolar);
	    	temperaturaMinimaF = new DecoratorMinimoFahrenheit(temperaturaPromedioC);
	    	temperaturaMaximaFEj5 = new DecoratorMaximoFahrenheit(temperaturaMinimaF);
	    	System.out.println(temperaturaMaximaFEj5.displayData());
	        assertEquals("Temperatura C: 30Presión atmosferica: 1008.0;Radiación solar: 200.0; Promedio: 30°F;Mínimo: 27°FMáximo: 32°F", temperaturaMaximaFEj5.displayData());
	        
	    }
}
