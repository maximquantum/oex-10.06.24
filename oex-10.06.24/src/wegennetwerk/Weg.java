package wegennetwerk;

import logicalcollections.LogicalSet;

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
	public Kruispunt getStartkruispunt() { // done 3
		return startkruispunt;
	}
	
	/**
	 * @peerObject 
	 */

	public Kruispunt getEindkruispunt() { // done 4
		return eindkruispunt;
	}
	
	/**
	 * @throws IllegalStateException | getStartkruispunt() != null
	 * @throws IllegalArgumentException | startkruispunt == null 
	 * @mutates_proporties | getStartkruispunt(), startkruispunt.getVertrekkendewegen()
	 * @post | getStartkruispunt() != null
	 * @post | startkruispunt.getVertrekkendewegen().equals(LogicalSet.plus(old(startkruispunt.getVertrekkendewegen()), this))
	 */
	public void setStartkruispunt(Kruispunt startkruispunt) {
		if (this.startkruispunt != null)
			throw new IllegalStateException("Deze weg heeft al een startkruispunt");
		if (startkruispunt == null)
			throw new IllegalArgumentException("`startkruispunt` is null");
		
		this.startkruispunt = startkruispunt;
		startkruispunt.vertrekkendewegen.add(this);
	}
	
	/**
	 * @pre | getEindkruispunt() == null
	 * @pre | eindkruispunt != null
	 * @mutates_proporties | getEindkruispunt(), eindkruispunt.getAankomendewegen()
	 * @post | getEindkruispunt() != null
	 * @post | eindkruispunt.getAankomendewegen().equals(LogicalSet.plus(old(eindkruispunt.getAankomendewegen()), this))
	 */
	public void setEindkruispunt(Kruispunt eindkruispunt) {
		this.eindkruispunt = eindkruispunt;
		eindkruispunt.aankomendewegen.add(this);
	}
	
	/**
	 * @post | getStartkruispunt() == null
	 * @post | getEindkruispunt() == null
	 */
	public Weg() {}

}
