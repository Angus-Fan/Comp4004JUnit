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
		if(determineRankOfPairs(cards)==3) {
			return 4;
		}
		if(determineRankOfPairs(cards)==2) {
			return 3;
		}
		if(determineRankOfPairs(cards)==1) {
			return 2;
		}
		else {
			return 1;
		}
		
		
	}
	
	public List<cardClass> determineOneSwap(List<cardClass> cards) {
		//System.out.println("DETERMINING");
		Map<String,Integer> pairs = pairInHand(cards);
		List<cardClass> cardsToSwapOut = new ArrayList<cardClass>();
		String breakerSuit = "";
		cardClass cardOut = null;
		Set<Integer> royalCount = new HashSet<Integer>();
		if(determineFlush1Off(cards)) {
			//System.out.println("FlushBreaker is " + flushBreaker(cards).returnSuitName() +  flushBreaker(cards).returnCardRank());
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
				cardsToSwapOut.add(cardOut);
				//System.out.println("ROYALFLUSH");
				return cardsToSwapOut;
			}
		
			
		}
		
		if(determineFlush1Off(cards) && determineStraight1Off(cards)) {
			
			cardOut = straightFlushBreaker(cards);
			//System.out.println("Card is [" + cardOut.returnSuitName() + cardOut.returnCardRank() +"]");
			if(cardOut!=null) {
				cardsToSwapOut.add(cardOut);
				//System.out.println("STRAIGHTFLUSH1OFF");
				return cardsToSwapOut;
			}
		}
		//Full house
		
		
		//System.out.println("Res of pairs" +determineRankOfPairs(cards));
		if(determineRankOfPairs(cards)==2) {
			for(cardClass card : cards) {
				//System.out.println(card.returnCardRank());
				for(Map.Entry<String, Integer> entry : pairs.entrySet()) {
					if(!pairs.containsKey(card.returnCardRank())) {
						cardOut = card;
						cardsToSwapOut.add(cardOut);
						//System.out.println("FULLHOUSE");
						return cardsToSwapOut;
					}
				}
			}
		}
		
		if(determineFlush1Off(cards)) {
			cardsToSwapOut.add( flushBreaker(cards));
			//System.out.println("1OFFFLUSH");
			return cardsToSwapOut;
		}
		//System.out.println("RIGHT BEFORE STRAIGHT");
		if(determineStraight1Off(cards)) {
			cardsToSwapOut.add( straightBreaker(cards));
			//System.out.println("1OFFSTRAIGHT");
			return cardsToSwapOut;
		}
		if(determineFlush2Off(cards)) {
			//System.out.println("2OFFFLUSH");
			return flushBreaker2(cards);
		}
		if(determineRankOfPairs(cards)==3) {
		
			for(cardClass card : cards) {
				for(Map.Entry<String, Integer> entry : pairs.entrySet()) {
					if(!(card.returnCardRank().equals(entry.getKey()))) {
						
						cardsToSwapOut.add(card);
					}
				}
			}
			//System.out.println("3 OF KIND");
			
			return cardsToSwapOut;
		}
		
		if(threeSequence(cards)) {
			cardsToSwapOut=  threeSequenceCards(cards);
			return cardsToSwapOut;
		}
		if(determineRankOfPairs(cards)==2) {
			for(Map.Entry<String, Integer> entry : pairs.entrySet()) {
				for(cardClass card : cards) {
					if(!(pairs.containsKey(card.returnCardRank()))) {
						cardOut = card;
						cardsToSwapOut.add(cardOut);
						//System.out.println("2 Pair swapping 1");
						return cardsToSwapOut;
					}
				}						
			}
		}
		
		if(determineRankOfPairs(cards)==1) {
			//System.out.print(cards.size());
			for(cardClass card : cards) {
				if(!(pairs.containsKey(card.returnCardRank()))) {
					cardsToSwapOut.add(card);
				}
			}
			return cardsToSwapOut;
		}
		List<cardClass> temp = cards;
		cardOut = determineHighestCard(temp);
		cardsToSwapOut.add(cardOut);
		temp.remove(cardOut);
		cardOut = determineHighestCard(temp);
		cardsToSwapOut.add(cardOut);
		temp.remove(cardOut);
		return temp;
		
			
		

		
		
		
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
	
	public boolean determineFlush2Off(List<cardClass> cards) {
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
		
		if(suitCount.containsValue(3)) {
			return true;
		}
		
		return false;
		
	}
	public cardClass straightFlushBreaker(List<cardClass> cards) {
		cardClass flushBreaker = flushBreaker(cards);
		cardClass rankBreaker = straightBreaker(cards);
	//	System.out.print("FLUSH BREAKER IS" +flushBreaker.returnSuitName() + flushBreaker.returnCardRank());
	//	System.out.print("Straight BREAKER IS" +rankBreaker.returnSuitName() + rankBreaker.returnCardRank());
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
	
	public boolean threeSequence(List<cardClass> cards){
		
		
		//System.out.println("");
		int notStraightCounter = 0;
		List<Integer> cardRanks = returnCardRanks(cards);
		Collections.sort(cardRanks);
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
		/*
		for(int i = 0 ;i<5;i++) {
			System.out.println(cardRanks.get(i));
		}*/
		if(findMin(cardRanks)==1) {
			int smallA = 0;
			int bigA = 0;
			if(cardRanks.get(0)!=1) {
				smallA++;
			}
			if(cardRanks.get(1)!=2) {
				smallA++;
			}
			if(cardRanks.get(2)!=3 ) {
				smallA++;
			}
			if(cardRanks.get(3)!=4) {
				smallA++;
			}
			if(cardRanks.get(4)!=5) {
				smallA++;
			}
			if(cardRanks.get(0)!=1) {
				bigA++;
			}
			if(cardRanks.get(1)!=10) {
				bigA++;
			}
			if(cardRanks.get(2)!=11 && cardRanks.get(2)!=10) {
				bigA++;
			}
			if(cardRanks.get(3)!=12 &&  cardRanks.get(3)!=11 && cardRanks.get(3)!=10) {
				bigA++;
			}
			if(cardRanks.get(4)!=13 && cardRanks.get(4)!=12 &&  cardRanks.get(4)!=11 && cardRanks.get(4)!=10) {
				bigA++;
			}
			//System.out.println(bigA);
			if(bigA==2 || smallA == 2) {
				return true;
			}
		}
		
		else {
			if(cardRanks.get(0)!=findMin(cardRanks)) {
				notStraightCounter++;
			}
			if(cardRanks.get(1)!=cardRanks.get(0)+1) {
				notStraightCounter++;
			}
			if(cardRanks.get(2)!=cardRanks.get(1)+1) {
				notStraightCounter++;
			}
			if(cardRanks.get(3)!=cardRanks.get(2)+1) {
				notStraightCounter++;
			}
			if(cardRanks.get(4)!=cardRanks.get(3)+1) {
				notStraightCounter++;
			}
			if(notStraightCounter==2) {
				return true;
			}
		}
		return false;
		
	}
	
	public List<cardClass> threeSequenceCards(List<cardClass> cards){
		Integer[] intList = new Integer[3];
		List<cardClass> sequence = new ArrayList<cardClass>();
		List<cardClass> temp = new ArrayList<cardClass>();
		for(cardClass card : cards) {
			temp.add(card);
		}
		List<Integer> cardRanks = returnCardRanks(cards);
		Collections.sort(cardRanks);
		
		for(int i = 0;i<2;i++) {
			intList = new Integer[3];
			intList[i]=cardRanks.get(i);
			intList[i+1]=cardRanks.get(i+1);
			intList[i+2]=cardRanks.get(i+2);
			if(intList[0]+1==intList[1]) {
				if(intList[1]+1==intList[2]) {
					break;
					}
				}
			
		}
		//System.out.println(intList[0] + " " +intList[1] + " "+intList[2]);
		for(cardClass card : temp) {
			if(returnValueOfRank(card)==intList[0]||returnValueOfRank(card)==intList[1]||returnValueOfRank(card)==intList[2]) {
				sequence.add(card);
			}
		}
		temp.removeAll(sequence);
		return temp;
		
	}
	
	
	
	public List<cardClass> flushBreaker2(List<cardClass> cards) {
		Map<String,Integer> suitCount = new HashMap<String,Integer>();
		List<cardClass> returnCards = new ArrayList<cardClass>();
		for(cardClass card : cards) {
			//System.out.println(card.returnSuitName());
			if(!suitCount.containsKey(card.returnSuitName())) {
				suitCount.put(card.returnSuitName(), 1);
			}
			else {
				suitCount.put(card.returnSuitName(),suitCount.get(card.returnSuitName())+1);
			}
		}
		List<String> suitsToRemove = new ArrayList<String>();
		for(Map.Entry<String, Integer> suitNum : suitCount.entrySet()) {
			if(!(suitNum.getValue() == 3)) {
				//System.out.print(suitNum.getKey());
				
				suitsToRemove.add(suitNum.getKey());
			}
		}
		for(cardClass card : cards) {
			//System.out.println(card.returnSuitName().equals(suitToRemove));
			for(String suitToRemove : suitsToRemove) {
				if(card.returnSuitName().equals(suitToRemove)) {
					//System.out.println("RETURNED");
					returnCards.add(card);
					
				}
			}
		}
		return returnCards;
		//return null;
	}
	public boolean determineStraight1Off(List<cardClass> cards) {
		//int straightCount = 1;
			//System.out.println("WE GOT HERE");
				/**
				for(cardClass card : cards) {
					System.out.print(card.returnSuitName()+card.returnCardRank()+"");
				}**/
				//System.out.println("");
				int notStraightCounter = 0;
				List<Integer> cardRanks = returnCardRanks(cards);
				Collections.sort(cardRanks);
				Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
				boolean plusTwo = true;
				/*
				for(int i = 0 ;i<5;i++) {
					System.out.println(cardRanks.get(i));
				}*/
				if(findMin(cardRanks)==1) {
					int smallA = 0;
					int bigA = 0;
					if(cardRanks.get(0)!=1) {
						smallA++;
					}
					if(cardRanks.get(1)!=2) {
						smallA++;
					}
					if(cardRanks.get(2)!=3 ) {
						smallA++;
					}
					if(cardRanks.get(3)!=4) {
						smallA++;
					}
					if(cardRanks.get(4)!=5) {
						smallA++;
					}
					if(cardRanks.get(0)!=1) {
						bigA++;
					}
					if(cardRanks.get(1)!=10) {
						bigA++;
					}
					if(cardRanks.get(2)!=11 && cardRanks.get(2)!=10) {
						bigA++;
					}
					if(cardRanks.get(3)!=12 &&  cardRanks.get(3)!=11 && cardRanks.get(3)!=10) {
						bigA++;
					}
					if(cardRanks.get(4)!=13 && cardRanks.get(4)!=12 &&  cardRanks.get(4)!=11 && cardRanks.get(4)!=10) {
						bigA++;
					}
					//System.out.println(bigA);
					if(bigA==1 || smallA == 1) {
						return true;
					}
				}
			
				else {
					if(cardRanks.get(0)!=findMin(cardRanks)) {
						notStraightCounter++;
						//System.out.println("0");
					}
					if(cardRanks.get(1)!=cardRanks.get(0)+1 || cardRanks.get(1)!=cardRanks.get(0)+2 && plusTwo) {
						
						if(cardRanks.get(1)==cardRanks.get(0)+2) {
							plusTwo = false;
						}
						else {
							notStraightCounter++;
						}
						//System.out.println("1");
					}
					if(cardRanks.get(2)!=cardRanks.get(1)+1 && cardRanks.get(2)!=cardRanks.get(1)+2 && plusTwo) {
						
						if(cardRanks.get(2)==cardRanks.get(1)+2) {
							plusTwo = false;
						}
						else {
							notStraightCounter++;
						}
						//System.out.println("2"+ "plus two is: "+plusTwo);
						
					}
					if(cardRanks.get(3)!=cardRanks.get(2)+1 && cardRanks.get(3)!=cardRanks.get(2)+2 && plusTwo) {
						if(cardRanks.get(3)==cardRanks.get(2)+2) {
							plusTwo = false;
						}
						else {
							notStraightCounter++;
						}
						//System.out.println("3");
					}
					if(cardRanks.get(4)!=cardRanks.get(3)+1 && cardRanks.get(4)!=cardRanks.get(3)+2 && plusTwo) {
						if(cardRanks.get(4)==cardRanks.get(3)+2) {
							plusTwo = false;
						}
						else {
							notStraightCounter++;
						}
					}
					//System.out.println(notStraightCounter);
					if(notStraightCounter==1) {
						return true;
					}
				}
				return false;
		
				
	}		
	
	public cardClass straightBreaker(List<cardClass> cards) {
		
		//int straightCount = 1;
		
		
		int wrongRank = 0;
		boolean plus2Used = true;
		List<Integer> cardRanks = returnCardRanks(cards);
		Collections.sort(cardRanks);
		
		int nextInt1 = cardRanks.get(0)+1;
		int nextInt2 = cardRanks.get(0)+9;
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
			
			plus2Used = true;
			int nextInt = cardRanks.get(0)+1;
			for(int i=1;i<5;i++) {
				
				if(cardRanks.get(i)==nextInt+1 && plus2Used && i!=4) {
					nextInt=nextInt+1;
					plus2Used=false;
				}
				//System.out.print(cardRanks.get(i) +""+nextInt);
				if(cardRanks.get(i)!=nextInt) {
					//System.out.println("HERE");
						
					for(cardClass card : cards) {
						if(returnValueOfRank(card)==cardRanks.get(i)){
							//System.out.println("EVEN HERE");
							return card;
						}
					}
				}
				else {
					nextInt++;
				}					
			}
			
			if(setOfCards.contains(1) && setOfCards.contains(13)) {
				plus2Used = true;
				nextInt = cardRanks.get(0)+9;
				for(int i=1;i<5;i++) {
					
					if(cardRanks.get(i)==nextInt+1 && plus2Used) {
						nextInt=nextInt+1;
					//	System.out.println("+2'd");
						plus2Used=false;
					}
					//System.out.print(cardRanks.get(i) +""+nextInt);
					if(cardRanks.get(i)!=nextInt) {
					//	System.out.println("HERE");
							
						for(cardClass card : cards) {
							if(returnValueOfRank(card)==cardRanks.get(i)){
					//			System.out.println("EVEN HERE");
								return card;
							}
						}
					}
					else {
						nextInt++;
					}					
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
		
		/**
		for(cardClass card : cards) {
			System.out.print(card.returnSuitName()+card.returnCardRank()+"");
		}**/
		List<Integer> cardRanks = returnCardRanks(cards);
		Collections.sort(cardRanks);
		Set<Integer> setOfCards = new HashSet<Integer>(cardRanks);
		if(setOfCards.contains(1)) {
			boolean v1 = cardRanks.get(0)==1 && cardRanks.get(1)==2 && cardRanks.get(2)==3 && cardRanks.get(3)==4 && cardRanks.get(4)==5;
			boolean v2 = cardRanks.get(0)==1 && cardRanks.get(1)==10 && cardRanks.get(2)==11 && cardRanks.get(3)==12 && cardRanks.get(4)==13;
			return v1 || v2;
		}
		else {
			int nextInt = cardRanks.get(0)+1;
			for(int i=1;i<5;i++) {
				if(cardRanks.get(i)!=nextInt) {
					return false;
				}
				else {
					nextInt++;
				}					
			}
			return true;	
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
