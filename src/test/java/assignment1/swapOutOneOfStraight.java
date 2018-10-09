package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutOneOfStraight {

	@Test
	public void testOneOfStraight() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(4));
		pokTest.game();
		assertEquals(5,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
