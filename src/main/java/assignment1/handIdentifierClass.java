package assignment1;

import java.util.*;

public class handIdentifierClass {
	
	public int pokerHand(List<cardClass> cards) {
		/*
		for(cardClass card : cards) {
			System.out.println(card.returnCardRank());
		}*/
		boolean royalFlush =  true;
		
		if(determineFlush(cards)) {
		
			for(cardClass card : cards) {
				
				if(returnValueOfRank(card)==1||returnValueOfRank(card)==10||returnValueOfRank(card)==11||returnValueOfRank(card)==12||returnValueOfRank(card)==13) {
					
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
		
		
		
		return 0;
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
		int straightCount = 1;
		
		List<Integer> cardRanks = returnCardRanks(cards);
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
		if(setOfCards.size()<5) {
			return false;
		}
		//System.out.println("CARD LIST" + cardRanks);
		minRank = findMin(cardRanks);
		if(minRank>=10) {
			return false;
		}
		
		while(true) {
			//System.out.println("CHECKING" + minRank);
			if(setOfCards.contains(minRank+1)) {
				minRank = minRank+1;
				straightCount++;
				if(straightCount==5) {
					return true;
				}
			}
			else {
				return false;
			}
		}		
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
