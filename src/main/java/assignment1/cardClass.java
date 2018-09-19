package assignment1;

public class cardClass {
	private cardSuits suitName;
	private int rank;
	public enum cardSuits{
		Diamond, Club, Heart, Spade
	}
	
	public cardClass(int cardRank,cardSuits cardSuit) {
		this.rank = cardRank;
		this.suitName = cardSuit;
		System.out.println("The card rank is : " + rank);
		System.out.println("The card suit is : " + suitName);
	}
	
	public static void main(String[] args) {
    
		cardClass card1 = new cardClass(1,cardSuits.Diamond);
	}

}
