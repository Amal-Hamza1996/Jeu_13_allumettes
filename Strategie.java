package allumettes;

public interface Strategie {
	/** retourner le nombre d'allumettes prises en fonction de la strategie
	 * @param jeu.
	 */
	public int getPrise(Jeu jeu);
}
