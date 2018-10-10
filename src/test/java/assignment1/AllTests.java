package assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ cardClassTester.class, cardTestEquals.class, flushTest.class, FourOfAKindTest.class,
		fullHouseTest.class, gameTest.class, pokerHandDontSwap.class, royalFlushTest.class, straightFlush.class,
		straightFlushTest.class, straightTest.class, swapOut3With2HighestCards.class, swapOutOneDoublePair.class,
		swapOutOneOffFullHouse.class, swapOutOneOfFlush.class, swapOutOneOfStraight.class, swapOutThreeOfOnePair.class,
		swapOutTwoOfFlush.class, swapOutTwoOfSequenceThree.class, swapOutTwoOfThreeOfKind.class })
public class AllTests {

}
