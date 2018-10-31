package stepDefinition;

import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class onePairSwapThree {
	//Test for the one off from royal flush
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();
	
	@Given("^AI hand has one pair$")
	public void ai_hand_is_one_card_off_from_royal_flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR  ONE PAIR SWAP 3");
		pokTest.constructCards(pokTest.readFile("assignment2Features.txt").get(8));
	}
	
	@When("^AI hand swaps its three cards complete flush$")
	public void ai_hand_swaps_its_hand_for_a_card_from_deck() throws Throwable {
	    pokTest.game();
	}
	
	@Then("^AI hand wins with a four of kind$")
	public void ai_hand_wins_with_a_royal_flush() throws Throwable {
	  
	  assertEquals(0,pokTest.returnWinner());
	   
	}
	
	
	

}
