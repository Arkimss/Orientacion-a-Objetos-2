package ar.edu.unlp.info.oo2.Ejercicio_1;
import java.util.ArrayList;
import java.util.List;
public class Twitter {
	private List<User> users;

	public Twitter() {
		this.users = new ArrayList<User>();
	} 
	
	public boolean verificarScreenName(String sn) {
		//Si se encuentra un usuario con el mismo SN, se retorna false, si no true
		return !this.users.stream().anyMatch(u -> u.verificarScreenName(sn));

	}
	public User agregarUser(String newUSer) {
		User res= null;
		if(this.verificarScreenName(newUSer)) {
			res=new User(newUSer);
			this.users.add(res);
		}
		return res;
	}
	
	public boolean existeUser(User user) {
		return this.users.contains(user);
	}
	public void eliminarUser(User user) {
		if(existeUser(user)) {
			this.users.remove(user);
			this.users.stream().forEach(u -> u.compararTweets(user));
			user.eliminarTweets();
			
		}
		}
		
		
  // recomendación del ayudante, Metodo recursivo, 
	//Compara los tweets entre el usuario que va a ser eliminado y otro usuario, verificando que no haya ningun retweet en el otro usuario. 
		public void eliminarTweets(User user) {
			for(Post tweet : user.getTweets()){ // Itero por cada tweet del usuario que voy a eliminar.
				Post elementoABorrar= this.tweets.stream().filter(t -> t.esIgual(tweet)).findFirst().orElse(null);
				if(elementoABorrar != null) {
				 
				this.tweets.remove(elementoABorrar);
				}
			   }     
			}
		public void eliminarTweet(Tweet tweet) {
			User aux= this.users.stream().filter(u -> u.tieneTweet(tweet)).findFirst().orElse(null);
			if(aux != null) {
				aux.eliminarTweet(tweet);
				obtenerTodosLosRetweets();
				obtenerRetweetsQueCoincidan();
				this.eliminarTweets(reTweet);
			}
		}
	
	
	
	
	
	
	
}
