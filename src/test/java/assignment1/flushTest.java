package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class flushTest {
	@Test//test for flush
	public void testFourOfAKind() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("test.txt").get(8));
	
		assertEquals(9,HIC.pokerHand(pokTest.AIP.returnHand()));
	}

}
