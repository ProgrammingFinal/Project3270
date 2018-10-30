import java.util.Scanner;

public class Chapter03_17 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("scissor (0), rock (1), paper (2):");
	double random = Math.random();
	int compMove = (int) (random*3);
	
	int playerMove = input.nextInt();
	
	if(playerMove == 0 && compMove == 1) {
		System.out.println("The computer is rock. You are scissor. You lost");
	} else if(playerMove == 0 && compMove == 2) {
		System.out.println("The computer is paper. You are scissor. You win");
		
	} else if(playerMove == 0 && compMove == 0) {
		System.out.println("The computer is scissor. You are scissor too. It is a draw");
		
	} else if(playerMove == 1 && compMove == 1) {
		System.out.println("The computer is rock. You are rock too. It is a draw");
		
	} else if(playerMove == 1 && compMove == 0) {
		System.out.println("The computer is scissor. You are rock. You win");
		
	} else if(playerMove == 1 && compMove == 2) {
		System.out.println("The computer is paper. You are rock. You lost");
		
	} else if(playerMove == 2 && compMove == 0) {
		System.out.println("The computer is scissor. You are paper. You lost");
	} else if(playerMove == 2 && compMove == 1) {
		System.out.println("The computer is rock. You are paper. You win");
	} else if(playerMove == 2 && compMove == 2) {
	System.out.println("The computer is paper. You are paper too. It is a draw");
	} else {System.out.println("Must choose a number between 0, 1, & 2");
	
	}

}//main
}//class
