import java.util.Scanner;
public class Chapter04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value between 0-15");
		int value = input.nextInt();
		String hex = Integer.toHexString(value);
		
		if(value>15) {
			System.out.println(value + " is an invaled input");
			value = input.nextInt();
			hex = Integer.toHexString(value);
		}
		
		System.out.println(hex.toUpperCase());
		
		
		
		
		
		
		
	}

}
