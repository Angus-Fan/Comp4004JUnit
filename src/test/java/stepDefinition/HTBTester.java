package stepDefinition;
import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class HTBTester {
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();

	@Given("^HTB has Royal flush vs AIP Straight Flush$")
	public void htb_has_Royal_flush_vs_AIP_Straight_Flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR Royal Flush s Straight Flush");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(0));
	}

	@When("^HTB compares hand with AIP - RF VS SF$")
	public void htb_compares_hand_with_AIP_RF_VS_SF() throws Throwable {
	   pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP Straight Flush$")
	public void htb_wins_with_Royal_Flush_vs_AIP_Straight_Flush() throws Throwable {
	   assertEquals(1,pokTest.returnWinner());
	}
	
	@Given("^HTB has Royal flush vs AIP four of a kind$")
	public void htb_has_Royal_flush_vs_AIP_of_a_kind() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs four of a kind");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(1));
	}

	@When("^HTB compares hand with AIP - RF VS four of a kind$")
	public void htb_compares_hand_with_AIP_RF_VS_OfKind() throws Throwable {
		pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP four of a kind$")
	public void htb_wins_with_Royal_Flush_vs_AIP_of_a_kind() throws Throwable {
		 assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Royal flush vs AIP full house$")
	public void htb_has_Royal_flush_vs_AIP_full_house() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs full house");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(2));
	}

	@When("^HTB compares hand with AIP - RF VS full house$")
	public void htb_compares_hand_with_AIP_RF_VS_full_house() throws Throwable {
	    pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP full house$")
	public void htb_wins_with_Royal_Flush_vs_AIP_full_house() throws Throwable {
		 assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Royal flush vs AIP flush$")
	public void htb_has_Royal_flush_vs_AIP_flush() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs flush");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(3));
	}

	@When("^HTB compares hand with AIP - RF VS flush$")
	public void htb_compares_hand_with_AIP_RF_VS_flush() throws Throwable {
		pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP flush$")
	public void htb_wins_with_Royal_Flush_vs_AIP_flush() throws Throwable {
		 assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Royal flush vs AIP Straight$")
	public void htb_has_Royal_flush_vs_AIP_Straight() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs Straight");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(4));
	}

	@When("^HTB compares hand with AIP - RF VS Straight$")
	public void htb_compares_hand_with_AIP_RF_VS_Straight() throws Throwable {
	   pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP Straight$")
	public void htb_wins_with_Royal_Flush_vs_AIP_Straight() throws Throwable {
		 assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Royal flush vs AIP Three of$")
	public void htb_has_Royal_flush_vs_AIP_Three_of() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs Three of");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(5));
	}

	@When("^HTB compares hand with AIP - RF VS Three of$")
	public void htb_compares_hand_with_AIP_RF_VS_Three_of() throws Throwable {
	   pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP Three of$")
	public void htb_wins_with_Royal_Flush_vs_AIP_Three_of() throws Throwable {
	   assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Royal flush vs AIP Two Pairs$")
	public void htb_has_Royal_flush_vs_AIP_Two_Pairs() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs Two Pair");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(6));
	}

	@When("^HTB compares hand with AIP - RF VS Two Pairs$")
	public void htb_compares_hand_with_AIP_RF_VS_Two_Pairs() throws Throwable {
	    pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP Two Pairs$")
	public void htb_wins_with_Royal_Flush_vs_AIP_Two_Pairs() throws Throwable {
	    assertEquals(1,pokTest.returnWinner());
	}
	
	pokerClass pokTest2 = new pokerClass();
	@Given("^HTB has Royal flush vs AIP One Pair$")
	public void htb_has_Royal_flush_vs_AIP_One_Pair() throws Throwable {
		
		System.out.println("THIS IS THE TEST FOR Royal Flush vs One Pair");
		pokTest2.constructCards(pokTest2.readFile("HTBCucumber.txt").get(7));
	}

	@When("^HTB compares hand with AIP - RF VS One Pair$")
	public void htb_compares_hand_with_AIP_RF_VS_One_Pair() throws Throwable {
	   pokTest2.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP One Pair$")
	public void htb_wins_with_Royal_Flush_vs_AIP_One_Pair() throws Throwable {
	    assertEquals(1,pokTest2.returnWinner());
	}
	@Given("^HTB has Royal flush vs AIP One High$")
	public void htb_has_Royal_flush_vs_AIP_One_High() throws Throwable {
	    pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs One High");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(8));
	}

	@When("^HTB compares hand with AIP - RF VS One High$")
	public void htb_compares_hand_with_AIP_RF_VS_One_High() throws Throwable {
	    pokTest.game();
	}

	@Then("^HTB wins with Royal Flush vs AIP One High$")
	public void htb_wins_with_Royal_Flush_vs_AIP_One_High() throws Throwable {
	    assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Straight flush vs AIP four of a kind$")
	public void htb_has_Straight_flush_vs_AIP_four_of_a_kind() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs four of a kind");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(9));
	}

	@When("^HTB compares hand with AIP - SF VS four of a kind$")
	public void htb_compares_hand_with_AIP_SF_VS_four_of_a_kind() throws Throwable {
	   pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP four of a kind$")
	public void htb_wins_with_Straight_Flush_vs_AIP_four_of_a_kind() throws Throwable {
	    assertEquals(1,pokTest.returnWinner());
	}
	
	@Given("^HTB has Straight flush vs full house$")
	public void htb_has_Straight_flush_vs_full_house() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs four of a kind");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(10));
	}

	@When("^HTB compares hand with AIP - SF VS full house$")
	public void htb_compares_hand_with_AIP_SF_VS_full_house() throws Throwable {
		  pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP full house$")
	public void htb_wins_with_Straight_Flush_vs_AIP_full_house() throws Throwable {
	    assertEquals(1,pokTest.returnWinner());
	}
	
	@Given("^HTB has Straight flush vs flush$")
	public void htb_has_Straight_flush_vs_flush() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs flush");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(11));
	}

	@When("^HTB compares hand with AIP - SF VS flush$")
	public void htb_compares_hand_with_AIP_SF_VS_flush() throws Throwable {
	    pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP flush$")
	public void htb_wins_with_Straight_Flush_vs_AIP_flush() throws Throwable {
	    assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Straight flush vs straight$")
	public void htb_has_Straight_flush_vs_straight() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs straight");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(12));
	}

	@When("^HTB compares hand with AIP - SF VS straight$")
	public void htb_compares_hand_with_AIP_SF_VS_straight() throws Throwable {
	    pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP straight$")
	public void htb_wins_with_Straight_Flush_vs_AIP_straight() throws Throwable {
	   assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Straight flush vs three of a kind$")
	public void htb_has_Straight_flush_vs_three_of_a_kind() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs straight");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(13));
	}

	@When("^HTB compares hand with AIP - SF VS three of a kind$")
	public void htb_compares_hand_with_AIP_SF_VS_three_of_a_kind() throws Throwable {
	   pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP three of a kind$")
	public void htb_wins_with_Straight_Flush_vs_AIP_three_of_a_kind() throws Throwable {
		  assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Straight flush vs two pair$")
	public void htb_has_Straight_flush_vs_two_pair() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs two pair");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(14));
	}

	@When("^HTB compares hand with AIP - SF VS two pair$")
	public void htb_compares_hand_with_AIP_SF_VS_two_pair() throws Throwable {
		pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP two pair$")
	public void htb_wins_with_Straight_Flush_vs_AIP_two_pair() throws Throwable {
	   assertEquals(1,pokTest.returnWinner());
	}
	@Given("^HTB has Straight flush vs highest$")
	public void htb_has_Straight_flush_vs_highest() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs highest");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(15));
	}

	@When("^HTB compares hand with AIP - SF VS highest$")
	public void htb_compares_hand_with_AIP_SF_VS_highest() throws Throwable {
	  pokTest.game();
	}

	@Then("^HTB wins with Straight Flush vs AIP highest$")
	public void htb_wins_with_Straight_Flush_vs_AIP_highest() throws Throwable {
	   assertEquals(1,pokTest.returnWinner());
	}
	
	@Given("^HTB has four of a kind  vs full house$")
	public void htb_has_four_of_a_kind_flush_vs_full_house() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR four of a kind vs fullhouse");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(16));
	}

	@When("^HTB compares hand with AIP - four of a kind VS fullhouse$")
	public void htb_compares_hand_with_AIP_four_of_a_kind_VS_fullhouse() throws Throwable {
	    pokTest.game();
	}

	@Then("^HTB wins with four of a kind vs AIP fullhouse$")
	public void htb_wins_with_four_of_a_kind_vs_AIP_fullhouse() throws Throwable {
		assertEquals(1,pokTest.returnWinner());
	}
	
	@Given("^HTB has four of a kind  vs flush$")
	public void htb_has_four_of_a_kind_flush_vs_flush() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR four of a kind vs flush");
		pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(17));
	}

	@When("^HTB compares hand with AIP - four of a kind VS flush$")
	public void htb_compares_hand_with_AIP_four_of_a_kind_VS_flush() throws Throwable {
		 pokTest.game();
	}

	@Then("^HTB wins with four of a kind vs AIP flush$")
	public void htb_wins_with_four_of_a_kind_vs_AIP_flush() throws Throwable {
		assertEquals(1,pokTest.returnWinner());
	}

@Given("^HTB has four of a kind  vs straight$")
public void htb_has_four_of_a_kind_flush_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs straight");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(18));
}

@When("^HTB compares hand with AIP - four of a kind VS straight$")
public void htb_compares_hand_with_AIP_four_of_a_kind_VS_straight() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with four of a kind vs AIP straight$")
public void htb_wins_with_four_of_a_kind_vs_AIP_straight() throws Throwable {
    assertEquals(1,pokTest.returnWinner());
}
@Given("^HTB has four of a kind  vs three of a kind$")
public void htb_has_four_of_a_kind_flush_vs_three_of_a_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs straight");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(19));
}

@When("^HTB compares hand with AIP - four of a kind VS three of a kind$")
public void htb_compares_hand_with_AIP_four_of_a_kind_VS_three_of_a_kind() throws Throwable {
	 pokTest.game();
}

@Then("^HTB wins with four of a kind vs AIP three of a kind$")
public void htb_wins_with_four_of_a_kind_vs_AIP_three_of_a_kind() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has four of a kind  vs two pair$")
public void htb_has_four_of_a_kind_flush_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs two pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(20));
}

@When("^HTB compares hand with AIP - four of a kind VS two pair$")
public void htb_compares_hand_with_AIP_four_of_a_kind_VS_two_pair() throws Throwable {
   pokTest.game();
}

@Then("^HTB wins with four of a kind vs AIP two pair$")
public void htb_wins_with_four_of_a_kind_vs_AIP_two_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has four of a kind  vs one pair$")
public void htb_has_four_of_a_kind_flush_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(21));
}

@When("^HTB compares hand with AIP - four of a kind VS one pair$")
public void htb_compares_hand_with_AIP_four_of_a_kind_VS_one_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with four of a kind vs AIP one pair$")
public void htb_wins_with_four_of_a_kind_vs_AIP_one_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has four of a kind  vs one card$")
public void htb_has_four_of_a_kind_flush_vs_one_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs high");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(22));
}

@When("^HTB compares hand with AIP - four of a kind VS one card$")
public void htb_compares_hand_with_AIP_four_of_a_kind_VS_one_card() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with four of a kind vs AIP one card$")
public void htb_wins_with_four_of_a_kind_vs_AIP_one_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has full house vs flush$")
public void htb_has_full_house_vs_flush() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs flush");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(23));
}

@When("^HTB compares hand with AIP - full house vs flush$")
public void htb_compares_hand_with_AIP_full_house_vs_flush() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with full house vs AIP flush$")
public void htb_wins_with_full_house_vs_AIP_flush() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has full house vs straight$")
public void htb_has_full_house_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs straight");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(24));
}

@When("^HTB compares hand with AIP - full house vs straight$")
public void htb_compares_hand_with_AIP_full_house_vs_straight() throws Throwable {
   pokTest.game();
}

@Then("^HTB wins with full house vs AIP straight$")
public void htb_wins_with_full_house_vs_AIP_straight() throws Throwable {
    assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has full house vs three of kind$")
public void htb_has_full_house_vs_three_of_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs straight");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(25));
}

@When("^HTB compares hand with AIP - full house vs three of kind$")
public void htb_compares_hand_with_AIP_full_house_vs_three_of_kind() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with full house vs AIP three of kind$")
public void htb_wins_with_full_house_vs_AIP_three_of_kind() throws Throwable {
   assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has full house vs two pairs$")
public void htb_has_full_house_vs_two_pairs() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs two pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(26));
}

@When("^HTB compares hand with AIP - full house vs two pairs$")
public void htb_compares_hand_with_AIP_full_house_vs_two_pairs() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with full house vs AIP two pairs$")
public void htb_wins_with_full_house_vs_AIP_two_pairs() throws Throwable {
	 assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has full house vs one pair$")
public void htb_has_full_house_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(26));
}

@When("^HTB compares hand with AIP - full house vs one pair$")
public void htb_compares_hand_with_AIP_full_house_vs_one_pair() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with full house vs AIP one pair$")
public void htb_wins_with_full_house_vs_AIP_one_pair() throws Throwable {
	 assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has full house vs high card$")
public void htb_has_full_house_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs hgih card");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(27));
}

@When("^HTB compares hand with AIP - full house vs high card$")
public void htb_compares_hand_with_AIP_full_house_vs_high_card() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with full house vs AIP high card$")
public void htb_wins_with_full_house_vs_AIP_high_card() throws Throwable {
	 assertEquals(1,pokTest.returnWinner());
}


@Given("^HTB has flush vs straight$")
public void htb_has_flush_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs straight");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(28));
}

@When("^HTB compares hand with AIP - flush vs straight$")
public void htb_compares_hand_with_AIP_flush_vs_straight() throws Throwable {
    pokTest.game();
}

@Then("^HTB wins with flush vs AIP straight$")
public void htb_wins_with_flush_vs_AIP_straight() throws Throwable {
   assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has flush vs three of kind$")
public void htb_has_flush_vs_three_of_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs three of a kind");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(29));
}

@When("^HTB compares hand with AIP - flush vs three of kind$")
public void htb_compares_hand_with_AIP_flush_vs_three_of_kind() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with flush vs AIP thre of kind$")
public void htb_wins_with_flush_vs_AIP_thre_of_kind() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has flush vs two pair$")
public void htb_has_flush_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs two pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(30));
}

@When("^HTB compares hand with AIP - flush vs two pair$")
public void htb_compares_hand_with_AIP_flush_vs_two_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with flush vs AIP two pair$")
public void htb_wins_with_flush_vs_AIP_two_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has flush vs one pair$")
public void htb_has_flush_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(31));
}

@When("^HTB compares hand with AIP - flush vs one pair$")
public void htb_compares_hand_with_AIP_flush_vs_one_pair() throws Throwable {
   pokTest.game();
}

@Then("^HTB wins with flush vs AIP one pair$")
public void htb_wins_with_flush_vs_AIP_one_pair() throws Throwable {
    assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has flush vs high card$")
public void htb_has_flush_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs high");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(32));
}

@When("^HTB compares hand with AIP - flush vs high card$")
public void htb_compares_hand_with_AIP_flush_vs_high_card() throws Throwable {
  pokTest.game();
}

@Then("^HTB wins with flush vs AIP high card$")
public void htb_wins_with_flush_vs_AIP_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}


@Given("^HTB has straight vs three of a kind$")
public void htb_has_straight_vs_three_of_a_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs three of");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(33));
}

@When("^HTB compares hand with AIP - straight vs three of a kind$")
public void htb_compares_hand_with_AIP_straight_vs_three_of_a_kind() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with straight vs AIP three of a kind$")
public void htb_wins_with_straight_vs_AIP_three_of_a_kind() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has straight vs two pair$")
public void htb_has_straight_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs two pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(34));
}

@When("^HTB compares hand with AIP - straight vs two pair$")
public void htb_compares_hand_with_AIP_straight_vs_two_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with straight vs AIP two pair$")
public void htb_wins_with_straight_vs_AIP_two_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has straight vs one pair$")
public void htb_has_straight_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(35));
}

@When("^HTB compares hand with AIP - straight vs one pair$")
public void htb_compares_hand_with_AIP_straight_vs_one_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with straight vs AIP one pair$")
public void htb_wins_with_straight_vs_AIP_one_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has straight vs high card$")
public void htb_has_straight_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs high card");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(36));
}

@When("^HTB compares hand with AIP - straight vs high card$")
public void htb_compares_hand_with_AIP_straight_vs_high_card() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with straight vs AIP high card$")
public void htb_wins_with_straight_vs_AIP_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has three of a kind vs two pair$")
public void htb_has_three_of_a_kind_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR three of a kind vs two pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(37));
}

@When("^HTB compares hand with AIP - three of a kind vs two pair$")
public void htb_compares_hand_with_AIP_three_of_a_kind_vs_two_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with three of a kind vs AIP two pair$")
public void htb_wins_with_three_of_a_kind_vs_AIP_two_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has three of a kind vs one pair$")
public void htb_has_three_of_a_kind_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR three of a kind vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(38));
}

@When("^HTB compares hand with AIP - three of a kind vs one pair$")
public void htb_compares_hand_with_AIP_three_of_a_kind_vs_one_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with three of a kind vs AIP one pair$")
public void htb_wins_with_three_of_a_kind_vs_AIP_one_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has three of a kind vs high card$")
public void htb_has_three_of_a_kind_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR three of a kind vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(39));
}

@When("^HTB compares hand with AIP - three of a kind vs high card$")
public void htb_compares_hand_with_AIP_three_of_a_kind_vs_high_card() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with three of a kind vs AIP high card$")
public void htb_wins_with_three_of_a_kind_vs_AIP_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}
@Given("^HTB has two pair vs one pair$")
public void htb_has_two_pair_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR two pair vs one pair");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(40));
}

@When("^HTB compares hand with AIP - two pair vs one pair$")
public void htb_compares_hand_with_AIP_two_pair_vs_one_pair() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with two pair vs AIP one pair$")
public void htb_wins_with_two_pair_vs_AIP_one_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has two pair vs high card$")
public void htb_has_two_pair_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR two pair vs high card");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(41));
}

@When("^HTB compares hand with AIP - two pair vs  high card$")
public void htb_compares_hand_with_AIP_two_pair_vs_high_card() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with two pair vs high card$")
public void htb_wins_with_two_pair_vs_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^HTB has one pair vs high card$")
public void htb_has_one_pair_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one pair vs high card");
	pokTest.constructCards(pokTest.readFile("HTBCucumber.txt").get(42));
}

@When("^HTB compares hand with AIP - one pair vs  high card$")
public void htb_compares_hand_with_AIP_one_pair_vs_high_card() throws Throwable {
	pokTest.game();
}

@Then("^HTB wins with one pair vs high card$")
public void htb_wins_with_one_pair_vs_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}




}
