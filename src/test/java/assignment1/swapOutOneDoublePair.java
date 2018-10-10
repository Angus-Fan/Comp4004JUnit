package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapOutOneDoublePair {

	@Test
	public void swapOutOne() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(9));
		pokTest.game();
		assertEquals(8,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
