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
	
	public int returnCardRank() {
		return this.rank;
	}
	public String returnSuitName() {
		return this.suitName.toString();
	}
}
