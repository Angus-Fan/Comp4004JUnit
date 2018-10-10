package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutTwoOfSequenceThree {

	@Test
	public void testSequence3() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(7));
		pokTest.game();
		assertEquals(5,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
