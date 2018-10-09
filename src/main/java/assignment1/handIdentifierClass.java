package assignment1;

import java.util.*;

public class handIdentifierClass {
	
	public int pokerHand(List<cardClass> cards) {
		/*
		for(cardClass card : cards) {
			System.out.print(card.returnSuitName()+card.returnCardRank() +" ");
		}*/
		boolean royalFlush =  true;
		
		if(determineFlush(cards)) {
		
			for(cardClass card : cards) {
				
				if(returnValueOfRank(card)==1||returnValueOfRank(card)==10||returnValueOfRank(card)==11||returnValueOfRank(card)==12||returnValueOfRank(card)==13) {
					royalFlush = royalFlush & true;
				}
				else {
					royalFlush = royalFlush & false;
				}
			}
			if(royalFlush==true) {
				return 10;
			}
		}
		if(determineFlush(cards)) {
			if(determineStraight(cards)) {
				
				return 9;
			}
		}
		if(determineRankOfPairs(cards)==5) {
			return 8;
		}
		if(determineRankOfPairs(cards)==4) {
			return 7;
		}
		if(determineFlush(cards)) {
			return 6;
		}
		if(determineStraight(cards)) {
			return 5;
		}
		
		return 0;
	}
	
	public cardClass determineOneSwap(List<cardClass> cards) {
		String breakerSuit = "";
		cardClass cardOut = null;
		Set<Integer> royalCount = new HashSet<Integer>();
		if(determineFlush1Off(cards)) {
			System.out.println("FlushBreaker is " + flushBreaker(cards).returnSuitName() +  flushBreaker(cards).returnCardRank());
			breakerSuit = flushBreaker(cards).returnSuitName();
			for(cardClass card : cards) {
				
				if((returnValueOfRank(card)==1||returnValueOfRank(card)==10||returnValueOfRank(card)==11||returnValueOfRank(card)==12||returnValueOfRank(card)==13) && !card.returnSuitName().equals(breakerSuit)) {
					if(!royalCount.contains(returnValueOfRank(card))) {
						royalCount.add(returnValueOfRank(card));						
					}
					
				}
				else {
					cardOut = card;
				}
				
			}
			if(royalCount.size()==4) {
				return cardOut;
			}
		
			
		}
		return null;
	}
	
	
	
	public boolean determineFlush1Off(List<cardClass> cards) {
		Map<String,Integer> suitCount = new HashMap<String,Integer>();
		
		for(cardClass card : cards) {
			//System.out.println(card.returnSuitName());
			if(!suitCount.containsKey(card.returnSuitName())) {
				suitCount.put(card.returnSuitName(), 1);
			}
			else {
				suitCount.put(card.returnSuitName(),suitCount.get(card.returnSuitName())+1);
			}
		}
		
		if(suitCount.containsValue(4)) {
			return true;
		}
		
		return false;
		
	}
	public cardClass straightFlushBreaker(List<cardClass> cards) {
		cardClass flushBreaker = flushBreaker(cards);
		cardClass rankBreaker = straightBreaker(cards);
		//System.out.print(flushBreaker.returnSuitName() + flushBreaker.returnCardRank());
		//System.out.print(rankBreaker.returnSuitName() + rankBreaker.returnCardRank());
		if( (flushBreaker.returnCardRank().equals(rankBreaker.returnCardRank()) && (flushBreaker.returnSuitName().equals(rankBreaker.returnSuitName())))){
			return flushBreaker;
		}
		return null;
	}
	
	public cardClass flushBreaker(List<cardClass> cards) {
		Map<String,Integer> suitCount = new HashMap<String,Integer>();
		
		for(cardClass card : cards) {
			//System.out.println(card.returnSuitName());
			if(!suitCount.containsKey(card.returnSuitName())) {
				suitCount.put(card.returnSuitName(), 1);
			}
			else {
				suitCount.put(card.returnSuitName(),suitCount.get(card.returnSuitName())+1);
			}
		}
		String suitToRemove = "";
		for(Map.Entry<String, Integer> suitNum : suitCount.entrySet()) {
			if(suitNum.getValue() == 1) {
				//System.out.print(suitNum.getKey());
				suitToRemove = suitNum.getKey();
			}
		}
		for(cardClass card : cards) {
			//System.out.println(card.returnSuitName().equals(suitToRemove));
			if(card.returnSuitName().equals(suitToRemove)) {
				//System.out.println("RETURNED");
				return card;
				
			}
		}
		return null;
	}
	public boolean determineStraight1Off(List<cardClass> cards) {
		
		int tolerance = 0;
		List<Integer> cardRanks = returnCardRanks(cards);
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
		if(setOfCards.size()<5) {
			return false;
		}
		//System.out.println("CARD LIST" + cardRanks);
		
		
		for(Integer cardRank : cardRanks) {
			if(cardRank==13) {
				if(!setOfCards.contains(1)) {
					tolerance = tolerance + 1;
				}
			}
			if(!setOfCards.contains(cardRank+1)) {
				tolerance = tolerance + 1;
			}
		}
		//System.out.print("TOLERANCE = " + tolerance);
		if(tolerance>3 || tolerance<3) {
			return false;
		}
		else {
			return true;
		}
	}		
	
	public cardClass straightBreaker(List<cardClass> cards) {
		List<Integer> cardRanks = returnCardRanks(cards);
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
		
		//System.out.println("");
		for(cardClass card : cards) {
			//System.out.println("Value of card " + returnValueOfRank(card));
			
			if(returnValueOfRank(card)==13) {
				if(!setOfCards.contains(1) && !setOfCards.contains(returnValueOfRank(card)-1) ) {
					return card;
				}
			}
			else if(returnValueOfRank(card)==1) {
				if(!setOfCards.contains(returnValueOfRank(card)+1) && !setOfCards.contains(13)) {
					return card;
				}
			}
			
			else if(!setOfCards.contains(returnValueOfRank(card)+1) && !setOfCards.contains(returnValueOfRank(card)-1) ) {
				return card;
			}
		}
		return null;
	}
	
	
	//POKER HAND IDENTIFIERs
	public boolean determineFlush(List<cardClass> cards) {
		List<Integer> listOfCardSuits = returnCardSuits(cards);
		Set<Integer> setOfSuits =  new HashSet<Integer>();
		for(Integer suit : listOfCardSuits) {
			setOfSuits.add(suit);
		}
		if(setOfSuits.size()==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int determineRankOfPairs(List<cardClass> cards) {
		//Four of a kind  = 5
		//Full house      = 4
		//Three of a kind = 3
		//Two Pair        = 2
		//Pair            = 1
		
		int counter = 0;
		Map<String,Integer> handResults = pairInHand(cards);
		//This would be 4 of a kind
		if(handResults.containsValue(4)) {
			return 5;
		}
		//This would be  a full house
		else if(handResults.containsValue(3) && handResults.containsValue(2)) {
			return 4;
		}
		else if(handResults.containsValue(3)) {
			return 3;			
		}
		else if(handResults.size()==2) {
			for(Map.Entry<String, Integer> cardPair : handResults.entrySet()) {
				if(cardPair.getValue()==2) {
					counter++;
				}
				if(counter==2) {
					return 2;
				}
			}
		}
		else if(handResults.size()==1) {
			return 1;
		}
		return 0;
	}
	public boolean determineStraight(List<cardClass> cards) {
		int minRank = 0;
		//int straightCount = 1;
		
		List<Integer> cardRanks = returnCardRanks(cards);
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
		if(setOfCards.size()<5) {
			return false;
		}
		//System.out.println("CARD LIST" + cardRanks);
		minRank = findMin(cardRanks);
		//System.out.print(minRank);
		if(minRank>10) {
			return false;
		}
			
		for(cardClass card : cards) {
			//System.out.println("Value of card " + returnValueOfRank(card));
			
			if(returnValueOfRank(card)==13) {
				if(!setOfCards.contains(1) && !setOfCards.contains(returnValueOfRank(card)-1) ) {
					return false;
				}
			}
			else if(returnValueOfRank(card)==1) {
				if(!setOfCards.contains(returnValueOfRank(card)+1) && !setOfCards.contains(13)) {
					return false;
				}
			}
			
			else if(!setOfCards.contains(returnValueOfRank(card)+1) && !setOfCards.contains(returnValueOfRank(card)-1) ) {
				return false;
			}
		}
		return true;
			
	}
	/////9 PAIRS
	/////GET A PAIR OF CARDS
	public Map<String,Integer> pairInHand(List<cardClass> cards) {
		Set<Integer> dupes =  new HashSet<Integer>();
		Set<Integer> singles = new HashSet<Integer>();
		Map<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		List<Integer> cardRanks = returnCardRanks(cards);
		Map<String,Integer> returnMap = new HashMap<String,Integer>();
		for(Integer rank : cardRanks) {
			if(!dupes.contains(rank)) {
				dupes.add(rank);
				pairs.put(rank, 1);
			}
			else {
				pairs.put(rank, pairs.get(rank)+1);
			}
		}
		//System.out.println(pairs);
		for(Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
			if(entry.getValue()==1) {
				singles.add(entry.getKey());
			}
		}
		for(Integer value : singles) {
			pairs.remove(value);
		}
		//System.out.println(pairs);
		for(Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
			returnMap.put(returnNumberToRank(entry.getKey()), entry.getValue());
		}
		//System.out.println(returnMap);
		return returnMap;
	}
	
	
	
	/////10 HIGH CARD
	/////GET THE HIGHEST CARD IF NO POKERHAND EXISTS
	public cardClass determineHighestCard(List<cardClass> cards) {
		boolean straight5WithAce = false;
		List<cardClass> maxCardList = new ArrayList<cardClass>();
		
		//Find the highest card rank
		List<Integer> cardRanks = returnCardRanks(cards);
		List<Integer> straight5 = new ArrayList<Integer>();
		for(int i=1;i<6;i++) {
			straight5.add(i);
		}
		if(cardRanks.equals(straight5)) {
			straight5WithAce=true;
		}
		int maxCardRank = findMax(cardRanks,straight5WithAce);
		
		
		//If similar cards share the highest rank we need to find suit, else return it
		for(cardClass card : cards) {
			if(returnValueOfRank(card)==maxCardRank) {
				
				maxCardList.add(card);
			}
		}
		if(maxCardList.size()==1) {
			for(cardClass card : cards) {
				if(returnValueOfRank(card)==maxCardRank) {
					return card;
				}
			}
		}
		List<Integer> maxCardSuit = returnCardSuits(maxCardList);
		int maxSuit = findMax(maxCardSuit,straight5WithAce);
		for(cardClass card : maxCardList) {
			if(returnValueOfSuit(card)==maxSuit) {
				return card;
			}
		}
		//Should Not Reach here
		return null;	
	}
	
	
	
	////////////////////////////////////HELPER METHODS
	public List<Integer> returnCardSuits(List<cardClass> cards){
		List<Integer> cardRankList = new ArrayList<Integer>();
		for(cardClass card : cards) {
			cardRankList.add(returnValueOfSuit(card));			
		}
		return cardRankList;
	}
	public List<Integer> returnCardRanks(List<cardClass> cards){
		List<Integer> cardRankList = new ArrayList<Integer>();
		for(cardClass card : cards) {
			cardRankList.add(returnValueOfRank(card));			
		}
		return cardRankList;
	}
	public int findMax(List<Integer> list,boolean straight) {
		if(straight) {
			return Collections.max(list);
		}
		else {
			for(Integer rank : list) {
				if(rank==1) {
					return 1;
				}
			}
		//If we found an ace its the best, otherwise return the highest
		return Collections.max(list);
			
		}
	}
	
	public int findMin(List<Integer> list) {
		return Collections.min(list);
	}
	public int findMin2(List<Integer> list) {
		list.remove(Collections.min(list));
		return Collections.min(list);
	}
	public int returnValueOfSuit(cardClass card) {
		//Spades -> Hearts -> Diamonds -> Club
		if(card.returnSuitName().equals("S")) {
			return 4;
		}
		else if(card.returnSuitName().equals("H")) {
			return 3;
		}
		else if(card.returnSuitName().equals("D")) {
			return 2;
		}
		else{
			return 1;
		}
	}
	public int returnValueOfRank(cardClass card) {
		//System.out.println(card.returnCardRank());
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
			//System.out.println("["+card.returnCardRank()+"]");
			return Integer.parseInt(card.returnCardRank());
		}
		
	}
	public String returnNumberToRank(Integer num) {
		
		if(num.toString().equals("1")) {
			return "A";
		}
		else if(num.toString().equals("11")) {
			return "J";
		}
		else if(num.toString().equals("12")) {
			return "Q";
		}
		else if(num.toString().equals("13")) {
			return "K";
		}
		else {
			return num.toString();
		}
	}

}
