package allumettes;

public class Rapide implements Strategie {
	
	
	/** le constructeur */
	public Rapide(){}
	
	
	/** retourner le nombre d'allumettes prises 
	 * @param jeu.
	 */
	public int getPrise(Jeu jeu){
		assert (jeu.getNombreAllumettes()>0);
		int nb_allumettes_prise = 0;
		if (jeu.getNombreAllumettes() > JeuReel.PRISE_MAX ){
			nb_allumettes_prise = JeuReel.PRISE_MAX;
		}
		else {
			int nb = jeu.getNombreAllumettes();
			nb_allumettes_prise = nb;
		}
		return nb_allumettes_prise;
	}
}
