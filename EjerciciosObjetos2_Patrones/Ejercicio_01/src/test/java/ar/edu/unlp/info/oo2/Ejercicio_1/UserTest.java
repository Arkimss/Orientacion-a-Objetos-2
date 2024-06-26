package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

	User juan;
	Tweet ConMasDe280Caracteres;
	Tweet sinCaracteres;
	Tweet normal;
	
	@BeforeEach
	void setUp() throws Exception {
		juan= new User("Juan");
	}
	
	 @Test
	    public void postearTest() {
		 sinCaracteres= juan.postear(""); //Posteo un tweet sin caracteres, no deberìa crearse.
		 ConMasDe280Caracteres= juan.postear("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
		 		+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
		 		+ ". Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");// Posteo un tweet de 281 caracteres, tampoco deberìa agregarlo.
		 normal= juan.postear("Buenos Dias");
		 
		 assertFalse(juan.getTweets().contains(ConMasDe280Caracteres));
		 assertFalse(juan.getTweets().contains(sinCaracteres));
		 assertTrue(juan.getTweets().contains(normal));
	 
	 }
}
