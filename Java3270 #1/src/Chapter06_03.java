import java.util.Scanner;

public class Chapter06_03 {

	public static void main(String[] args) {
		System.out.println("Enter a number to reverse");
		Scanner input = new Scanner(System.in);
		
int a = input.nextInt();
		System.out.println(reverse(a));
		
		System.out.println( a + " is a palindrome");
		System.out.println(isPalindrome(a));
		
	}//main
	public static int reverse(int number) {
		String strNum = "";
		for(int i = 0; number>=1;i++) {
			strNum += number%10;
			number/=10;
		}//for
		int reverse = Integer.parseInt(strNum);
		return reverse;
	}//reverse
	public static boolean isPalindrome(int number) {
		boolean isTrue;
		if(number==reverse(number)) {
			//System.out.println(number + " is a palindrome");
			isTrue = true;
			return isTrue;
		} else {//System.out.println(number + " is not a palindrome");
		isTrue = false;
		return isTrue;
		}//if
	}//isPalindrome
}
