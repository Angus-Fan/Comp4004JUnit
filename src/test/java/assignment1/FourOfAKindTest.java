package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FourOfAKindTest {

	@Test//TEST FOR STRAIGHT FLUSH
	public void testFourOfAKind() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(6));
	
		assertEquals(8,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	/*
	@Test//TEST FOR STRAIGHT FLUSH
	public void testFourOfAKind2() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(5));
	
		assertEquals(0,HIC.pokerHand(pokTest.AIP.returnHand()));
	}*/

}
