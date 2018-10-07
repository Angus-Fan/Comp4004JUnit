package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class royalFlushTest {

	@Test
	public void test() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(0));
		
		assertEquals(10,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	//Equivalence for for not flush
	@Test
	public void test2() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(1));
		
		assertEquals(0,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	@Test
	//Equavalence for not straight
	public void test3() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(2));
		
		assertEquals(0,HIC.pokerHand(pokTest.AIP.returnHand()));
	}
	@Test
	public void test4() {
		handIdentifierClass HIC = new handIdentifierClass();
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile().get(3));
		
		assertEquals(0,HIC.pokerHand(pokTest.AIP.returnHand()));
	}

}
