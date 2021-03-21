package allumettes;

public class Procuration implements Jeu {
	
	private Jeu capturetriche;
	
	/** le constructeur*/
	public Procuration(Jeu jeu){
		this.capturetriche = jeu;
	}
	
	/** Obtenir le nombre d'allumettes encore en jeu.
	 * @return nombre d'allumettes encore en jeu
	 */
	@Override
	public int getNombreAllumettes(){
		return this.capturetriche.getNombreAllumettes();
	}
	
	/** Retirer des allumettes.  Le nombre d'allumettes doit Ãªtre compris
	 * entre 1 et PRISE_MAX, dans la limite du nombre d'allumettes encore
	 * en jeu.
	 * @param nbPrises nombre d'allumettes prises.
	 * @throws OperationInterditeException 
	 * @throws CoupInvalideException tentative de prendre un nombre invalide d'alumettes
	 */
	@Override
	public void retirer(int nbPrises) throws CoupInvalideException {
		try {
			throw new OperationInterditeException();
		} catch (OperationInterditeException e) {
			System.out.println(e.getMessage());
		}
	}

}
