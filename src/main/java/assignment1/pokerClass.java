package assignment1;
import java.io.*;

import java.util.*;
import java.util.Map.Entry;

public class pokerClass {
	public handClass AIP = new handClass();
	public handClass handToBeat = new handClass();
	public deckClass deck = new deckClass();
	public int winner;
	
	
	public List<String[]> readFile(String fileName) {
		List<String[]> games = new ArrayList<String[]>();
		String path = "C:\\Users\\angus\\Desktop\\";
		;
		path = path + fileName;
		File file = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		  String cards; 
		  try {
			while ((cards = br.readLine()) != null) {
				String[] split = cards.split("\\s+");
				games.add(split);
			}
			
				
			    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  return games;
	}
	
	public void constructCards(String[] cards) {
		for(int i =0;i<5;i++) {
			
			String substring = cards[i].substring(0, 1);		
			String remainder = cards[i].substring(1);
			//System.out.println(substring + remainder);
			cardClass cardToAdd = new cardClass(remainder,substring);
			AIP.addCard(cardToAdd);
		}
		for(int z = 5 ; z<10;z++) {
			String substring = cards[z].substring(0, 1);		
			String remainder = cards[z].substring(1);
			//System.out.println(substring + remainder);
			cardClass cardToAdd = new cardClass(remainder,substring);
			handToBeat.addCard(cardToAdd);
		}
		if(cards.length>10) {
			for(int t = 10;t<cards.length;t++) {
				String substring = cards[t].substring(0, 1);		
				String remainder = cards[t].substring(1);
				cardClass cardToAdd = new cardClass(remainder,substring);
				deck.addToDeck(cardToAdd);
			}
		}
		//System.out.println(deck.checkLength());
		/*
		for(cardClass card : deck.returnDeck()) {
			System.out.println("Card is [" + card.returnSuitName() + card.returnCardRank() +"]");
		}*/
		
	}
	
	public int returnHandRes(List<cardClass> cards) {
		handIdentifierClass HIC = new handIdentifierClass();
		return HIC.pokerHand(cards);
	}
	
	public  void game() {
		//I would consider the test for the independancy of the AI hand being independant shown 
		//Whenever this is called as it shows the hand before and after the exchange
		handIdentifierClass HIC = new handIdentifierClass();
		
		int pokerAI;
		int pokerBeat;
		List<cardClass> cardsToSwap = new ArrayList<cardClass>();
		
		pokerAI = returnHandRes(AIP.returnHand());
		pokerBeat = returnHandRes(handToBeat.returnHand());
		System.out.print("AIP HAND : ");
		for(cardClass card : AIP.returnHand()) {
			System.out.print(card.returnSuitName()+card.returnCardRank()+" ");
		}
		System.out.println("");
		System.out.print("Beat HAND: ");
		for(cardClass card : handToBeat.returnHand()) {
			System.out.print(card.returnSuitName()+card.returnCardRank()+" ");
		}
		System.out.println("");
		if(pokerAI<5) {
			cardsToSwap = HIC.determineOneSwap(AIP.returnHand());
			System.out.print("cards to swap are : ");
			for(cardClass card : cardsToSwap) {
				
				System.out.print("[" + card.returnSuitName() + card.returnCardRank() +"]");
				
			}
			System.out.println("");
			
			AIP.swap(deck, cardsToSwap);
			
			//System.out.println(HIC.determineOneSwap(AIP.returnHand()).returnSuitName());
		}
		pokerAI = HIC.pokerHand(AIP.returnHand());
		System.out.print("AIP HAND : ");
		for(cardClass card : AIP.returnHand()) {
			System.out.print(card.returnSuitName()+card.returnCardRank()+" ");
		}
		System.out.println("");
		System.out.print("Beat HAND: ");
		for(cardClass card : handToBeat.returnHand()) {
			System.out.print(card.returnSuitName()+card.returnCardRank()+" ");
		}
		
		
		System.out.println("");
		if(pokerAI>pokerBeat) {
			System.out.println("The AI wins");
			winner = 0;
		}
		else if(pokerBeat>pokerAI) {
			System.out.println("The opponent wins");
			winner = 1;
		}
		else if(pokerBeat==pokerAI) {
			if(pokerAI == 10) {
				if(HIC.straightFlushSuitRank(AIP.returnHand())>HIC.straightFlushSuitRank(handToBeat.returnHand())) {
					System.out.println("The AI wins, higher suit");
					winner = 0;
				}
				else {
					System.out.println("The opponent wins, higher suit");
					winner = 1;
				}
			}
			if(pokerAI==9) {
				if( HIC.returnValueOfRank(HIC.determineHighestCard(AIP.returnHand()))>HIC.returnValueOfRank(HIC.determineHighestCard(handToBeat.returnHand()))){
					System.out.println("The AI wins, higher rank");
					winner = 0;
				}
				else if( HIC.returnValueOfRank(HIC.determineHighestCard(AIP.returnHand()))<HIC.returnValueOfRank(HIC.determineHighestCard(handToBeat.returnHand()))){
					System.out.println("The opponent wins, higher rank");
					winner = 1;
				}
				else {
					if(HIC.straightFlushSuitRank(AIP.returnHand())>HIC.straightFlushSuitRank(handToBeat.returnHand())) {
						System.out.println("The AI wins, higher suit");
						winner = 0;
					}
					else {
						System.out.println("The opponent wins, higher suit");
						winner = 1;
					}
					
				}
			}
			if(pokerAI==8) {
				if( HIC.returnValueOfRank(HIC.determineHighestCard(AIP.returnHand()))>HIC.returnValueOfRank(HIC.determineHighestCard(handToBeat.returnHand()))){
					System.out.println("The AI wins, higher rank");
					winner = 0;
				}
				else {
					System.out.println("The opponent wins, higher rank");
					winner = 1;
				}
			}
			if(pokerAI==7 || pokerAI==4) {
				Map<String,Integer> pair1 = HIC.pairInHand(AIP.returnHand());
				Map<String,Integer> pair2 = HIC.pairInHand(handToBeat.returnHand());
				int int1=0;
				int int2=0;
				if(pokerAI==7) {
					for(Entry<String, Integer> entry : pair1.entrySet()) {
						if(entry.getValue()==3) {
							int1 = HIC.returnValueOfRankFromString(entry.getKey());
						}
					}
					for(Entry<String, Integer> entry : pair2.entrySet()) {
						if(entry.getValue()==3) {
							int2 = HIC.returnValueOfRankFromString(entry.getKey());
						}
					}
					if(int1>int2) {
						System.out.println("The AI wins, higher rank");
						winner = 0;
					}
					else if(int2>int1) {
						System.out.println("The opponent wins, higher rank");		
						winner = 1;
					}
				}
				else if (pokerAI==4) {
					for(Entry<String, Integer> entry : pair1.entrySet()) {
						if(entry.getValue()==2) {
							int1 = HIC.returnValueOfRankFromString(entry.getKey());
						}
					}
					for(Entry<String, Integer> entry : pair2.entrySet()) {
						if(entry.getValue()==2) {
							int2 = HIC.returnValueOfRankFromString(entry.getKey());
						}
					}
					if(int1>int2) {
						System.out.println("The AI wins, higher rank");
						winner = 0;
					}
					else if(int2>int1) {
						System.out.println("The opponent wins, higher rank");		
						winner = 1;
					}
				}
			}
			if(pokerAI==6) {
				boolean same = true;
				Set<Integer> aiInt = new HashSet<Integer>(HIC.returnCardRanks(AIP.returnHand()));
				Set<Integer> beatInt = new HashSet<Integer>(HIC.returnCardRanks(handToBeat.returnHand()));
				for(Integer n : aiInt) {
					if(beatInt.contains(n)) {
						same = same && true;
					}
					else {
						same = same && false;
					}
				}
					if(same==false) {
						int aiHigh = HIC.returnValueOfRank(HIC.determineHighestCard(AIP.returnHand()));
						int beatHigh = HIC.returnValueOfRank(HIC.determineHighestCard(handToBeat.returnHand()));
						if(aiHigh>beatHigh) {
							System.out.println("The AI wins, higher rank");
							winner = 0;
						}
						else {
							System.out.println("The opponent wins, higher rank");		
							winner = 1;
						}
					}
					if(same==true) {
						
							if(HIC.straightFlushSuitRank(AIP.returnHand())>HIC.straightFlushSuitRank(handToBeat.returnHand())) {
								System.out.println("The AI wins, higher suit");
								winner = 0;
							}
							else {
								System.out.println("The opponent wins, higher suit");
								winner = 1;
							}
							
					}
					
				
			}
			if(pokerAI==5) {
				if( HIC.returnValueOfRank(HIC.determineHighestCard(AIP.returnHand()))>HIC.returnValueOfRank(HIC.determineHighestCard(handToBeat.returnHand()))){
					System.out.println("The AI wins, higher rank");
					winner = 0;
				}
				else if( HIC.returnValueOfRank(HIC.determineHighestCard(AIP.returnHand()))<HIC.returnValueOfRank(HIC.determineHighestCard(handToBeat.returnHand()))){
					System.out.println("The opponent wins, higher rank");
					winner = 1;
				}
				else {
					if(HIC.returnValueOfSuit(HIC.determineHighestCard(AIP.returnHand())) > HIC.returnValueOfSuit(HIC.determineHighestCard(handToBeat.returnHand()))) {
						System.out.println("The AI wins, higher suit");
						winner = 0;
					}
					else {
						System.out.println("The opponent wins, higher suit");
						winner = 1;
					}
					
				}
			}
			if(pokerAI==3) {
				Map<String,Integer> pair1 = HIC.pairInHand(AIP.returnHand());
				Map<String,Integer> pair2 = HIC.pairInHand(handToBeat.returnHand());
				int int1=0;
				int int2=0;
				int int3=0;
				int int4=0;
				for(Entry<String, Integer> entry : pair1.entrySet()) {
					if(entry.getValue()==2) {
						if(HIC.returnValueOfRankFromString(entry.getKey())>int1) {						
							int1 = HIC.returnValueOfRankFromString(entry.getKey());
						}
						
					}
				}
				for(Entry<String, Integer> entry : pair2.entrySet()) {
					if(entry.getValue()==2) {
						if(HIC.returnValueOfRankFromString(entry.getKey())>int2) {						
							int2 = HIC.returnValueOfRankFromString(entry.getKey());
						}
						
					}
				}
				if(int1>int2) {
					System.out.println("The AI wins, higher rank");
					winner = 0;
				}
				else if(int2>int1) {
					System.out.println("The opponent wins, higher rank");				
					winner = 1;
				}
				
				else {
					for(cardClass card : AIP.returnHand()) {
						if(HIC.returnNumberToRank(int1).equals(card.returnCardRank())) {
							int3 = HIC.returnValueOfSuit(card);
						}
					}
					for(cardClass card : handToBeat.returnHand()) {
						if(HIC.returnNumberToRank(int1).equals(card.returnCardRank())) {
							int4 = HIC.returnValueOfSuit(card);
						}
					}
					if(int3>int4) {
						System.out.println("The AI wins, higher suit");
						winner = 0;
					
					}
					else {
						System.out.println("The opponent wins, higher suit");
						winner = 1;
					}
				}
				
			}
			if(pokerAI==2) {
				Map<String,Integer> pair1 = HIC.pairInHand(AIP.returnHand());
				Map<String,Integer> pair2 = HIC.pairInHand(handToBeat.returnHand());
				int int1=0;
				int int2=0;
				int int3=0;
				int int4=0;
				for(Entry<String, Integer> entry : pair1.entrySet()) {
					if(entry.getValue()==2) {
						if(HIC.returnValueOfRankFromString(entry.getKey())>int1) {						
							int1 = HIC.returnValueOfRankFromString(entry.getKey());
						}
						
					}
				}
				for(Entry<String, Integer> entry : pair2.entrySet()) {
					if(entry.getValue()==2) {
						if(HIC.returnValueOfRankFromString(entry.getKey())>int2) {						
							int2 = HIC.returnValueOfRankFromString(entry.getKey());
						}
						
					}
				}
				if(int1>int2) {
					System.out.println("The AI wins, higher rank");
					winner = 0;
				}
				else if(int2>int1) {
					System.out.println("The opponent wins, higher rank");		
					winner = 1;
				}
				
				else {
					for(cardClass card : AIP.returnHand()) {
						if(HIC.returnNumberToRank(int1).equals(card.returnCardRank())) {
							int3 = HIC.returnValueOfSuit(card);
						}
					}
					for(cardClass card : handToBeat.returnHand()) {
						if(HIC.returnNumberToRank(int1).equals(card.returnCardRank())) {
							int4 = HIC.returnValueOfSuit(card);
						}
					}
					if(int3>int4) {
						System.out.println("The AI wins, higher suit");
						winner = 0;
					
					}
					else {
						System.out.println("The opponent wins, higher suit");
						winner = 1;
					}
				}
				
			}
			if(pokerAI==1) {
				cardClass card1 = HIC.determineHighestCard(AIP.returnHand());
				cardClass card2 = HIC.determineHighestCard(handToBeat.returnHand());
				if(HIC.returnValueOfRank(card1)>HIC.returnValueOfRank(card2)) {
					System.out.println("The AI wins, higher rank");
					winner = 0;
				}
				else if(HIC.returnValueOfRank(card1)<HIC.returnValueOfRank(card2)) {
					System.out.println("The opponent wins, higher suit");
					winner = 1;
				}
				else {
					if(HIC.returnValueOfSuit(card1)>HIC.returnValueOfSuit(card2)) {
						System.out.println("The AI wins, higher suit");
						winner = 0;
					}
					else {
						System.out.println("The opponent wins, higher suit");
						winner = 1;
					}
				}
			}
			
			
		}
		
	
	
	
	}
	public int returnWinner() {
		return winner;
	}
}
	
	


