package wegennetwerk;

public class Weg {
	
	/**
	 * @peerObject
	 */
	Kruispunt startkruispunt;
	
	/**
	 * @peerObject
	 */
	Kruispunt eindkruispunt;
	
	/**
	 * @peerObject 
	 */
	public Kruispunt getStartkruispunt() {
		return startkruispunt;
	}
	
	/**
	 * @peerObject 
	 */

	public Kruispunt getEindkruispunt() {
		return eindkruispunt;
	}

//	public void setStartkruispunt(Kruispunt startkruispunt) {
//		this.startkruispunt = startkruispunt;
//	}
//
//	public void setEindkruispunt(Kruispunt eindkruispunt) {
//		this.eindkruispunt = eindkruispunt;
//	}
	
	/**
	 * @post | getStartkruispunt() == null
	 * @post | getEindkruispunt() == null
	 */
	public Weg() {}

}
