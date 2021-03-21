package allumettes;

public class Arbitre {
	/** les deux joueurs  */
	private Joueur joueur1;
	private Joueur joueur2;
	
	/** construire la classe arbitre.
	 * @param j1 le premier joueur.
	 * @param j2 le deuxième joueur.
	 */
	public Arbitre(Joueur j1, Joueur j2){
		this.joueur1 = j1;
		this.joueur2 = j2;
	}
	
	/** jouer la partie.
	 * @param jeu le jeu en question
	 */
	public void arbitrer(Jeu jeu) {
		assert (jeu != null);
		boolean indicateur = true; // il va nous servir pour savoir le vainqueur de la partie.
		Joueur courant = joueur1; 
		int nb_allumettes_prise=0;
		while (jeu.getNombreAllumettes() > 0) {
			try{
				if (indicateur) {
					courant = this.joueur1;
				}
				else{
					courant = this.joueur2;
				}
				System.out.println("Nombre d'allumettes restantes : "+ jeu.getNombreAllumettes());
				System.out.println("Au tour de " + courant.getNom()+".");
				nb_allumettes_prise=courant.getPrise(jeu);
				if (nb_allumettes_prise == 1) {
					System.out.println(courant.getNom() + " prend " + nb_allumettes_prise + " allumette.");
				}
				else {
					System.out.println(courant.getNom() + " prend " + nb_allumettes_prise + " allumettes.");
				}
				jeu.retirer(nb_allumettes_prise);
				System.out.println("                                                 ");
				indicateur = !indicateur ;
				
			}
			catch(CoupInvalideException e){
				System.out.println("Erreur ! Prise invalide : "+ nb_allumettes_prise);
				System.out.println("Recommencez !");
				System.out.println("                                                       ");
			}
		}	
		if (indicateur == true){
			System.out.println(this.joueur2.getNom() +" a perdu !");
			System.out.println(this.joueur1.getNom() +" a gagné !");
		}
		else{
			System.out.println(this.joueur1.getNom() +" a perdu !");
			System.out.println(this.joueur2.getNom() +" a gagné !");
		}
	}
}
