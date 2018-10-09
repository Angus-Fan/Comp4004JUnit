package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutOneOffFullHouse {

	@Test
	public void testStraightlLush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(2));
		pokTest.game();
		assertEquals(7,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
