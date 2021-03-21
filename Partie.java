package allumettes;

/** Lance une partie des 13 allumettes en fonction des arguments fournis
 * sur la ligne de commande.
 * @author	Xavier Crégut
 * @version	$Revision: 1.5 $
 */
public class Partie {

	/** Lancer une partie. En argument sont donnés les deux joueurs sous
	 * la forme nom@stratégie.
	 * @param args la description des deux joueurs
	 */
	public static void main(String[] args) {
		if (args[0].equals("-confiant")){
			try {
				verifierNombreArguments(args);
				/** on cree la partie initialisé avec un nombre initial d'allumettes*/
				JeuReel jeu = new JeuReel(13);
				/** les noms des joueurs*/
				String[] j1 = args[1].split("@");
				String[] j2 = args[2].split("@");
				/** les strategies*/
				Strategie strategie1 = strategieUtilise(j1[1]);
				Strategie strategie2 = strategieUtilise(j2[1]);
				/** creer les 2 joueurs*/
				Joueur joueur1 = new Joueur(j1[0], strategie1);
				Joueur joueur2 = new Joueur(j2[0], strategie2);
				
				/** arbitre */
				Arbitre arbitre = new Arbitre(joueur1,joueur2);
				arbitre.arbitrer(jeu);
			} catch (ConfigurationException e) {
				System.out.println();
				System.out.println("Erreur : " + e.getMessage());
				afficherUsage();
				System.exit(1);
			}
			
		}
		else {
			try {
				verifierNombreArguments(args);
				/** on cree la partie initialisé avec un nombre initial d'allumettes*/
				JeuReel jeu = new JeuReel(13);
				Procuration proxy = new Procuration(jeu);
				/** les noms des joueurs*/
				String[] j1 = args[0].split("@");
				String[] j2 = args[1].split("@");
				/** les strategies*/
				Strategie strategie1 = strategieUtilise(j1[1]);
				Strategie strategie2 = strategieUtilise(j2[1]);
				/** creer les 2 joueurs*/
				Joueur joueur1 = new Joueur(j1[0], strategie1);
				Joueur joueur2 = new Joueur(j2[0], strategie2);
				/** arbitre */
				ArbitreCaptureTriche arbitre = new ArbitreCaptureTriche(joueur1,joueur2);
				arbitre.arbitrer(jeu);
			} catch (ConfigurationException e) {
				System.out.println();
				System.out.println("Erreur : " + e.getMessage());
				afficherUsage();
				System.exit(1);
			}
			catch(OperationInterditeException e){
				System.out.println(e.getMessage());
				//System.exit(1);
			}
				
		}
	}

	private static void verifierNombreArguments(String[] args) {
		if (args.length < 2) {
			throw new ConfigurationException("Trop peu d'arguments : "
					+ args.length);
		}
		if (args.length > 3) {
			throw new ConfigurationException("Trop d'arguments : "
					+ args.length);
		}
	}

	/** Afficher des indications sur la manière d'exécuter cette classe. */
	public static void afficherUsage() {
		System.out.println("\n" + "Usage :"
				+ "\n\t" + "java allumettes.Partie joueur1 joueur2"
				+ "\n\t\t" + "joueur est de la forme nom@stratégie"
				+ "\n\t\t" + "strategie = naif | rapide | expert | humain | tricheur"
				+ "\n"
				+ "\n\t" + "Exemple :"
				+ "\n\t" + "	java allumettes.Partie Xavier@humain "
					   + "Ordinateur@naif"
				+ "\n"
				);
	}
	/** retourner la strategie utilisé par le joueur 
	 * @param strategie1 chaine de caractere associé a la strategie.
	 */
	public static Strategie strategieUtilise(String strategie1) {
		
		if (strategie1.equals("humain")){
			return new Humaine();
		}
		else if (strategie1.equals("naif")){
			return new Naif();
		}
		else if (strategie1.equals("rapide")){
			return new Rapide();
		}
		else if (strategie1.equals("expert")){
			return new Expert();
		}
		else if (strategie1.equals("tricheur")){
			return new Triche();
		}
		else{
			throw new ConfigurationException(strategie1);
		}
	}
}
