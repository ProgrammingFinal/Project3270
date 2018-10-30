import java.util.Scanner;

public class IntegerSum {
	
	public static void main(String[] args ) 
	{
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt(); //to go thru comment steps for lines, use number 789 (works for all tho)
		int sum = 0;
		if(number < 1000) { //if the number is less than 1000 (do the steps until line with (else)) line 19
		int sum1 = number % 10; //remainder 9
		int number1 = (number - sum1)/10; //number1 is 78
		int sum2 = number1 % 10; //sum2 is 8
		int number2 = (number1 - sum2)/10; // number2 is 7
		int answer = sum + sum1 + sum2 + number2;
		System.out.println("The sum of the individual numbers of " + number + " equals " + answer);
		}else { // if the number is 1000, do the step below
				System.out.println("The sum of the individual numbers of 1000 equals 1");
		}
		
	}
	
	
}
