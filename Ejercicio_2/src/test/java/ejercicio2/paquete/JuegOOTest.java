/**
 * 
 */
package ejercicio2.paquete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegOOTest {
	
	Papel paper;
	JuegOO game;
	Tijera scissors;
	Piedra rock;
	Spock spock;
	Lagarto lagartija;
	
	@BeforeEach
	void setUp() throws Exception {
		paper = new Papel();
		scissors = new Tijera();
		game= new JuegOO();
		rock= new Piedra();
		lagartija= new Lagarto();
		spock= new Spock();
	}
    @Test
    public void testPapelyTijeras() {
        assertEquals("Gana Tijeras", game.jugar(scissors, paper));
        assertEquals("Gana Tijeras", game.jugar(paper,scissors));

        
    }
    @Test
    public void testPiedrayTijeras() {
        assertEquals("Gana Piedra", game.jugar(scissors, rock));
        assertEquals("Gana Piedra", game.jugar(rock,scissors));

        
    }
    @Test
    public void testPapelyPiedra() {
        assertEquals("Gana Papel", game.jugar(rock, paper));
        assertEquals("Gana Papel", game.jugar(paper,rock));

        
    }
    @Test
    public void empatesTests() {
        assertEquals("Empate", game.jugar(scissors, scissors));
        assertEquals("Empate", game.jugar(paper,paper));
        assertEquals("Empate", game.jugar(rock,rock));

        
    }

    @Test
    public void testSpock() {
        assertEquals("Gana Spock", game.jugar(Spock, rock));
        assertEquals("Gana Piedra", game.jugar(rock,scissors));

        
    }
    
}
