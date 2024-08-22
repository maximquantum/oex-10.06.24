package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import wegennetwerk.Kruispunt;
import wegennetwerk.Weg;

class KruispuntTest {

	Kruispunt naamsepoort = new Kruispunt();
	Weg kardinaalMercierlaan = new Weg();
	Kruispunt kantineplein = new Kruispunt();

	@Test
	void testKruispuntConstructor() {
		assertEquals(Set.of(), naamsepoort.getVertrekkendewegen());
		assertEquals(Set.of(), naamsepoort.getAankomendewegen());
	}
	
	@Test
	void testWegConstructor() {
		assertNull(kardinaalMercierlaan.getStartkruispunt());
		assertNull(kardinaalMercierlaan.getEindkruispunt());
	}
	
	@Test
	void testSetStartkruispunt() {
		kardinaalMercierlaan.setStartkruispunt(naamsepoort);
		assertSame(naamsepoort, kardinaalMercierlaan.getStartkruispunt());
		assertEquals(Set.of(kardinaalMercierlaan), naamsepoort.getVertrekkendewegen());		
	}
	
	@Test
	void testSetEindkruispunt() {
		kardinaalMercierlaan.setEindkruispunt(kantineplein);
		assertSame(kantineplein, kardinaalMercierlaan.getEindkruispunt());
		assertEquals(Set.of(kardinaalMercierlaan), kantineplein.getAankomendewegen());
	}
	
	@Test
	void testClearStartkruispunt() {
		kardinaalMercierlaan.setStartkruispunt(naamsepoort);
		kardinaalMercierlaan.clearStartkruispunt();
		assertNull(kardinaalMercierlaan.getStartkruispunt());
		assertEquals(Set.of(), naamsepoort.getVertrekkendewegen());
	}
	
	@Test
	void testClearEindkruispunt() {
		kardinaalMercierlaan.setEindkruispunt(kantineplein);
		kardinaalMercierlaan.clearEindkruispunt();
		assertNull(kardinaalMercierlaan.getEindkruispunt());
		assertEquals(Set.of(), kantineplein.getAankomendewegen());
	}

}
