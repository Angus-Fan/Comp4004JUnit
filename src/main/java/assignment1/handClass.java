package assignment1;
import java.util.*;
public class handClass {
	private List<cardClass> hand = new ArrayList<cardClass>();
	
	public void drawCards(deckClass deck) {	
		for(int i=0;i<5;i++) {
			hand.add(deck.drawCard());	
		}
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

}