package ar.edu.unlp.info.oo2.Ejercicio_1;

public class Retweet implements Post {
	private Tweet postOriginal;

	
	public Retweet(Tweet postOriginal) {
		this.postOriginal = postOriginal;
	}


	
	public boolean esIgual(Post tweet) {
		
		return this.postOriginal == tweet;
	}


	@Override
	public String leerPost() {
		return this.postOriginal.leerPost();
	}


	@Override
	public String toString() {
		return "Retweet [postOriginal=" + postOriginal.leerPost() + "]";
	}



	@Override
	public boolean esRetweet() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
