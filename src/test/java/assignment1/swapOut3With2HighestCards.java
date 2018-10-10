package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOut3With2HighestCards {

	@Test
	public void testSwapOut3KeepHighest() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(10));
		pokTest.game();
		assertEquals(8,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
