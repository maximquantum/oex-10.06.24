package uitdrukkingen;

public class LetterlijkeUitdrukking extends Uitdrukking {
	
	private int waarde;
	
	public int getWaarde() { return waarde; }

	/**
	 * @post | getWaarde() == waarde
	 */
	public LetterlijkeUitdrukking(int waarde) {
		this.waarde = waarde;
	}
	
	

}
