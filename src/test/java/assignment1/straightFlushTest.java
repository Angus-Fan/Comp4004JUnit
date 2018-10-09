package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class straightFlushTest {

	@Test//TEST FOR STRAIGHT FLUSH
	public void testStraightFlush() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("test.txt").get(3));
	
		assertEquals(9,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	@Test//TEST FOR STRAGIHT FLUSH
	public void testStraightFlush2() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("test.txt").get(3));
		
		assertEquals(9,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	
	@Test//TEST FOR STRAIGHT NOT FLUSH should be 5
	public void testStraightFlush3() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("test.txt").get(4));
		
		assertEquals(5,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	@Test//Test FOR FLUSH NOT STRAIGHT
	public void testStraightFlush4() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("test.txt").get(5));
		
		assertEquals(6,HIC.pokerHand(pokTest.AIP.returnHand()));
	}

}
