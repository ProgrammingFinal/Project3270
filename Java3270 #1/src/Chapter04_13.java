import java.util.Scanner;

public class Chapter04_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter:");
		
		char letter = input.next().charAt(0);
		int num = (int) letter;
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println(letter + " is a vowel");
		} else if(!(num>64 && num<91) || !(num>96 && num<123)) {
			System.out.println(letter + " is an invalid input");
		} else {System.out.println(letter + " is a consonant");
		
		}//if
		
		
		
	}

}
