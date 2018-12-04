
import assignment1.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public TestServlet() {
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
		out.println("<html><body>");
		if(Integer.parseInt(request.getParameter("Players"))>4 || Integer.parseInt(request.getParameter("Players"))<Integer.parseInt(request.getParameter("realPlayers"))) {
			out.println("Check your player numbers again you can't have more than 4 or have more real players than actual players");
		}
		else {
		displayPlayers(Integer.parseInt(request.getParameter("Players")),Integer.parseInt(request.getParameter("realPlayers")),out);
		}
		out.println("</body></html>");
		/*
		if(request.getParameter("FirstName")==null)
		{
		out.println("<form action=\"/action_page.php\">");
		out.println("First name: <input type=\"text\" name=\"FirstName\" value=\"Mickey\"><br>");
		out.println("Last name: <input type=\"text\" name=\"LastName\" value=\"Mouse\"><br>");
		out.println("<input type=\"submit\" value=\"Submit\">");
		out.println("</form>");
		}
		else {
		out.println("<h2>Hello World</h2>");
		out.println("</body></html>");
		}*/
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	private void displayPlayers(int num,int numReal,PrintWriter out) {
		
		
		int numberOfPlayers = num;
		int numberOfRealPlayers = numReal;
		handClass h0 =  new handClass();
		handClass h1 =  new handClass();
		handClass h2 =  new handClass();
		handClass h3 =  new handClass();
	    handClass htb =  new handClass();
		FullDeckClass deck = new FullDeckClass();
		
		
		//Add cards to the empty hands from deck
		for(int i =0;i<numberOfPlayers;i++) {
			if(i==0) {
				h0.drawCardsFromFullDeck(deck);
			}
			else if(i==1) {
				h1.drawCardsFromFullDeck(deck);
			}
			else if(i==2) {
				h2.drawCardsFromFullDeck(deck);
			}
			else if(i==3) {
				h3.drawCardsFromFullDeck(deck);
			}
		}
		htb.drawCardsFromFullDeck(deck);
		
		//Create the form with all the info that needs to be sent 
		out.println("<form action=\"ResultPage\" method = \"GET\">\r\n");
		out.println("The number of players is : ");
		out.println("<input type=\"text\" name=numberOfPlayers value=\""+num+"\"readonly>");
		out.println("<br>");
		out.println("The number of real players is : ");
		out.println("<input type=\"text\" name=numberOfRealPlayers value=\""+numReal+"\"readonly>");
		out.println("<br>");
		out.println("The hand to beat is : ");
		out.println("<input type=\"text\" name=htbhand");
		String value = "";
		for(int x = 0 ;x<5;x++) {
			if(x==4) {
				value = value + htb.returnHand().get(x).returnCardString();
			}
			else {
				value = value + htb.returnHand().get(x).returnCardString() + " " ;
			}
		}
		out.println("value=\"" + value + "\"readonly>"); 
		out.println("<br>");

		for(int i = 0 ; i <numberOfPlayers ; i++) {
			
			out.println("The player " + (i+1) + " has the hand :");
			
			out.println("<input type=\"text\" id =" + "hid"+i+" name =" + "h"+ i + "hand ");
			value = "";
			if(i==0) {
				for(int x = 0 ;x<5;x++) {
					if(x==4) {
						value = value + h0.returnHand().get(x).returnCardString();
					}
					else {
						value = value + h0.returnHand().get(x).returnCardString() + " " ;
					}
				}
			}
			else if(i==1) {
				for(int x = 0 ;x<5;x++) {
					if(x==4) {
						value = value + h1.returnHand().get(x).returnCardString();
					}
					else {
						value = value + h1.returnHand().get(x).returnCardString() + " " ;
					}
				}
			}
			else if(i==2) {
				for(int x = 0 ;x<5;x++) {
					if(x==4) {
						value = value + h2.returnHand().get(x).returnCardString();
					}
					else {
						value = value + h2.returnHand().get(x).returnCardString() + " " ;
					}
				}
			}
				
			else if(i==3) {
					for(int x = 0 ;x<5;x++) {
						if(x==4) {
							value = value + h3.returnHand().get(x).returnCardString();
						}
						else {
							value = value + h3.returnHand().get(x).returnCardString() + " " ;
						}
					}
					
			}
			
			out.println("value=\"" + value + "\"readonly>"); 
			out.println("<br>");
		}
		//out.println("<button type=\"button\" \">" + exampleCard + "</button>");
		
		for(int i = 0 ;i<numberOfRealPlayers;i++) {
		out.println("Cards to exchange for player " + (i+1) + ": <input type=\"text\" name=\"cardsToSwap" + i + "\" value=\"\" id = \"playerInput" + i + "\"><br>\r\n" + 
				"\r\n");				
		}
		out.println("	<input type=\"submit\" value=\"Submit\" id = \"submitButt\">\r\n" + 
				"	</form>");
		
	
	}
	
	

	

}
