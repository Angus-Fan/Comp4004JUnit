package stepDefinition;

import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class threeSequenceSwapTest {
	//Test for the one off from royal flush
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();
	
	@Given("^AI hand is two card off from straight and oponent has double$")
	public void ai_hand_is_one_card_off_from_royal_flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR  STRAIGHT TWO OFF (SEQUENCE THREE)");
		pokTest.constructCards(pokTest.readFile("assignment2Features.txt").get(7));
	}
	
	@When("^AI hand swaps its card for C2 and D6 to complete straight$")
	public void ai_hand_swaps_its_hand_for_a_card_from_deck() throws Throwable {
	    pokTest.game();
	}
	
	@Then("^AI hand wins with a straight from sequence of three cards$")
	public void ai_hand_wins_with_a_royal_flush() throws Throwable {
	  
	  assertEquals(0,pokTest.returnWinner());
	   
	}
	
	
	

}
