package assignment1;
import java.util.*;
public class handClass {
	private List<cardClass> hand = new ArrayList<cardClass>();
	
	public void drawCards(deckClass deck) {	
		for(int i=0;i<5;i++) {
			hand.add(deck.drawCard());	
		}
	}
	public void swap(deckClass deck,List<cardClass> cards) {
		for(cardClass card : cards) {
			hand.remove(card);
		}
		hand.add(deck.drawCard());
	}
	
	public void addCard(cardClass card) {
		hand.add(card);
	}
	
	public int checkLength() {
		return hand.size();
	}	
	
	public List<cardClass> returnHand(){
		return hand;
	}
	
	public void setHand(List<cardClass> handToSet) {
		hand = handToSet;
	}
	
	public void printHand() {
		for(cardClass cardInHand : hand) {
			System.out.print(cardInHand.returnCardRank() + cardInHand.returnSuitName() + " ");
		}
		System.out.println("");
	}
	
	public List<cardClass> getHand(){
		return hand;
	}
}
