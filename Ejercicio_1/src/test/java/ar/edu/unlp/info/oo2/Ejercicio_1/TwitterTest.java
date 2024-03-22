/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	User james;
	User guido;
	Tweet deGuido;
	Tweet deJames;
	Retweet delTweetDeGuido;
	Twitter x;
	User screenNameRepetido;
	
	@BeforeEach
	void setUp() throws Exception {
		x= new Twitter();
		james = new User("James");
		deGuido= new Tweet("Soy Un Crack");
		deJames= new Tweet("Soy James");
		 
		
		james= x.agregarUser("James");
	
	}
	

    @Test
    public void agregarUserTest() {
    	 //ScreenName Repetido
    	 screenNameRepetido = x.agregarUser("James");
    	 guido= x.agregarUser("guido");
    	assertFalse(x.existeUser(screenNameRepetido));
    	assertTrue(x.existeUser(guido));
    }
    
	
    @Test
    public void eliminarUserTest() {
    	Tweet t= guido.postear("Soy Un Crack ");
    	Retweet rt= james.reTweetear(t);
    	assertTrue(rt.esIgual(t));
    	x.eliminarUser(guido);
    	assertFalse(james.getTweets().contains(t));
    	
    }
}
