import java.util.Scanner;

public class Chapter03_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] rank = new String [13];
		String [] suit = new String [4];
		
		rank[0] = "Ace";
		rank[1] = "Two";
		rank[2] = "Three";
		rank[3] = "Four";
		rank[4] = "Five";
		rank[5] = "Six";
		rank[6] = "Seven";
		rank[7] = "Eight";
		rank[8] = "Nine";
		rank[9] = "Ten";
		rank[10] = "Jack";
		rank[11] = "Queen";
		rank[12] = "King";
		
		suit[0] = "Clubs";
		suit[1] = "Diamonds";
		suit[2] = "Heart";
		suit[3] = "Spades";
		
		int randRank = (int) (Math.random()*13);
		int randSuit = (int) (Math.random()*4);
		
		System.out.println("The card you picked is " + rank[randRank] + " of " + suit[randSuit]);
		
		
		
		
	}

}
