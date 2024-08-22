package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uitdrukkingen.LetterlijkeUitdrukking;
import uitdrukkingen.Optelling;
import uitdrukkingen.VariabeleUitdrukking;

class UitdrukkingenTest {

	LetterlijkeUitdrukking getal = new LetterlijkeUitdrukking(5);
	VariabeleUitdrukking var = new VariabeleUitdrukking("x");
	Optelling som = new Optelling(getal,var);
	
	@Test
	void testLetterlijkeUitdrukkingConstructor() {
		assertEquals(5, getal.getWaarde());
	}
	
	@Test
	void testVariabeleUitdrukkingConstructor() {
		assertEquals("x", var.getVariabelenaam());
	}
	
	@Test
	void testOptellingConstructor() {
		assertEquals(getal, som.getLinkeruitdrukking());
		assertEquals(var, som.getRechteruitdrukking());
	}
	
	@Test
	void testGetAantalVoorkomens() {
		assertEquals(1, som.getAantalVoorkomens("x"));
	}
	
	@Test
	void testEquals() {
		Optelling som2 = new Optelling(var,getal);
		assertNotEquals(som2, som);
	}

}
