package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class cardTestEquals {

	@Test
	public void royalTie() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(0));
		pokTest.game();
		assertEquals(10,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void straightFlush() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(1));
		pokTest.game();
		assertEquals(9,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void straightFlushSameRanks() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(2));
		pokTest.game();
		assertEquals(9,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void fourSame() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(3));
		pokTest.game();
		assertEquals(8,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void fullHouseRankSame() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(4));
		pokTest.game();
		assertEquals(7,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	
	@Test
	public void threeOfKindSame() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(5));
		pokTest.game();
		assertEquals(4,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void straightSameRank() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(6));
		pokTest.game();
		assertEquals(5,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void straightSameSuit() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(7));
		pokTest.game();
		assertEquals(5,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void testDualPairdifRank() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(8));
		pokTest.game();
		assertEquals(3,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void testDualPairSameRank() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(9));
		pokTest.game();
		assertEquals(3,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void testPairSameRank() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(10));
		pokTest.game();
		assertEquals(2,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void testPairDiffRank() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(11));
		pokTest.game();
		assertEquals(2,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	/*
	@Test
	public void testPairHighestSingle() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(12));
		pokTest.game();
		assertEquals(1,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	*/
	@Test
	public void testFlushSameRank() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(12));
		pokTest.game();
		assertEquals(6,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}
	@Test
	public void testFlushnotSame() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("equalHands.txt").get(13));
		pokTest.game();
		assertEquals(6,pokTest.returnHandRes(pokTest.AIP.returnHand()));
	}

}
