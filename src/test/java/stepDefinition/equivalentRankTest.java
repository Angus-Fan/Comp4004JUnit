package stepDefinition;

import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class equivalentRankTest {
	//Test for the one off from royal flush
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();
	
	@Given("^AI hand has better than a straight but opponent has equivalent ranked poker hand$")
	public void ai_hand_is_one_card_off_from_royal_flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR EQUIVALENT HANDS");
		pokTest.constructCards(pokTest.readFile("assignment2Features.txt").get(11));
	}
	
	@When("^AI hand holds its cards because it is better than a straight$")
	public void ai_hand_swaps_its_hand_for_a_card_from_deck() throws Throwable {
	    pokTest.game();
	}
	
	@Then("^AI hand loses to the hand to beat because of suit difference$")
	public void ai_hand_wins_with_a_royal_flush() throws Throwable {
	  
	  assertEquals(1,pokTest.returnWinner());
	   
	}
	
	
	

}
