package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutTwoOfThreeOfKind {

	@Test
	public void testThreeOfKind() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(6));
		pokTest.game();
		assertEquals(8,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
