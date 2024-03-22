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

	
	
	
	
	
	
	
}
