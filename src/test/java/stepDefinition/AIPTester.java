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

@Given("^AIP has one off  full house vs full house needs for one$")
public void aip_has_one_off_full_house_vs_full_house_needs_for_one() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off  full house vs full house");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(44));
}

@When("^AIP compares hand with HTB -  full house vs  full house  \\(distinct two pair\\)$")
public void aip_compares_hand_with_HTB_full_house_vs_full_house_distinct_two_pair() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with full house vs full house from one$")
public void aip_wins_with_full_house_vs_full_house_from_one() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has one off  full house vs full house needs for one \\(wont get it\\)$")
public void aip_has_one_off_full_house_vs_full_house_needs_for_one_wont_get_it() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off  full house vs full house");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(45));
}

@When("^AIP compares hand with HTB -  full house vs  full house  \\(distinct two pair\\) no full house$")
public void aip_compares_hand_with_HTB_full_house_vs_full_house_distinct_two_pair_no_full_house() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with not full house vs full house \\(only two pair\\)$")
public void aip_loses_with_not_full_house_vs_full_house_only_two_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}
@Given("^AIP has one off  full house vs full house needs for one \\(wont get it\\)\\(eqRank\\)$")
public void aip_has_one_off_full_house_vs_full_house_needs_for_one_wont_get_it_eqRank() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off  full house vs full house (equal rank)");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(46));
}

@When("^AIP compares hand with HTB -  full house vs  full house  \\(distinct two pair\\) no full house\\(eqRank\\)$")
public void aip_compares_hand_with_HTB_full_house_vs_full_house_distinct_two_pair_no_full_house_eqRank() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with not full house vs full house \\(only two pair\\)\\(eqRank\\)$")
public void aip_loses_with_not_full_house_vs_full_house_only_two_pair_eqRank() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP has one off from flush vs flush \\(lower rank\\)$")
public void aip_has_one_off_from_flush_vs_flush_lower_rank() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off flush vs flush (lower rank)");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(47));
}

@When("^AIP compares hand with HTB -  flush  vs  flush \\(lower rank\\)$")
public void aip_compares_hand_with_HTB_flush_vs_flush_lower_rank() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with flush vs flush \\(lower rank\\)$")
public void aip_wins_with_flush_vs_flush_lower_rank() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has one off from flush vs flush \\(lower rank\\) \\(wont get it\\)$")
public void aip_has_one_off_from_flush_vs_flush_lower_rank_wont_get_it() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off flush vs flush will lose ");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(48));
}

@When("^AIP compares hand with HTB -  not flush  vs  flush \\(lower rank\\)$")
public void aip_compares_hand_with_HTB_not_flush_vs_flush_lower_rank() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with flush vs flush \\(did not get flush\\)$")
public void aip_loses_with_flush_vs_flush_did_not_get_flush() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP has one off from flush vs flush with same suit and rank for four$")
public void aip_has_one_off_from_flush_vs_flush_with_same_suit_and_rank_for_four() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off flush vs flush will lose ");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(49));
}

@When("^AIP compares hand with HTB -  not flush  vs  flush  flush with same suit and rank for four$")
public void aip_compares_hand_with_HTB_not_flush_vs_flush_flush_with_same_suit_and_rank_for_four() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with flush vs flush  flush with same suit and rank for four$")
public void aip_loses_with_flush_vs_flush_flush_with_same_suit_and_rank_for_four() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP has one off from flush vs flush with same suit and rank for three highest$")
public void aip_has_one_off_from_flush_vs_flush_with_same_suit_and_rank_for_three_highest() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off flush vs flush [same top 3]");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(50));
}

@When("^AIP compares hand with HTB -  not flush  vs  flush  flush with same suit and rank for three highest$")
public void aip_compares_hand_with_HTB_not_flush_vs_flush_flush_with_same_suit_and_rank_for_three_highest() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with flush vs flush  flush with same suit and rank for for three highest$")
public void aip_loses_with_flush_vs_flush_flush_with_same_suit_and_rank_for_for_three_highest() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP has one off from flush vs flush with same suit and rank for two highest$")
public void aip_has_one_off_from_flush_vs_flush_with_same_suit_and_rank_for_two_highest() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off flush vs flush [same top 2] ");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(51));
}

@When("^AIP compares hand with HTB -  not flush  vs  flush  flush with same suit and rank for two highest$")
public void aip_compares_hand_with_HTB_not_flush_vs_flush_flush_with_same_suit_and_rank_for_two_highest() throws Throwable {
	pokTest.game();
}

@Then("^AIP loses with flush vs flush  flush with same suit and rank for for two highest$")
public void aip_loses_with_flush_vs_flush_flush_with_same_suit_and_rank_for_for_two_highest() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP has one off from straight vs straight$")
public void aip_has_one_off_from_straight_vs_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off straight vs straight ");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(52));
}

@When("^AIP compares hand with HTB -  straight  vs  straight$")
public void aip_compares_hand_with_HTB_straight_vs_straight() throws Throwable {
	pokTest.game();
}

@Then("^AIP wins with straight vs straight with a higher ranks straight$")
public void aip_wins_with_straight_vs_straight_with_a_higher_ranks_straight() throws Throwable {
	assertEquals(0,pokTest.returnWinner());
}

@Given("^AIP has one off from straight vs straight and will not draw into straight$")
public void aip_has_one_off_from_straight_vs_straight_and_will_not_draw_into_straight() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off straight vs straight ");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(53));
}

@When("^AIP compares hand with HTB - not straight  vs  straight$")
public void aip_compares_hand_with_HTB_not_straight_vs_straight() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with not a straight vs straight$")
public void aip_lose_with_not_a_straight_vs_straight() throws Throwable {
	assertEquals(1,pokTest.returnWinner());   
}

@Given("^AIP has a straight and HTB has a straight AIP's straight is lower rank$")
public void aip_has_a_straight_and_HTB_has_a_straight_AIP_s_straight_is_lower_rank() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off straight vs straight (same rank)");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(54));
}

@When("^AIP compares hand with HTB -  straight is lower rank  vs  straight$")
public void aip_compares_hand_with_HTB_straight_is_lower_rank_vs_straight() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with lower rank straight vs straight$")
public void aip_lose_with_lower_rank_straight_vs_straight() throws Throwable {
	assertEquals(1,pokTest.returnWinner()); 
}

@Given("^AIP four of a kind same as HTB but with higher quad$")
public void aip_four_of_a_kind_same_as_HTB_but_with_higher_quad() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one off straight vs straight (same rank)");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(55));
}

@When("^AIP compares hand with HTB but with higher quad$")
public void aip_compares_hand_with_HTB_but_with_higher_quad() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with lower rank quad vs higher rank quad$")
public void aip_lose_with_lower_rank_quad_vs_higher_rank_quad() throws Throwable {
	assertEquals(1,pokTest.returnWinner()); 
}


@Given("^AIP two pair same as HTB but HTB has the higher suit$")
public void aip_two_pair_same_as_HTB_but_HTB_has_the_higher_suit() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR two pair same rank but different suit");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(56));
}

@When("^AIP compares hand with HTB but HTB has the higher suit$")
public void aip_compares_hand_with_HTB_but_HTB_has_the_higher_suit() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with lower suit two pair vs higher suit two pair$")
public void aip_lose_with_lower_suit_two_pair_vs_higher_suit_two_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner()); 
}
@Given("^AIP one pair same as HTB but HTB has the higher suit$")
public void aip_one_pair_same_as_HTB_but_HTB_has_the_higher_suit() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one pair same rank but different suit");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(57));
}

@When("^AIP compares hand with HTB but HTB's one pair has the higher suit$")
public void aip_compares_hand_with_HTB_but_HTB_s_one_pair_has_the_higher_suit() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with lower suit one pair vs higher suit one pair$")
public void aip_lose_with_lower_suit_one_pair_vs_higher_suit_one_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner()); 
}

@Given("^AIP one pair lower rank as HTB but HTB$")
public void aip_one_pair_lower_rank_as_HTB_but_HTB() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR one pair with AIP lower rank");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(58));
}

@When("^AIP compares hand with HTB but HTB has a higher ranked pair$")
public void aip_compares_hand_with_HTB_but_HTB_has_a_higher_ranked_pair() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with lower suit one pair vs higher ranked pair$")
public void aip_lose_with_lower_suit_one_pair_vs_higher_ranked_pair() throws Throwable {
	assertEquals(1,pokTest.returnWinner()); 
}

@Given("^AIP high card same rank as HTB but HTB has higher suit$")
public void aip_high_card_same_rank_as_HTB_but_HTB_has_higher_suit() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR high card with AIP has lower suit");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(59));
}

@When("^AIP compares hand with HTB but HTB has a higher suit high card$")
public void aip_compares_hand_with_HTB_but_HTB_has_a_higher_suit_high_card() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with high card vs higher suit high card$")
public void aip_lose_with_high_card_vs_higher_suit_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

@Given("^AIP high card higher rank as HTB$")
public void aip_high_card_higher_rank_as_HTB() throws Throwable {
	pokTest = new pokerClass();
	System.out.println("THIS IS THE TEST FOR high card with AIP has higher rank");
	pokTest.constructCards(pokTest.readFile("AIPCucumber.txt").get(60));
}

@When("^AIP compares hand with HTB but HTB has a higher rank card$")
public void aip_compares_hand_with_HTB_but_HTB_has_a_higher_rank_card() throws Throwable {
	pokTest.game();
}

@Then("^AIP lose with high card vs higher rank high card$")
public void aip_lose_with_high_card_vs_higher_rank_high_card() throws Throwable {
	assertEquals(1,pokTest.returnWinner());
}

}
