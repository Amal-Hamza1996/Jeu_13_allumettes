package allumettes;

public class JeuReel implements Jeu {
	/** le joueur ne peut pas prendre plus de 3 allumettes */
	public static final int PRISE_MAX = 3;
	
	/** le nombre d'allumettes en jeu */
	private int nb_allumettes;
	
	/** construire notre classe
	 * @param nombre_allumettes.  
	 */
	
	public JeuReel(int nombre_allumettes){
		this.nb_allumettes = nombre_allumettes;
	}
	
	/** obtenir le nombre d'allumettes restant en jeu */
	public int getNombreAllumettes(){
		return this.nb_allumettes;
	}
	
	/** Retirer des allumettes.
	 * @param nb nombre d'allumettes prises.
	 * @throws CoupInvalideException tentative de prendre un nombre invalide d'alumettes
	 */
	public void retirer (int nbPrises) throws CoupInvalideException {
		if (nbPrises > 0 && nbPrises <= JeuReel.PRISE_MAX && nbPrises <= this.nb_allumettes){
			this.nb_allumettes = this.nb_allumettes-nbPrises;
		}
		else{
			throw new CoupInvalideException(nb_allumettes);
		}
	}
	
	

}
