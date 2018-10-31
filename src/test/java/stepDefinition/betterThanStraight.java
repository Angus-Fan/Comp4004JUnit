package stepDefinition;

import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class betterThanStraight {
	//Test for the one off from royal flush
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();
	
	@Given("^AI hand has better than a straight but opponent has better poker hand$")
	public void ai_hand_is_one_card_off_from_royal_flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR BETTER THAN A STRAIGHT");
		pokTest.constructCards(pokTest.readFile("assignment2Features.txt").get(10));
	}
	
	@When("^AI hand holds its cards$")
	public void ai_hand_swaps_its_hand_for_a_card_from_deck() throws Throwable {
	    pokTest.game();
	}
	
	@Then("^AI hand loses to the hand to beat$")
	public void ai_hand_wins_with_a_royal_flush() throws Throwable {
	  
	  assertEquals(1,pokTest.returnWinner());
	   
	}
	
	
	

}
