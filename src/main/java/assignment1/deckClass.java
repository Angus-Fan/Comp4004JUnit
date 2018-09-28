package assignment1;


import java.util.*;


public class deckClass {

	private List<cardClass> deck = new ArrayList<cardClass>();
	private String[] suits = {"S","H","D","C"};
	
	
	public deckClass() {
		for(int i=1;i<14;i++) {
			
			for (int z = 0 ; z<4;z++) {
				cardClass cardToAdd = new cardClass(Integer.toString(i),suits[z]);	
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
	
	public List<cardClass> returnDeck(){
		return deck;
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
	
	public cardClass drawCard() {
		return deck.remove(0);
	}

	 
}
