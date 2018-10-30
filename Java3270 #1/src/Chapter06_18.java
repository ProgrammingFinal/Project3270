import java.util.Scanner;
public class Chapter06_18 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
/*char a = '9';
int b = (int) a;
		System.out.println(b);*/
		System.out.println("Enter a Password, at least 8 characters,  at least 2 numbers, and only numbers and letters");
		String string = input.next();
		checkPassword(string);
	}//main
	public static void checkPassword(String n) {
		int countNum = 0;
		int stringLeng= 0;
		
		if(n.length()<8) {
		System.out.println("Invalid Password: Needs to be at least 8 characters long");
		} else {
		for(int i = 0; i<n.length();i++) {
			if(n.charAt(i)>=48 && n.charAt(i)<=57) {
				countNum++;
				stringLeng++;
				continue;
			} else if((n.charAt(i)>=65 && n.charAt(i)<=90) || (n.charAt(i)>=97 && n.charAt(i)<=122)) {
				stringLeng++;
				continue;
			} else {System.out.println("Invalid Password: Must only contain letters and digits");
						break;}
		}//for
			if(countNum>=2 && stringLeng == n.length()) {
				System.out.println("Valid Password");
			} else if(countNum<2) {
					System.out.println("Invalid Password: Need at least 2 digits");
			}//if
			
		}//outer if
	}//checkPassword

	
	}//class
