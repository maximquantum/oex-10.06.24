package wegennetwerk;

import java.util.HashSet;
import java.util.Set;

public class Kruispunt {
	
	/**
	 * @peerObjects
	 */
	Set<Weg> vertrekkendewegen = new HashSet<>();
	
	/**
	 * @peerObjects
	 */
	Set<Weg> aankomendewegen = new HashSet<>();
	
	
	/**
	 * @peerObjects
	 */
	public Set<Weg> getVertrekkendewegen() {
		return vertrekkendewegen;
	}


	/**
	 * @peerObjects
	 */
	public Set<Weg> getAankomendewegen() {
		return aankomendewegen;
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
