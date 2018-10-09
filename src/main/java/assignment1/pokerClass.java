package assignment1;
import java.io.*;

import java.util.*;

public class pokerClass {
	public handClass AIP = new handClass();
	public handClass handToBeat = new handClass();
	
	
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
		
	}
	
	public  void game() {
		handIdentifierClass HIC = new handIdentifierClass();
		
		int pokerAI;
		int pokerBeat;
		
		
		pokerAI = HIC.pokerHand(AIP.returnHand());
		pokerBeat = HIC.pokerHand(handToBeat.returnHand());
		
		if(pokerAI==0) {
			System.out.println(HIC.determineOneSwap(AIP.returnHand()).returnCardRank());
			//System.out.println(HIC.determineOneSwap(AIP.returnHand()).returnSuitName());
		}
		System.out.println(pokerAI);
		System.out.println(pokerBeat);
		
	}
	
}
	
	


