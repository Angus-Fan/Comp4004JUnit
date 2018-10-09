package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutOneOfFlush {

	@Test
	public void testStraightlLush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(3));
		pokTest.game();
		assertEquals(6,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
}
