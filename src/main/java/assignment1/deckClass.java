package assignment1;


import java.util.*;


public class deckClass {

	private List<cardClass> deck = new ArrayList<cardClass>();
	private String[] suits = {"S","H","D","C"};
	
	
	public deckClass() {
		for(int i=1;i<14;i++) {
			
			for (String suitName : suits) {
				if(i==1) {
					cardClass cardToAdd = new cardClass("A",suitName);
					deck.add(cardToAdd);
				}
				else if(i==11) {
					cardClass cardToAdd = new cardClass("J",suitName);
					deck.add(cardToAdd);
				}
				else if(i==12) {
					cardClass cardToAdd = new cardClass("Q",suitName);
					deck.add(cardToAdd);
				}
				else if(i==13) {
					cardClass cardToAdd = new cardClass("K",suitName);
					deck.add(cardToAdd);
				}
				else {
					cardClass cardToAdd = new cardClass(Integer.toString(i),suitName);	
					deck.add(cardToAdd);
					
				}
				

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
	
	public void printDeck() {
		for( cardClass card : deck) {
			System.out.println(card.returnSuitName()+card.returnCardRank()  );
		}
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
