import java.util.Scanner;

public class Chapter06_31 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a credit card number as a long integer:");
		long num = input.nextLong();
		
	int validNum = sumOfOddPlace(num)+sumOfDoubleEvenPlace(num);
		if(validNum%10==0) {
			System.out.println(num + " is valid");
		} else {System.out.println(num + " is invalid");
		}//if
		System.out.println(num + " is " + getSize(num) + " digits long");
		
	}//main

	public static int sumOfOddPlace(long n) {
		
		int sum = 0;
		for(int i = 1; n>=1; n/=10) {
			sum+=n%10;
			n/=10;
		}//for
		return sum;
	}//sumOfOddPlace
	
	public static int sumOfDoubleEvenPlace(long n) {
		int sum = 0;
		for(int i = 0; n>=1; n/=10) {
			int duble = 0;
			n/=10;
			duble = (int) (n%10)*2;
			sum+=getDigit(duble);
		}//for
		return sum;
	}//sumOfDoubleEvenPlace
	
	
	public static int getDigit(int num) {
		int secondDig = 0;
		int dubDigAnswer = 0;
		if(num>=10) {
			secondDig+=num%10;
			num/=10;
			dubDigAnswer = num + secondDig;
			return dubDigAnswer;
		} else {return num;}
		
	}//getDigit
	
	public static int getSize(long n) {
		int count = 0;
		for(int i=0;(n>=1);n/=10) {
			count++;
		}
		return count;		
	}//getSize
	
	
	
	
}//class
