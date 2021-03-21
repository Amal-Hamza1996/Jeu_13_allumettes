package allumettes;

import java.util.Random;

public class Naif implements Strategie {
	private Random tirage_aleatoire = new Random();

	/** le constructeur */
	public Naif() {
		
	}
	
	
	/** retourner le nombre d'allumettes prises 
	 * @param jeu.
	 */
	public int getPrise(Jeu jeu) {
		int nb_allumettes_prise = 0 ;
		if (jeu.getNombreAllumettes() >= JeuReel.PRISE_MAX) {
			nb_allumettes_prise = 1+tirage_aleatoire.nextInt(JeuReel.PRISE_MAX ) ;	
		}
		else {
			nb_allumettes_prise = 1+tirage_aleatoire.nextInt(jeu.getNombreAllumettes()); 
		}
		return nb_allumettes_prise ;
	}
}
