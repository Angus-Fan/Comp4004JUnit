package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameTest {

	@Test
	public void testRoyalFlush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(0));
		pokTest.game();
		assertEquals(10,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
}
