package uitdrukkingen;

public class VariabeleUitdrukking extends Uitdrukking {
	
	private String variabelenaam;
	
	public String getVariabelenaam() { return variabelenaam; }

	/**
	 * @throws IllegalArgumentException | variabelenaam == null
	 * @post | getVariabelenaam() == variabelenaam
	 */
	public VariabeleUitdrukking(String variabelenaam) {
		if (variabelenaam == null)
			throw new IllegalArgumentException("`variabelenaam` is null");
		this.variabelenaam = variabelenaam;
	}
	
	/**
	 * @throws IllegalArgumentException | variabele == null
	 * 
	 * @post | result == (variabele.equals(getVariabelenaam()) ? 1 : 0)
	 */
	@Override
	public int getAantalVoorkomens(String variabele) {
		if (variabele == null) { throw new IllegalArgumentException("`variabele` is null"); }
		
		return variabele.equals(variabelenaam) ? 1 : 0;
	}
	
	
	
}
