package assignment1;

import java.util.*;

public class handIdentifierClass {
	
	public boolean pokerHand(List<cardClass> cards) {
		return false;
	}
	
	public boolean determineStraight(List<cardClass> cards) {
		
		return false;
	}
	
	public int returnValueOfRank(cardClass card) {
		if(card.returnCardRank().equals("A")) {
			return 1;
		}
		else if(card.returnCardRank().equals("J")) {
			return 11;
		}
		else if(card.returnCardRank().equals("Q")) {
			return 12;
		}
		else if(card.returnCardRank().equals("K")) {
			return 13;
		}
		else {
			return Integer.parseInt(card.returnCardRank());
		}
		
	}

}
