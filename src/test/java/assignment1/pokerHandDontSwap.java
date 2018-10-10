package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class pokerHandDontSwap {


	@Test
	public void keepRoyal() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(0));
		pokTest.game();
		assertEquals(10,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	

	@Test
	public void keepStraightFlush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(1));
		pokTest.game();
		assertEquals(9,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	

	@Test
	public void keepFourOfKind() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(2));
		pokTest.game();
		assertEquals(8,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	

	@Test
	public void keepFullHouse() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(3));
		pokTest.game();
		assertEquals(7,pokTest.returnHandRes(pokTest.AIP.returnHand()));
		

		pokTest = new pokerClass();
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(4));
		pokTest.game();
		assertEquals(7,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void keepFlush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(5));
		pokTest.game();
		assertEquals(6,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

	@Test
	public void keepStraight() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(6));
		pokTest.game();
		assertEquals(5,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void straightBeats() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(7));
		pokTest.game();
		assertEquals(5,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void threeBeats() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(8));
		pokTest.game();
		assertEquals(4,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void dualpairBeatsOnePair() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(9));
		pokTest.game();
		assertEquals(3,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void dualBeatsSingleHigh() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("pokerHands.txt").get(10));
		pokTest.game();
		assertEquals(2,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	


}
