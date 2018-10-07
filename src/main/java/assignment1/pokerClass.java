package assignment1;
import java.io.*;

import java.util.*;

public class pokerClass {
	public handClass AIP = new handClass();
	public handClass handToBeat = new handClass();
	
	
	public List<String[]> readFile() {
		List<String[]> games = new ArrayList<String[]>();
		String path = "C:\\Users\\angus\\Desktop\\test.txt";
		;
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
			String substring = cards[z].substring(0, 0);		
			String remainder = cards[z].substring(0);
			//System.out.println(substring + remainder);
			cardClass cardToAdd = new cardClass(substring,remainder);
			handToBeat.addCard(cardToAdd);
		}
		
	}
}
	
	


