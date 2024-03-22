package ar.edu.unlp.info.oo2.Ejercicio_1;
import java.util.ArrayList;
import java.util.List;
public class User {

	private String screenName;
	private List<Post> tweets;
	

	public User(String screenName) {
		this.screenName= screenName;
		this.tweets = new ArrayList<Post>();
	}
	
	private boolean verificarLengthString (String texto) {
		return (texto.length() >= 1) && (texto.length() <= 280) ;
	}
	
	public Tweet postear(String texto) {
		Tweet nuevo= null;
		if(this.verificarLengthString(texto)) {
			 nuevo= new Tweet(texto);
			this.tweets.add(nuevo);
		}
		return nuevo;
	}
	public Retweet reTweetear(Tweet original) {
		//hago que retorne por el test
		Retweet r=  new Retweet(original);
		this.tweets.add(r);
		return r;
		
   }

	public boolean verificarScreenName(String screenName) {
		return this.screenName.equals(screenName);
	}

	public void eliminarTweets() {
		this.tweets.clear();
	}
	
// Devuelvo una copia de la lista para que no pueda ser modificada
	public List<Post> getTweets() {
		List<Post> res= new ArrayList<Post>();
		res.addAll(tweets);
		return res;
	}
	//Compara los tweets entre el usuario que va a ser eliminado y otro usuario, verificando que no haya ningun retweet en el otro usuario. 
	public void compararTweets(User user) {
		for(Post tweet : user.getTweets()){ // Itero por cada tweet del usuario que voy a eliminar.
			Post elementoABorrar= this.tweets.stream().filter(t -> t.esIgual(tweet)).findFirst().orElse(null);
			if(elementoABorrar != null) {
			this.tweets.remove(elementoABorrar);
			}
		   }     
		}
	//Idea: Hacer una lista de retweets.
	

	/*@Override
	public String toString() {
		 String aux= " ";
		 for (Post tweet : tweets) {
	           aux = aux + screenName + "tweets=" + tweet.toString() + "\n";
	        }
	        return aux;
	    }*/
			}
		

