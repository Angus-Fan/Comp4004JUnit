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
	}
	
	
	public String returnSuitName() {
		return this.suitName.toString();
	}
}
