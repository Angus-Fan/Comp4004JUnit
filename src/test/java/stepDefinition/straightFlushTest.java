package stepDefinition;

import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class straightFlushTest {
	//Test for the one off from royal flush
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();
	pokerClass pokTest2 = new pokerClass();
	pokerClass pokTest3 = new pokerClass();
	pokerClass pokTest4 = new pokerClass();
	pokerClass pokTest5 = new pokerClass();
	
	
	@Given("^AI hand is one card off from straight flush and oponent has double$")
	public void ai_hand_is_one_card_off_from_royal_flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR STRAIGHT FLUSH ONE OFF");
		pokTest.constructCards(pokTest.readFile("assignment2Features.txt").get(1));
		pokTest2.constructCards(pokTest2.readFile("straightFlushPermutation.txt").get(0));
		pokTest3.constructCards(pokTest3.readFile("straightFlushPermutation.txt").get(1));
		pokTest4.constructCards(pokTest4.readFile("straightFlushPermutation.txt").get(2));
		pokTest5.constructCards(pokTest5.readFile("straightFlushPermutation.txt").get(3));
	}
	
	@When("^AI hand swaps its card for CA and H2 to complete straight flush$")
	public void ai_hand_swaps_its_hand_for_a_card_from_deck() throws Throwable {
	    pokTest.game();
	    pokTest2.game();
	    pokTest3.game();
	    pokTest4.game();
	    pokTest5.game();
	}
	
	@Then("^AI hand wins with a straight flush$")
	public void ai_hand_wins_with_a_royal_flush() throws Throwable {
	  
	  assertEquals(0,pokTest.returnWinner());
	  assertEquals(0,pokTest2.returnWinner());
	  assertEquals(0,pokTest3.returnWinner());
	  assertEquals(0,pokTest4.returnWinner());
	  assertEquals(0,pokTest5.returnWinner());
	   
	}
	
	
	

}
