package Paquete.Ejercicio_8;

import java.time.Duration;
import java.time.LocalDate;

public class ToDoItem {
	private String name;
	private Estado estado;
	private LocalDate tiempoDeInicio;
	private LocalDate tiempoDeFin;

	        public ToDoItem(String name) {
	        	this.name= name;
	        	this.estado= new Pending();
	        	
	        }
	        
	        public void setEstado(Estado estado) {
	        	this.estado = estado;
	        }

	        public void start() {
	        	this.estado.start(this);
	        	tiempoDeInicio= LocalDate.now();
	        	
	        }

	        public void togglePause() {
	        	this.estado.togglePause(this);
	        }

	        public void finish() {
	        	this.estado.finish(this);
	        	this.tiempoDeFin = LocalDate.now();
	        }

	        public Duration workedTime()
	        {
	        	if (tiempoDeInicio == null) {
	                throw new RuntimeException("El ToDoItem no se inició");
	            }
	        	if(tiempoDeFin!=null) {
				return Duration.between(tiempoDeInicio,tiempoDeFin);
	        	}
	        	else {
	        		return Duration.between(tiempoDeInicio,LocalDate.now());
	        	}
	        }

}
