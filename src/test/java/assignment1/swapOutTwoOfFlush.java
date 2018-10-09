package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutTwoOfFlush {

	@Test
	public void testFlushOf3() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(5));
		pokTest.game();
		assertEquals(6,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
}
