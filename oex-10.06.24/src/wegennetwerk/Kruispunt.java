package wegennetwerk;

import java.util.HashSet;
import java.util.Set;

public class Kruispunt {
	
	/**
	 * @representationObject
	 * @peerObjects
	 */
	Set<Weg> vertrekkendewegen = new HashSet<>();
	
	/**
	 * @representationObject
	 * @peerObjects
	 */
	Set<Weg> aankomendewegen = new HashSet<>();
	
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 * @peerObjects
	 */
	public Set<Weg> getVertrekkendewegen() {
		return Set.copyOf(vertrekkendewegen);
	}


	/**
	 * @peerObjects
	 */
	public Set<Weg> getAankomendewegen() {
		return Set.copyOf(aankomendewegen);
	}



//	public void setAankomendewegen(Set<Weg> aankomendewegen) {
//		this.aankomendewegen = aankomendewegen;
//	}
//
//
//
//	public void setVertrekkendewegen(Set<Weg> vertrekkendewegen) {
//		this.vertrekkendewegen = vertrekkendewegen;
//	}



	/**
	 * @post | getVertrekkendewegen().isEmpty()
	 * @post | getAankomendewegen().isEmpty()
	 */
	public Kruispunt() {}

}
