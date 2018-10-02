package assignment1;

import java.util.*;

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
		//deck.printDeck();
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
			
			
		}
		
	}
	
	//Test handIdentifier methods
	public void testDetermineCard() {
		//First four cards are same card of different suits
		cardClass testCard1 = new cardClass("Q","D");
		cardClass testCard2 = new cardClass("Q","S");
		cardClass testCard3 = new cardClass("Q","C");
		cardClass testCard4 = new cardClass("Q","H");
		//This Queen checks the one of from last (last is King)
		//First / Last / Middle
		cardClass testCard5 = new cardClass("A","H");
		cardClass testCard6 = new cardClass("K","H");
		cardClass testCard7 = new cardClass("7","H");
		handIdentifierClass HIC = new handIdentifierClass();
		assertEquals(12,HIC.returnValueOfRank(testCard1));
		assertEquals(12,HIC.returnValueOfRank(testCard2));
		assertEquals(12,HIC.returnValueOfRank(testCard3));
		assertEquals(12,HIC.returnValueOfRank(testCard4));
		assertEquals(1,HIC.returnValueOfRank(testCard5));
		assertEquals(13,HIC.returnValueOfRank(testCard6));
		assertEquals(7,HIC.returnValueOfRank(testCard7));
	
	}
	
	public void testCardListMethods() {
		handClass testHand = new handClass();
		handIdentifierClass HIC = new handIdentifierClass();
		cardClass card1 = new cardClass("A","S");		
		cardClass card2 = new cardClass("2","D");
		cardClass card3 = new cardClass("3","D");
		cardClass card4 = new cardClass("4","D");
		cardClass card5 = new cardClass("5","D");
		testHand.addCard(card1);
		testHand.addCard(card2);
		testHand.addCard(card3);
		testHand.addCard(card4);
		testHand.addCard(card5);
		assertEquals(1,HIC.findMin(HIC.returnCardRanks(testHand.getHand())));
		assertEquals(true,HIC.determineStraight(testHand.getHand()));
		//TEST THE HIGHESTCARD METHOD
		assertEquals("5",HIC.determineHighestCard(testHand.returnHand()).returnCardRank());
		assertEquals(false,HIC.determineFlush(testHand.returnHand()));
	    HIC.pairInHand(testHand.returnHand());
		
	    Map<String,Integer> checkPairs = new HashMap<String,Integer>();
	    checkPairs.put("K",2);
		handClass testHand2 = new handClass();
		cardClass card6 = new cardClass("K","S");		
		cardClass card7 = new cardClass("10","C");
		cardClass card8 = new cardClass("J","D");
		cardClass card9 = new cardClass("Q","H");
		cardClass card10 = new cardClass("K","C");
		testHand2.addCard(card6);
		testHand2.addCard(card7);
		testHand2.addCard(card8);
		testHand2.addCard(card9);
		testHand2.addCard(card10);
		assertEquals(10,HIC.findMin(HIC.returnCardRanks(testHand2.getHand())));
		assertEquals(false,HIC.determineStraight(testHand2.getHand()));
		//TEST THE HIGHESTCARD METHOD
		assertEquals("K",HIC.determineHighestCard(testHand2.returnHand()).returnCardRank());		
		assertEquals(checkPairs,HIC.pairInHand(testHand2.returnHand()));
		assertEquals(false,HIC.determineFlush(testHand2.returnHand()));
		

		handClass testHand3 = new handClass();
		cardClass card11 = new cardClass("A","D");		
		cardClass card12 = new cardClass("10","D");
		cardClass card13 = new cardClass("J","D");
		cardClass card14 = new cardClass("Q","D");
		cardClass card15 = new cardClass("K","D");
		testHand3.addCard(card11);
		testHand3.addCard(card12);
		testHand3.addCard(card13);
		testHand3.addCard(card14);
		testHand3.addCard(card15);
		assertEquals("A",HIC.determineHighestCard(testHand3.returnHand()).returnCardRank());
		assertEquals(true,HIC.determineFlush(testHand3.returnHand()));
	}
	
	

}
