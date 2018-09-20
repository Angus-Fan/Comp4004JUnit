package assignment1;


import assignment1.cardClass.cardSuits;
import junit.framework.TestCase;

public class cardClassTester extends TestCase{
	
	public void testConstructor() {
		cardClass testCardDiamond = new cardClass(1,cardSuits.Diamond);
		cardClass testCardSpade = new cardClass(13,cardSuits.Spade);
		
		assertEquals("Diamond",testCardDiamond.returnSuitName());
		assertEquals("Spade",testCardSpade.returnSuitName());
		
		
		
		

	}

}
