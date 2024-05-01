package Paquete.Ejercicio_8;

import java.time.Duration;
import java.time.LocalDate;

public class ToDoItem {
	private String name;
	private Estado estado;
	private LocalDate tiempoDeInicio;
	private LocalDate tiempoDeFin;
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	        public ToDoItem(String name) {
	        	this.name= name;
	        	this.estado= new Pending();
	        	this.tiempoDeFin= null;
	        }
	        
	       
	   	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


		/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	        public void start() {
	        	this.estado.start();
	        	tiempoDeInicio= LocalDate.now();
	        	
	        }

		/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	        public void togglePause() {
	        	this.estado.togglePause();
	        }


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	        public void finish() {
	        	this.estado.finish();
	        	this.tiempoDeFin = LocalDate.now();
	        }


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
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

	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/

}
