import java.util.Scanner;
public class Chapter02_6 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000");
int number = input.nextInt();

if(number>1000) {
	System.out.println("This number can't be more than 1000, please enter another number.");
	number = input.nextInt();	
}//if
int one = number%10;
number /= 10;
int two = number%10;
number/= 10;
int three = number%10;
number/=10;
int four = number%10;

int sum = one+two+three+four;

System.out.println("The sum of digits is " + sum);

	}

}
