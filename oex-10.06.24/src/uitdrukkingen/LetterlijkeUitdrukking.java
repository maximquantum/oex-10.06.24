package uitdrukkingen;

import java.util.Objects;

public class LetterlijkeUitdrukking extends Uitdrukking {
	
	private int waarde;
	
	public int getWaarde() { return waarde; }

	/**
	 * @post | getWaarde() == waarde
	 */
	public LetterlijkeUitdrukking(int waarde) {
		this.waarde = waarde;
	}
	
	/**
	 * @throws IllegalArgumentException | variabele == null
	 * 
	 * @post | result == 0
	 */
	@Override
	public int getAantalVoorkomens(String variabele) {
		if (variabele == null) { throw new IllegalArgumentException("`variabele` is null"); }
		
		return 0;
	}

	@Override
	public int hashCode() {
		return waarde;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof LetterlijkeUitdrukking u && waarde == u.waarde;
	}
	
	

}
