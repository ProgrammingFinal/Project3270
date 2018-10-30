import java.util.Scanner;

public class Chapter06_23 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Write a string");
		String str = input.next();
		System.out.println("Write a char to find");
		String b = input.next();
		char a = b.charAt(0);
		
		System.out.println(count(str, a));
		
		
	}//main

	public static int count(String str, char a) {
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==a) {
				count++;
			}//if
		}//for
		return count;
	}//count
	
	
}//class
