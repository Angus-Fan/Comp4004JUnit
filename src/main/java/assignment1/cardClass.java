package assignment1;

public class cardClass {
	private String suitName;
	private String rank;
	
	
	
	public cardClass(String cardRank,String cardSuit) {
		this.rank = cardRank;
		this.suitName = cardSuit;
	}
	
	public String returnCardRank() {
		return rank;
	}
	public String returnSuitName() {
		return suitName;
	}
	public String returnCardString() {
		return suitName+rank;
	}
}
