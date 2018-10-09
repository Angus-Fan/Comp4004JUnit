package assignment1;

public class test {

	
	public static void main(String[] args) {
		pokerClass pok = new pokerClass();
		pok.constructCards(pok.readFile("game.txt").get(0));
		
		pok.game();
	}
}
