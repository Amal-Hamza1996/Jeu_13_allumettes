package allumettes;

public class Triche implements Strategie {
	
	/** le constructeur*/
	public Triche() {}
	
	
	
	/** retourner le nombre d'allumettes prises 
	 * @param jeu.
	 */
	public int getPrise(Jeu jeu) {
		// on retire tous les allumettes du jeu pour n'en laisser que deux.
		try{
			
			int nb_retire = jeu.getNombreAllumettes()-2;
			for (int i=0;i<nb_retire;i++) {
				jeu.retirer(1);
			}
			
		}
		catch(CoupInvalideException e) {
			
		}
		// tricheur repond à l'arbitre qu'il veut retirer une allumette.
		return 1;
	}

}
