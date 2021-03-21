package allumettes;
import org.junit.*;


import org.junit.rules.*;
import static org.junit.Assert.*;

public class TestRapide {
	
	Strategie strategie;
	JeuReel jeu1 = new JeuReel(13);
	JeuReel jeu2 = new JeuReel(3);
	JeuReel jeu3 = new JeuReel(2);
	JeuReel jeu4 = new JeuReel(1);
	
	
	@Before
	public void setUp(){
		this.strategie = new Rapide();
		
	}
		
	@Test
	public void testgetPrise(){
		assertEquals(this.strategie.getPrise(jeu1), 3);
		assertEquals(this.strategie.getPrise(jeu2), 3);
		assertEquals(this.strategie.getPrise(jeu3), 2);
		assertEquals(this.strategie.getPrise(jeu4), 1);
	}
		

	}




