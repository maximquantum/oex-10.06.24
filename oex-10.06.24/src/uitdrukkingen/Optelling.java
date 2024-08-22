package uitdrukkingen;

import java.util.Objects;

public class Optelling extends Uitdrukking {

	private Uitdrukking linkeruitdrukking;
	private Uitdrukking rechteruitdrukking;

	public Uitdrukking getLinkeruitdrukking() { return linkeruitdrukking; }
	public Uitdrukking getRechteruitdrukking() { return rechteruitdrukking; }
	
	/**
	 * @throws IllegalArgumentException | linkeruitdrukking == null
	 * @throws IllegalArgumentException | rechteruitdrukking == null
	 * 
	 * @post | getLinkeruitdrukking() == linkeruitdrukking
	 * @post | getRechteruitdrukking() == rechteruitdrukking
	 */
	public Optelling(Uitdrukking linkeruitdrukking, Uitdrukking rechteruitdrukking) {
		if (linkeruitdrukking == null)
			throw new IllegalArgumentException("`linkeruitdrukking` is null");
		if (rechteruitdrukking == null)
			throw new IllegalArgumentException("`rechteruitdrukking` is null");
		
		this.linkeruitdrukking = linkeruitdrukking;
		this.rechteruitdrukking = rechteruitdrukking;
	}
	
	/**
	 * @throws IllegalArgumentException | variabele == null
	 * 
	 * @post | result == getLinkeruitdrukking().getAantalVoorkomens(variabele) + getRechteruitdrukking().getAantalVoorkomens(variabele)
	 */
	@Override
	public int getAantalVoorkomens(String variabele) {
		return linkeruitdrukking.getAantalVoorkomens(variabele) + rechteruitdrukking.getAantalVoorkomens(variabele);
	}
	@Override
	public int hashCode() {
		return Objects.hash(linkeruitdrukking, rechteruitdrukking);
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Optelling o && linkeruitdrukking.equals(o.linkeruitdrukking) && rechteruitdrukking.equals(o.rechteruitdrukking);
	}
	
	
	
}
