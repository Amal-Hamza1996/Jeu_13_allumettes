package allumettes;
public class Joueur {
	/** le nom du joueur */
	private String nom;
	
	/** le nom du joueur */
	private Strategie strategie;
	
	
	 /** construire un joueur.
	 * @param nom le nom du joueur.
	 * @param nom la strategie choisie par le joueur.
	 */
	public Joueur(String nom , Strategie strategie){
		this.nom = nom ;
		this.strategie = strategie ;
	}
	
	/** retourner le nom du joueur */
	public String getNom(){
		return this.nom;
	}
	
	/** retourner la stratégie adoptée du joueur */
	public Strategie getStrategie(){
		return this.strategie;
	}
	
	/** On peut changer la stratégie du joueur.
	 * @param strategie2 
	 */
	public void setStrategie(Strategie strategie2){
		 this.strategie = strategie2;
	}
	
	/** demander au joueur le nombre d'allumettes qu'il veut prendre en fonction de la strategie.
	 * @param jeu La partie du jeu courante
	 */
	public int getPrise(Jeu jeu) {
		return strategie.getPrise(jeu);
	}
}
	


