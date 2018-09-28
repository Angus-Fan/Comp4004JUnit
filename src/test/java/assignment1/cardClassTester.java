package assignment1;

import junit.framework.TestCase;

public class cardClassTester extends TestCase{
	
	
	//Test if the cards are made correctly
	public void testConstructor() {
		cardClass testCardDiamond = new cardClass("1","D");
		cardClass testCardSpade = new cardClass("K","S");
		cardClass testCardClub = new cardClass("7","C");
		cardClass testCardHeart = new cardClass("Q","H");
		
		assertEquals("D",testCardDiamond.returnSuitName());
		assertEquals("1",testCardDiamond.returnCardRank());
		
		assertEquals("C",testCardClub.returnSuitName());
		assertEquals("7",testCardClub.returnCardRank());
		

		assertEquals("H",testCardHeart.returnSuitName());
		assertEquals("Q",testCardHeart.returnCardRank());
		
		
		assertEquals("S",testCardSpade.returnSuitName());
		assertEquals("K",testCardSpade.returnCardRank());

	}
	
	//Check if the deck was made correctly (52 cards)
	public void testDeckConstructor() {
		deckClass deck = new deckClass();
		assertEquals(52,deck.checkLength());
	}
	
	//Check the deck for duplicates
	public void testDeckUniqueness() {
		
		//This checks for original uniqueness when created
		deckClass testDeck = new deckClass();
		assertEquals(true,testDeck.noDuplicates());
		
		//This test card is added to the deck and the set, the set should ignore 
		//This variable is used to test if there are any duplicates		
		cardClass testDuplicateCard = new cardClass("1","D");			
		testDeck.addToDeck(testDuplicateCard);
		testDeck.addToDeck(testDuplicateCard);
		assertEquals(false,testDeck.noDuplicates());
	}
	
	public void testDrawCard() {
		
		
		////This section is to test if the size changes properly when drawn
		//Draw 1 card / 51 cards left
		deckClass deck = new deckClass();
		deck.drawCard();
		assertEquals(51,deck.checkLength());
		//Draw 1 other card / 50 cards left
		deck.drawCard();
		assertEquals(50,deck.checkLength());	
		
		//Draw all cards but 1 left / 1 card remaining
		for(int i =0;i<49;i++) {
			deck.drawCard();
		}
		assertEquals(1,deck.checkLength());
		
		//Draw the final card of the deck / 0 remaining
		deck.drawCard();
		assertEquals(0,deck.checkLength());
		////End of the size check
			
	}
	
	public void testDrawnCards() {
		////Test if the drawn cards are correctly removed from the deck
		//This hand variable stores the information of the drawn cards 
		//This will be used to intersect the deck array to check if there are duplicates.
		//Test five multiple sets to ensure functionality is correct
		for(int i = 0 ; i<5;i++) {
			
		
			deckClass deck = new deckClass();		
			handClass hand = new handClass();
		
			hand.drawCards(deck);
			//Check if the hand only has 5 cards
			assertEquals(5,hand.checkLength());
			//Check if the deck only has 47 cards (52-5 = 47)
			assertEquals(47,deck.checkLength());
			
			//Draw cards for the ai hand
			handClass handAI = new handClass();
			handAI.drawCards(deck);
			assertEquals(5,handAI.checkLength());
			//Check deck again should have 42 cards (47-5 = 42)
			assertEquals(42,deck.checkLength());
			
			//Use retain all to check for intersections, size should then be 0
			hand.returnHand().retainAll(handAI.returnHand());
			assertEquals(0,hand.checkLength());
			
			//Hand should be 0 because of no intersect, and then test handAI with deck
			deck.returnDeck().retainAll(handAI.returnHand());
			assertEquals(0,deck.checkLength());		
		}
		
	}

}
