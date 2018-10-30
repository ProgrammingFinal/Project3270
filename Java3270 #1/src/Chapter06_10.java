import java.util.Scanner;
public class Chapter06_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Up to what number would you like to check for primes?");
		int num = input.nextInt();
		numOfPrime(num);
		

	}//main
	public static void numOfPrime(int num) {
		int count = 1;
		String list = "2 ";
		for(int i = 2; i <= num; i++) {
			for( int j = 1; j<=i; j++) {
				if(i%j==0 && i!=j && j!=1) {
					break;
				} else if(i%j==0 && i==j && i%2!=0) {
					count++;
					list+= i + " ";
				}//if
			}//inner loop
		}//outer loop
		System.out.println(count + " prime numbers were counted");
		System.out.println("The numbers counted are: " + list);
	}

}//class
