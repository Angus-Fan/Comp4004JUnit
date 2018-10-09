package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class fullHouseTest {

	@Test//TEST FOR STRAIGHT FLUSH
	public void testFourOfAKind() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("test.txt").get(7));
	
		assertEquals(7,HIC.pokerHand(pokTest.AIP.returnHand()));
	}

}
