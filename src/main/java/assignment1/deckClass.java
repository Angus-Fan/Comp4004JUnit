package assignment1;


import java.util.*;

import assignment1.cardClass.cardSuits;

public class deckClass {

	private List<cardClass> deck = new ArrayList<cardClass>();
	
	public deckClass() {
		for(int i=1;i<14;i++) {
			
			for (cardSuits suit : cardSuits.values()) {
				cardClass cardToAdd = new cardClass(i,suit);	
				deck.add(cardToAdd);
			}		
		}
		
		Collections.shuffle(deck);		
	}
	
	public void addToDeck(cardClass card) {
		deck.add(card);
	}
	
	public int checkLength() {
		return deck.size();
	}	
	
	//This adds to a  set, if adding to a set is false then
	//Something of the same kind already existed, therefore no duplicates
	//should exist if returns true
	
	
	public boolean noDuplicates() {
		
		Set<cardClass> setOfCards = new HashSet<cardClass>(deck);		
		
		if(setOfCards.size()<deck.size()) {
			return false;
		}
		
		return true;
	}
	
	public void drawCard() {
		
	}

	 
}
