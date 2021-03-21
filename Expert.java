package allumettes;
import java.util.Random;

public class Expert implements Strategie{
	
	/** pour le tirage aléatoire */
	private Random tirage_aleatoire = new Random();
	
	
	/** le constructeur */
	public Expert(){}
	
	
	/** retourner le nombre d'allumettes prises 
	 * @param jeu.
	 */ 
	public int getPrise(Jeu jeu){
		int nb_allumettes_prise = 0;
		assert(jeu.getNombreAllumettes() > 0);
		if (jeu.getNombreAllumettes() == JeuReel.PRISE_MAX) {
			nb_allumettes_prise = 2;
		}
		else if (jeu.getNombreAllumettes() == JeuReel.PRISE_MAX - 1){
			nb_allumettes_prise = 1;
		}
		else if (jeu.getNombreAllumettes() == JeuReel.PRISE_MAX + 1) {
			nb_allumettes_prise = 3;
		}
		else if (jeu.getNombreAllumettes() == JeuReel.PRISE_MAX - 2) {
			nb_allumettes_prise = 1;
		}
		else if (jeu.getNombreAllumettes() == JeuReel.PRISE_MAX + 3) {
			nb_allumettes_prise = 1;
		}
		else if (jeu.getNombreAllumettes() == JeuReel.PRISE_MAX +4){
			nb_allumettes_prise = 1+tirage_aleatoire.nextInt(JeuReel.PRISE_MAX-1 );
		}
		else {
			nb_allumettes_prise = 1+tirage_aleatoire.nextInt(JeuReel.PRISE_MAX );
		}
		return nb_allumettes_prise;
	}
}
