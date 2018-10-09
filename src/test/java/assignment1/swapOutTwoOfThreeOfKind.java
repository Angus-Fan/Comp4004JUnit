package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutTwoOfThreeOfKind {

	@Test
	public void testStraightlLush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(5));
		pokTest.game();
		assertEquals(6,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
