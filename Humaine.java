package allumettes;
import java.util.Scanner;


public class Humaine implements Strategie {
	
	private Scanner scanner = new Scanner(System.in);
	/** le constructeur*/
	public Humaine(){}
	/** retourner le nombre d'allumettes prises 
	 * @param jeu.
	 */
	public int getPrise(Jeu jeu){
		int nb_allumettes_prise = 0;
		while (jeu.getNombreAllumettes() > 0 && nb_allumettes_prise == 0 ){
			try{
				System.out.print("Combien prenez-vous d'allumettes ? ");
				int nb = Integer.parseInt(scanner.nextLine());
				nb_allumettes_prise = nb;
			}
			catch(NumberFormatException e){
			System.out.println("Vous devez donner un entier compris entre 1 et " + JeuReel.PRISE_MAX+".");
			}
		}
		return nb_allumettes_prise;
	}
}
