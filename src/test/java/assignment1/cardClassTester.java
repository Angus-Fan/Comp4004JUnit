package assignment1;


import assignment1.cardClass.cardSuits;
import junit.framework.TestCase;

public class cardClassTester extends TestCase{
	
	public void testConstructor() {
		cardClass testCardDiamond = new cardClass(1,cardSuits.Diamond);
		cardClass testCardSpade = new cardClass(13,cardSuits.Spade);
		cardClass testCardClub = new cardClass(7,cardSuits.Club);
		cardClass testCardHeart = new cardClass(12,cardSuits.Heart);
		
		assertEquals("Diamond",testCardDiamond.returnSuitName());
		assertEquals(1,testCardDiamond.returnCardRank());
		
		assertEquals("Club",testCardClub.returnSuitName());
		assertEquals(7,testCardClub.returnCardRank());
		

		assertEquals("Heart",testCardHeart.returnSuitName());
		assertEquals(12,testCardHeart.returnCardRank());
		
		
		assertEquals("Spade",testCardSpade.returnSuitName());
		assertEquals(13,testCardSpade.returnCardRank());

	}
	
	
	public void testDeckConstructor() {
		deckClass deck = new deckClass();
		assertEquals(52,deck.checkLength());
	}
	
	
	public void testDeckUniqueness() {
		
		//This checks for original uniqueness when created
		deckClass testDeck = new deckClass();
		assertEquals(true,testDeck.noDuplicates());
		
		//This test card is added to the deck and the set, the set should ignore 
		//This variable is used to test if there are any duplicates		
		cardClass testDuplicateCard = new cardClass(1,cardSuits.Diamond);			
		testDeck.addToDeck(testDuplicateCard);
		testDeck.addToDeck(testDuplicateCard);
		assertEquals(false,testDeck.noDuplicates());
	}

}
