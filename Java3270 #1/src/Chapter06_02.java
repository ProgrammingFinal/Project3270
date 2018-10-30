import java.util.Scanner;
public class Chapter06_02 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to sum:");
		long a = input.nextLong();
		System.out.println(sumDigits(a));
	}
	
	public static int sumDigits(long n) {
		
		
		
		int sum = 0;
		
		for(int i = 0;n>=1;i++) {
			sum += (int) n%10;
			n/=10;
		}
		System.out.println("The sum of the integers is ");
		return sum;
	}//sumDigits

}
