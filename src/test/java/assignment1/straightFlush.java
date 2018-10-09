package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class straightFlush {

	@Test
	public void testStraightlLush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(1));
		pokTest.game();
		assertEquals(9,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
}
