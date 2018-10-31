package stepDefinition;
import static org.junit.Assert.assertEquals;

import assignment1.handIdentifierClass;
import assignment1.pokerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AIPTester {
	handIdentifierClass HIC = new handIdentifierClass();
	pokerClass pokTest = new pokerClass();

	@Given("^AIP has Royal flush vs HTB Straight Flush$")
	public void AIP_has_Royal_flush_vs_HTB_Straight_Flush() throws Throwable {
		System.out.println("THIS IS THE TEST FOR Royal Flush s Straight Flush");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(0));
	}

	@When("^AIP compares hand with HTB - RF VS SF$")
	public void AIP_compares_hand_with_HTB_RF_VS_SF() throws Throwable {
	   pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB Straight Flush$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_Straight_Flush() throws Throwable {
	   assertEquals(0,pokTest.returnWinner());
	}
	
	@Given("^AIP has Royal flush vs HTB four of a kind$")
	public void AIP_has_Royal_flush_vs_HTB_of_a_kind() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs four of a kind");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(1));
	}

	@When("^AIP compares hand with HTB - RF VS four of a kind$")
	public void AIP_compares_hand_with_HTB_RF_VS_OfKind() throws Throwable {
		pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB four of a kind$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_of_a_kind() throws Throwable {
		 assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Royal flush vs HTB full house$")
	public void AIP_has_Royal_flush_vs_HTB_full_house() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs full house");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(2));
	}

	@When("^AIP compares hand with HTB - RF VS full house$")
	public void AIP_compares_hand_with_HTB_RF_VS_full_house() throws Throwable {
	    pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB full house$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_full_house() throws Throwable {
		 assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Royal flush vs HTB flush$")
	public void AIP_has_Royal_flush_vs_HTB_flush() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs flush");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(3));
	}

	@When("^AIP compares hand with HTB - RF VS flush$")
	public void AIP_compares_hand_with_HTB_RF_VS_flush() throws Throwable {
		pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB flush$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_flush() throws Throwable {
		 assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Royal flush vs HTB Straight$")
	public void AIP_has_Royal_flush_vs_HTB_Straight() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs Straight");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(4));
	}

	@When("^AIP compares hand with HTB - RF VS Straight$")
	public void AIP_compares_hand_with_HTB_RF_VS_Straight() throws Throwable {
	   pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB Straight$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_Straight() throws Throwable {
		 assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Royal flush vs HTB Three of$")
	public void AIP_has_Royal_flush_vs_HTB_Three_of() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs Three of");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(5));
	}

	@When("^AIP compares hand with HTB - RF VS Three of$")
	public void AIP_compares_hand_with_HTB_RF_VS_Three_of() throws Throwable {
	   pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB Three of$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_Three_of() throws Throwable {
	   assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Royal flush vs HTB Two Pairs$")
	public void AIP_has_Royal_flush_vs_HTB_Two_Pairs() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs Two Pair");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(6));
	}

	@When("^AIP compares hand with HTB - RF VS Two Pairs$")
	public void AIP_compares_hand_with_HTB_RF_VS_Two_Pairs() throws Throwable {
	    pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB Two Pairs$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_Two_Pairs() throws Throwable {
	    assertEquals(0,pokTest.returnWinner());
	}
	
	pokerClass pokTest2 = new pokerClass();
	@Given("^AIP has Royal flush vs HTB One Pair$")
	public void AIP_has_Royal_flush_vs_HTB_One_Pair() throws Throwable {
		
		System.out.println("THIS IS THE TEST FOR Royal Flush vs One Pair");
		pokTest2.constructCards(pokTest2.readFile("AIPCucumber.txt").get(7));
	}

	@When("^AIP compares hand with HTB - RF VS One Pair$")
	public void AIP_compares_hand_with_HTB_RF_VS_One_Pair() throws Throwable {
	   pokTest2.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB One Pair$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_One_Pair() throws Throwable {
	    assertEquals(0,pokTest2.returnWinner());
	}
	@Given("^AIP has Royal flush vs HTB One High$")
	public void AIP_has_Royal_flush_vs_HTB_One_High() throws Throwable {
	    pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Royal Flush vs One High");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(8));
	}

	@When("^AIP compares hand with HTB - RF VS One High$")
	public void AIP_compares_hand_with_HTB_RF_VS_One_High() throws Throwable {
	    pokTest.game();
	}

	@Then("^AIP wins with Royal Flush vs HTB One High$")
	public void AIP_wins_with_Royal_Flush_vs_HTB_One_High() throws Throwable {
	    assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Straight flush vs HTB four of a kind$")
	public void AIP_has_Straight_flush_vs_HTB_four_of_a_kind() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs four of a kind");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(9));
	}

	@When("^AIP compares hand with HTB - SF VS four of a kind$")
	public void AIP_compares_hand_with_HTB_SF_VS_four_of_a_kind() throws Throwable {
	   pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB four of a kind$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_four_of_a_kind() throws Throwable {
	    assertEquals(0,pokTest.returnWinner());
	}
	
	@Given("^AIP has Straight flush vs full house$")
	public void AIP_has_Straight_flush_vs_full_house() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs four of a kind");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(10));
	}

	@When("^AIP compares hand with HTB - SF VS full house$")
	public void AIP_compares_hand_with_HTB_SF_VS_full_house() throws Throwable {
		  pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB full house$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_full_house() throws Throwable {
	    assertEquals(0,pokTest.returnWinner());
	}
	
	@Given("^AIP has Straight flush vs flush$")
	public void AIP_has_Straight_flush_vs_flush() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs flush");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(11));
	}

	@When("^AIP compares hand with HTB - SF VS flush$")
	public void AIP_compares_hand_with_HTB_SF_VS_flush() throws Throwable {
	    pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB flush$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_flush() throws Throwable {
	    assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Straight flush vs straight$")
	public void AIP_has_Straight_flush_vs_straight() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs straight");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(12));
	}

	@When("^AIP compares hand with HTB - SF VS straight$")
	public void AIP_compares_hand_with_HTB_SF_VS_straight() throws Throwable {
	    pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB straight$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_straight() throws Throwable {
	   assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Straight flush vs three of a kind$")
	public void AIP_has_Straight_flush_vs_three_of_a_kind() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs straight");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(13));
	}

	@When("^AIP compares hand with HTB - SF VS three of a kind$")
	public void AIP_compares_hand_with_HTB_SF_VS_three_of_a_kind() throws Throwable {
	   pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB three of a kind$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_three_of_a_kind() throws Throwable {
		  assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Straight flush vs two pair$")
	public void AIP_has_Straight_flush_vs_two_pair() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs two pair");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(14));
	}

	@When("^AIP compares hand with HTB - SF VS two pair$")
	public void AIP_compares_hand_with_HTB_SF_VS_two_pair() throws Throwable {
		pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB two pair$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_two_pair() throws Throwable {
	   assertEquals(0,pokTest.returnWinner());
	}
	@Given("^AIP has Straight flush vs highest$")
	public void AIP_has_Straight_flush_vs_highest() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR Straight Flush vs highest");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(15));
	}

	@When("^AIP compares hand with HTB - SF VS highest$")
	public void AIP_compares_hand_with_HTB_SF_VS_highest() throws Throwable {
	  pokTest.game();
	}

	@Then("^AIP wins with Straight Flush vs HTB highest$")
	public void AIP_wins_with_Straight_Flush_vs_HTB_highest() throws Throwable {
	   assertEquals(0,pokTest.returnWinner());
	}
	
	@Given("^AIP has four of a kind  vs full house$")
	public void AIP_has_four_of_a_kind_flush_vs_full_house() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR four of a kind vs fullhouse");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(16));
	}

	@When("^AIP compares hand with HTB - four of a kind VS fullhouse$")
	public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_fullhouse() throws Throwable {
	    pokTest.game();
	}

	@Then("^AIP wins with four of a kind vs HTB fullhouse$")
	public void AIP_wins_with_four_of_a_kind_vs_HTB_fullhouse() throws Throwable {
		assertEquals(0,pokTest.returnWinner());
	}
	
	@Given("^AIP has four of a kind  vs flush$")
	public void AIP_has_four_of_a_kind_flush_vs_flush() throws Throwable {
		pokTest = new pokerClass();
		System.out.println("THIS IS THE TEST FOR four of a kind vs flush");
		pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(17));
	}

	@When("^AIP compares hand with HTB - four of a kind VS flush$")
	public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_flush() throws Throwable {
		 pokTest.game();
	}

	@Then("^AIP wins with four of a kind vs HTB flush$")
	public void AIP_wins_with_four_of_a_kind_vs_HTB_flush() throws Throwable {
		assertEquals(0,pokTest.returnWinner());
	}

@Given("^AIP has four of a kind  vs straight$")
public void AIP_has_four_of_a_kind_flush_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs straight");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(18));
}

@When("^AIP compares hand with HTB - four of a kind VS straight$")
public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_straight() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with four of a kind vs HTB straight$")
public void AIP_wins_with_four_of_a_kind_vs_HTB_straight() throws Throwable {
    assertEquals(0,pokTest.returnWinner());
}
@Given("^AIP has four of a kind  vs three of a kind$")
public void AIP_has_four_of_a_kind_flush_vs_three_of_a_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs straight");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(19));
}

@When("^AIP compares hand with HTB - four of a kind VS three of a kind$")
public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_three_of_a_kind() throws Throwable {
	 pokTest.game();
}

@Then("^AIP wins with four of a kind vs HTB three of a kind$")
public void AIP_wins_with_four_of_a_kind_vs_HTB_three_of_a_kind() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has four of a kind  vs two pair$")
public void AIP_has_four_of_a_kind_flush_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs two pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(20));
}

@When("^AIP compares hand with HTB - four of a kind VS two pair$")
public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_two_pair() throws Throwable {
   pokTest.game();
}

@Then("^AIP wins with four of a kind vs HTB two pair$")
public void AIP_wins_with_four_of_a_kind_vs_HTB_two_pair() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has four of a kind  vs one pair$")
public void AIP_has_four_of_a_kind_flush_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs one pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(21));
}

@When("^AIP compares hand with HTB - four of a kind VS one pair$")
public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_one_pair() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with four of a kind vs HTB one pair$")
public void AIP_wins_with_four_of_a_kind_vs_HTB_one_pair() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has four of a kind  vs one card$")
public void AIP_has_four_of_a_kind_flush_vs_one_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR four of a kind vs high");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(22));
}

@When("^AIP compares hand with HTB - four of a kind VS one card$")
public void AIP_compares_hand_with_HTB_four_of_a_kind_VS_one_card() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with four of a kind vs HTB one card$")
public void AIP_wins_with_four_of_a_kind_vs_HTB_one_card() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has full house vs flush$")
public void AIP_has_full_house_vs_flush() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs flush");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(23));
}

@When("^AIP compares hand with HTB - full house vs flush$")
public void AIP_compares_hand_with_HTB_full_house_vs_flush() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with full house vs HTB flush$")
public void AIP_wins_with_full_house_vs_HTB_flush() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has full house vs straight$")
public void AIP_has_full_house_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs straight");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(24));
}

@When("^AIP compares hand with HTB - full house vs straight$")
public void AIP_compares_hand_with_HTB_full_house_vs_straight() throws Throwable {
   pokTest.game();
}

@Then("^AIP wins with full house vs HTB straight$")
public void AIP_wins_with_full_house_vs_HTB_straight() throws Throwable {
    assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has full house vs three of kind$")
public void AIP_has_full_house_vs_three_of_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs straight");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(25));
}

@When("^AIP compares hand with HTB - full house vs three of kind$")
public void AIP_compares_hand_with_HTB_full_house_vs_three_of_kind() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with full house vs HTB three of kind$")
public void AIP_wins_with_full_house_vs_HTB_three_of_kind() throws Throwable {
   assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has full house vs two pairs$")
public void AIP_has_full_house_vs_two_pairs() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs two pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(26));
}

@When("^AIP compares hand with HTB - full house vs two pairs$")
public void AIP_compares_hand_with_HTB_full_house_vs_two_pairs() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with full house vs HTB two pairs$")
public void AIP_wins_with_full_house_vs_HTB_two_pairs() throws Throwable {
	 assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has full house vs one pair$")
public void AIP_has_full_house_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs one pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(26));
}

@When("^AIP compares hand with HTB - full house vs one pair$")
public void AIP_compares_hand_with_HTB_full_house_vs_one_pair() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with full house vs HTB one pair$")
public void AIP_wins_with_full_house_vs_HTB_one_pair() throws Throwable {
	 assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has full house vs high card$")
public void AIP_has_full_house_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR full house vs hgih card");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(27));
}

@When("^AIP compares hand with HTB - full house vs high card$")
public void AIP_compares_hand_with_HTB_full_house_vs_high_card() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with full house vs HTB high card$")
public void AIP_wins_with_full_house_vs_HTB_high_card() throws Throwable {
	 assertEquals(0,pokTest.returnWinner());
}


@Given("^AIP has flush vs straight$")
public void AIP_has_flush_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs straight");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(28));
}

@When("^AIP compares hand with HTB - flush vs straight$")
public void AIP_compares_hand_with_HTB_flush_vs_straight() throws Throwable {
    pokTest.game();
}

@Then("^AIP wins with flush vs HTB straight$")
public void AIP_wins_with_flush_vs_HTB_straight() throws Throwable {
   assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has flush vs three of kind$")
public void AIP_has_flush_vs_three_of_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs three of a kind");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(29));
}

@When("^AIP compares hand with HTB - flush vs three of kind$")
public void AIP_compares_hand_with_HTB_flush_vs_three_of_kind() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with flush vs HTB thre of kind$")
public void AIP_wins_with_flush_vs_HTB_thre_of_kind() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has flush vs two pair$")
public void AIP_has_flush_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs two pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(30));
}

@When("^AIP compares hand with HTB - flush vs two pair$")
public void AIP_compares_hand_with_HTB_flush_vs_two_pair() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with flush vs HTB two pair$")
public void AIP_wins_with_flush_vs_HTB_two_pair() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has flush vs one pair$")
public void AIP_has_flush_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs one pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(31));
}

@When("^AIP compares hand with HTB - flush vs one pair$")
public void AIP_compares_hand_with_HTB_flush_vs_one_pair() throws Throwable {
   pokTest.game();
}

@Then("^AIP wins with flush vs HTB one pair$")
public void AIP_wins_with_flush_vs_HTB_one_pair() throws Throwable {
    assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has flush vs high card$")
public void AIP_has_flush_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR flush vs high");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(32));
}

@When("^AIP compares hand with HTB - flush vs high card$")
public void AIP_compares_hand_with_HTB_flush_vs_high_card() throws Throwable {
  pokTest.game();
}

@Then("^AIP wins with flush vs HTB high card$")
public void AIP_wins_with_flush_vs_HTB_high_card() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}


@Given("^AIP has straight vs three of a kind$")
public void AIP_has_straight_vs_three_of_a_kind() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs three of");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(33));
}

@When("^AIP compares hand with HTB - straight vs three of a kind$")
public void AIP_compares_hand_with_HTB_straight_vs_three_of_a_kind() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight vs HTB three of a kind$")
public void AIP_wins_with_straight_vs_HTB_three_of_a_kind() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has straight vs two pair$")
public void AIP_has_straight_vs_two_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs two pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(34));
}

@When("^AIP compares hand with HTB - straight vs two pair$")
public void AIP_compares_hand_with_HTB_straight_vs_two_pair() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight vs HTB two pair$")
public void AIP_wins_with_straight_vs_HTB_two_pair() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has straight vs one pair$")
public void AIP_has_straight_vs_one_pair() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs one pair");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(35));
}

@When("^AIP compares hand with HTB - straight vs one pair$")
public void AIP_compares_hand_with_HTB_straight_vs_one_pair() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight vs HTB one pair$")
public void AIP_wins_with_straight_vs_HTB_one_pair() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has straight vs high card$")
public void AIP_has_straight_vs_high_card() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight vs high card");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(36));
}

@When("^AIP compares hand with HTB - straight vs high card$")
public void AIP_compares_hand_with_HTB_straight_vs_high_card() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight vs HTB high card$")
public void AIP_wins_with_straight_vs_HTB_high_card() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has one off royal flush vs royal flush$")
public void aip_has_one_off_royal_flush_vs_royal_flush() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR royal flush one off  vs royal flush");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(37));
}

@When("^AIP compares hand with HTB - royal flush vs royal flush$")
public void aip_compares_hand_with_HTB_royal_flush_vs_royal_flush() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with royal flush vs royal flush lower suit$")
public void aip_wins_with_royal_flush_vs_royal_flush_lower_suit() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has one off royal flush vs royal flush higher suit$")
public void aip_has_one_off_royal_flush_vs_royal_flush_higher_suit() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR royal flush one off  vs royal flush");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(38));
}

@When("^AIP compares hand with HTB - one off royal flush vs royal flush$")
public void aip_compares_hand_with_HTB_one_off_royal_flush_vs_royal_flush() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with royal flush vs royal flush$")
public void aip_loses_with_royal_flush_vs_royal_flush() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP has one off straight flush vs straight flush$")
public void aip_has_one_off_straight_flush_vs_straight_flush() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight flush one off  vs straight flush");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(39));
}

@When("^AIP compares hand with HTB -  straight flush vs  straight flush$")
public void aip_compares_hand_with_HTB_straight_flush_vs_straight_flush() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight flush vs  straight flush lower suit$")
public void aip_wins_with_straight_flush_vs_straight_flush_lower_suit() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has one off  straight flush vs straight flush higher suit$")
public void aip_has_one_off_straight_flush_vs_straight_flush_higher_suit() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight flush one off  vs straight flush");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(40));
}

@When("^AIP compares hand with HTB - one off  straight flush vs  straight flush$")
public void aip_compares_hand_with_HTB_one_off_straight_flush_vs_straight_flush() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with not straight flush vs  straight flush$")
public void aip_loses_with_straight_flush_vs_straight_flush() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}


@Given("^AIP has one off  straight flush vs straight flush higher suit \\(with one distinct higher\\)$")
public void aip_has_one_off_straight_flush_vs_straight_flush_higher_suit_with_one_distinct_higher() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR straight flush one off  vs straight flush (distinct higher)");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(41));
}

@When("^AIP compares hand with HTB - one off  straight flush vs  straight flush \\(with one distinct higher\\)$")
public void aip_compares_hand_with_HTB_one_off_straight_flush_vs_straight_flush_with_one_distinct_higher() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight flush vs  straight flush \\(with one distinct higher\\)$")
public void aip_wins_with_straight_flush_vs_straight_flush_with_one_distinct_higher() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has two off  full house vs full house$")
public void aip_has_two_off_full_house_vs_full_house() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR two off  full house vs full house");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(42));
}

@When("^AIP compares hand with HTB -  full house vs  full house \\(with distinct higherSet\\)$")
public void aip_compares_hand_with_HTB_full_house_vs_full_house_with_distinct_higherSet() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with full house vs full house$")
public void aip_wins_with_full_house_vs_full_house() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has two off  full house vs full house needs swap$")
public void aip_has_two_off_full_house_vs_full_house_needs_swap() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR two off  full house vs full house");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(43));
}

@When("^AIP compares hand with HTB - two off  full house vs  full house$")
public void aip_compares_hand_with_HTB_two_off_full_house_vs_full_house() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with not full house vs full house$")
public void aip_loses_with_full_house_vs_full_house() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}




}
