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
	

	
}
