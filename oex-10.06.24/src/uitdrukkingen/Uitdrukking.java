package uitdrukkingen;

public abstract class Uitdrukking {
	
	/**
	 * @throws IllegalArgumentException | variabele == null
	 * 
	 * @post | 0 <= result
	 * 
	 * Behavioural subtyping betekent dat de specificatie van een
	 * overschrijvende methode een verstrenging moet zijn van de
	 * specificatie van de overschreven methode. De
	 * specificatie van de methodes `getAantalVoorkomens` in klassen
	 * LetterlijkeUitdrukking, VariabeleUitdrukking, en Optelling
	 * moeten dus verstrengingen zijn van deze specificatie.
	 */
	public abstract int getAantalVoorkomens(String variabele);
}
