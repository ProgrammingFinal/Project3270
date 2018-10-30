import java.util.Scanner;

public class Chapter03_12 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a three digit integer:");
int num = input.nextInt();
int dig1 = num%10;//  3
int lastTwo = num/10;//  12
int dig2 = lastTwo%10;//  2
int lastOne = lastTwo/10;//  1

if(dig1 == lastOne) {
	System.out.println(num + " is a palindrome");
	
} else {System.out.println(num + " is not a palindrome");
}//if

	}//main

}//class
