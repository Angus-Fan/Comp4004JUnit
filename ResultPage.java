

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assignment1.*;

/**
 * Servlet implementation class ResultPage
 */
@WebServlet("/ResultPage")
public class ResultPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		FullDeckClass deck = new FullDeckClass();
		
		int numPlayers = Integer.parseInt(request.getParameter("numberOfPlayers"));
		int numRealPlayers = Integer.parseInt(request.getParameter("numberOfRealPlayers"));
		handClass hand0 = new handClass();
		handClass hand1 = new handClass();
		handClass hand2 = new handClass();
		handClass hand3 = new handClass();
		List<cardClass> hand0Swap = new ArrayList<cardClass>();
		List<cardClass> hand1Swap = new ArrayList<cardClass>();
		List<cardClass> hand2Swap = new ArrayList<cardClass>();
		List<cardClass> hand3Swap = new ArrayList<cardClass>();
		handClass htb = new handClass();
		
		
		int ai0;
		int ai1;
		int ai2;
		int ai3;
		
		handClass winningHand = null;
		System.out.print("WRONG HERE 1");
		//For each player reconstruct their hand with the cards
		for(int i = 0 ; i < numPlayers;i++) {
			if(i==0) {
				String h0hand = request.getParameter("h0hand");
				splitAdd(hand0,h0hand);
			}
			else if(i==1) {
				String h1hand = request.getParameter("h1hand");
				splitAdd(hand1,h1hand);
			}
			else if(i==2) {
				String h2hand = request.getParameter("h2hand");
				splitAdd(hand2,h2hand);
			}
			else if(i==3) {
				String h3hand = request.getParameter("h3hand");
				splitAdd(hand3,h3hand);
			}
		}
		
		
		//Take the input of the swap cards and turn them into strings
		System.out.print("WRONG HERE 2");
		for(int i = 0 ; i < numRealPlayers;i++) {
			if(i==0) {
				if(request.getParameter("cardsToSwap0").length()>0) {
					hand0Swap = splitAddList(request.getParameter("cardsToSwap0"));
					
				}
			}
			if(i==1) {
				if(request.getParameter("cardsToSwap1").length()>0) {
					hand1Swap = splitAddList(request.getParameter("cardsToSwap1"));
				}
			}
			if(i==2) {
				if(request.getParameter("cardsToSwap2").length()>0) {
					hand2Swap = splitAddList(request.getParameter("cardsToSwap2"));
				}
			}
			if(i==3) {
				if(request.getParameter("cardsToSwap3").length()>0) {
					hand3Swap = splitAddList(request.getParameter("cardsToSwap3"));
				}
			}
			
		}
		String htbhand = request.getParameter("htbhand");
		splitAdd(htb,htbhand);
		
		//Remove the cards from the deck so no duplicates
		System.out.print("WRONG HERE 3");
		for(int i = 0;i<numPlayers;i++) {
			if(i==0) {
				deck.removeFromDeck(hand0.getHand());			}
			
			else if(i==1) {
				deck.removeFromDeck(hand1.getHand());
			}
			else if(i==2) {
				deck.removeFromDeck(hand2.getHand());
			}
			else if(i==3) {
				deck.removeFromDeck(hand3.getHand());
			}
			
		}		
		deck.removeFromDeck(htb.getHand());
		
		//Remove the cards to swap and then draw cards back
		System.out.print("WRONG HERE 4");
		for(int i = 0;i<numRealPlayers;i++) {
			int sizeOfRemovedCards = 0;
			if(i==0) {
				removeStuff(hand0.returnHand(),hand0Swap);
				sizeOfRemovedCards = 5-hand0.returnHand().size();
				for(int z = 0 ; z < sizeOfRemovedCards ; z++) {
					hand0.addCard(deck.drawCard());
				}
			}
			
			else if(i==1) {
				removeStuff(hand1.returnHand(),hand1Swap);
				sizeOfRemovedCards = 5-hand1.returnHand().size();
				for(int z = 0 ; z < sizeOfRemovedCards ; z++) {
					hand1.addCard(deck.drawCard());
				}
			}
			else if(i==2) {
				removeStuff(hand2.returnHand(),hand2Swap);
				sizeOfRemovedCards = 5-hand2.returnHand().size();
				for(int z = 0 ; z < sizeOfRemovedCards ; z++) {
					hand2.addCard(deck.drawCard());
				}
			}
			else if(i==3) {
				removeStuff(hand3.returnHand(),hand3Swap);
				sizeOfRemovedCards = 5-hand3.returnHand().size();
				for(int z = 0 ; z < sizeOfRemovedCards ; z++) {
					hand3.addCard(deck.drawCard());
				}
			}
			
		}
		
		
		pokerClass pok = new pokerClass();
		handIdentifierClass HIC = new handIdentifierClass();
		System.out.print("WRONG HERE 5");
		for(int i = numRealPlayers ; i < numPlayers ; i++) {
			if(i==0) {
				System.out.print("WRONG HERE 5:1");
				List<cardClass> cardsToSwap = new ArrayList<cardClass>();
				ai0 = pok.returnHandRes(hand0.getHand());
				if(ai0<5) {
					cardsToSwap = HIC.determineOneSwap(hand0.returnHand());
					/*
					System.out.print("cards to swap are : ");
					for(cardClass card : cardsToSwap) {
						
						System.out.print("[" + card.returnSuitName() + card.returnCardRank() +"]");
						
					}
					System.out.println("");
					*/
					hand0.swap2(deck, cardsToSwap);
					
				}
				
			}
			else if(i==1) {
				System.out.print("WRONG HERE 5:2");
				List<cardClass> cardsToSwap = new ArrayList<cardClass>();
				ai1 = pok.returnHandRes(hand1.getHand());
				if(ai1<5) {
					cardsToSwap = HIC.determineOneSwap(hand1.returnHand());
					System.out.print("cards to swap are : ");
					for(cardClass card : cardsToSwap) {
						
						System.out.print("[" + card.returnSuitName() + card.returnCardRank() +"]");
						
					}
					System.out.println("");
					
					hand1.swap2(deck, cardsToSwap);
				}
				
			}
			else if(i==2) {
				System.out.print("WRONG HERE 5:3");
				List<cardClass> cardsToSwap = new ArrayList<cardClass>();
				ai2 = pok.returnHandRes(hand2.getHand());
				if(ai2<5) {
					cardsToSwap = HIC.determineOneSwap(hand2.returnHand());
					//System.out.print("cards to swap are : ");
					
					
					hand2.swap2(deck, cardsToSwap);
				}
				
			}
			else if(i==3) {
				//System.out.print("WRONG HERE 5:4");
				List<cardClass> cardsToSwap = new ArrayList<cardClass>();
				ai3 = pok.returnHandRes(hand3.getHand());
				if(ai3<5) {
					cardsToSwap = HIC.determineOneSwap(hand3.returnHand());
					System.out.print("cards to swap are : ");
				
					
					hand3.swap2(deck, cardsToSwap);
				}
				
			}
		}
		System.out.print("WRONG HERE 6");
		
		if(numPlayers==2) {
			winningHand = pok.returnWinnerOf(htb,pok.returnWinnerOf(hand0, hand1));		
			System.out.print("WRONG HERE 6:1");
		}
		else if(numPlayers==3) {
			winningHand = pok.returnWinnerOf(htb,pok.returnWinnerOf(hand2,pok.returnWinnerOf(hand0, hand1)));	
			System.out.print("WRONG HERE 6:2");
		}
		
		else if(numPlayers==4) {
			winningHand = pok.returnWinnerOf(htb,pok.returnWinnerOf(hand3,pok.returnWinnerOf(hand2,pok.returnWinnerOf(hand0, hand1))));	
			System.out.print("WRONG HERE 6:3");
		}
		
		System.out.print("WRONG HERE 7");
		//All pre swap setup is complete by now
		out.println("<html><body>");
		out.println("The hand to beat is : ");
		for(cardClass card : htb.returnHand()) {
			out.println(card.returnCardString());
	
		}
		out.println("<br>");
		for(int i = 0 ; i < numPlayers ; i++) {
			if(i==0) {
				out.println("Player 1's hand is : ");
				for(cardClass card : hand0.returnHand()) {
					out.println(card.returnCardString());
					
				}
				out.println("<br>");
			
			}
			if(i==1) {
				out.println("Player 2's hand is : ");
				for(cardClass card : hand1.returnHand()) {
					out.println(card.returnCardString());
					
				}
				out.println("<br>");
			}
			if(i==2) {
				out.println("Player 3's hand is : ");
				for(cardClass card : hand2.returnHand()) {
					out.println(card.returnCardString());
					
				}
				out.println("<br>");
			}
			if(i==3) {
				out.println("Player 4's hand is : ");
				for(cardClass card : hand3.returnHand()) {
					out.println(card.returnCardString());
					
				}
				out.println("<br>");
			}
			
		}
		if(winningHand==htb) {
			out.println("Hand to beat is the winner");
		}
		else if(winningHand==hand0) {
			out.println("Hand 1 is the winner");
		}
		else if(winningHand==hand1) {
			out.println("Hand 2 is the winner");
		}
		else if(winningHand==hand2) {
			out.println("Hand 3 is the winner");
		}
		else if(winningHand==hand3) {
			out.println("Hand 4 is the winner");
		}
		
		//out.println("THE NUMBER OF CARDS IN DECK IS  : " + deck.checkLength());
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void splitAdd(handClass hand, String cardString) {
		String[] cards = cardString.split(" ");
		for(String card : cards) {
			
			String substring = card.substring(0, 1);		
			String remainder = card.substring(1);
			//System.out.println(substring + remainder);
			cardClass cardToAdd = new cardClass(remainder,substring);
			hand.addCard(cardToAdd);
		}
	} 
	
	private List<cardClass> splitAddList(String cardString) {
		List<cardClass> cardList2 = new ArrayList<cardClass>();
	
		String[] cards = cardString.split(" ");
		for(String card : cards) {
			
			String substring = card.substring(0, 1);		
			String remainder = card.substring(1);
			//System.out.println(substring + remainder);
			cardClass cardToAdd = new cardClass(remainder,substring);
			cardList2.add(cardToAdd);
		}
		return cardList2;
	} 
	
	private void removeStuff(List<cardClass> h1, List<cardClass> h2) {
		List<cardClass> temp = new ArrayList<cardClass>();
		for(cardClass card : h1) {
			for(cardClass card2 : h2) {
				if(card.returnCardString().equals(card2.returnCardString())){
					temp.add(card);
				}
			}
		}
		for(cardClass card : temp) {
			h1.remove(card);
		}
	}
	
	

}
