package ar.edu.unlp.info.oo2.Ejercicio_1;

public class Tweet implements Post{
	
	private String contenido;
	
	public String leerPost() {
		return this.contenido;
	}
	public Tweet(String texto) {
		// TODO Auto-generated constructor stub
		this.contenido= texto;
	}
	
	public boolean esIgual(Post tweet) {
		return this == tweet;
	}
	@Override
	public String toString() {
		return "Tweet [contenido=" + contenido + "]";
	}
	@Override
	public boolean esRetweet() {
		return false;
	}
	
	
	
	
}
