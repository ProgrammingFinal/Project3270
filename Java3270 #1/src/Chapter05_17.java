import java.util.Scanner;
public class Chapter05_17 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of lines: ");
		
	int num = input.nextInt();
	

	for(int i = 1; i <= num; i++) {
		for(int j = 1; j<=(num-i); j++) {
			System.out.print("  ");
		}
		
		for(int j = i; j>=1; j--) {
			System.out.print(j + " ");
		}
		
		for(int j = 2; j<=i; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
		
		
	}//main

}//class
