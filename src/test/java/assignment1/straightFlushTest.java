package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class straightFlushTest {

	@Test
	public void testStraightFlush() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(4));
		for(cardClass card : pokTest.AIP.returnHand()) {
			System.out.println(card.returnCardRank());
		}
		assertEquals(9,HIC.pokerHand(pokTest.AIP.returnHand()));
	}

}
