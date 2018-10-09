package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameTest {

	@Test
	public void test() {
		
		pokerClass pokTest = new pokerClass();
		
		pokTest.constructCards(pokTest.readFile("game.txt").get(0));
		pokTest.game();
	}
}
