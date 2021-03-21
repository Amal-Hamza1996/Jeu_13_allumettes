package allumettes;

public class OperationInterditeException extends RuntimeException {
	public OperationInterditeException(){
		super();
		System.out.println("Partie abandonnée car Tricheur a triché ! ");
		System.exit(1);
		
	}
}
