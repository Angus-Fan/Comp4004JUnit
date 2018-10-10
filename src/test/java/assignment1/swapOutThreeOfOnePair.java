package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutThreeOfOnePair {

	@Test
	public void testSwapOutThree() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(9));
		pokTest.game();
		assertEquals(8,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
