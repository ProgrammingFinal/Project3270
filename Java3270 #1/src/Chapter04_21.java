import java.util.Scanner;


public class Chapter04_21 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a SSN:");
String ssn = input.next();

//ssn = ssn.substring(0, 3) + "-" + ssn.substring(3,5) + "-" + ssn.substring(5,9);
char dash1 = ssn.charAt(3);
char dash2 = ssn.charAt(6);

if(dash1 == '-' && dash2 == '-') {
	System.out.println(ssn + " is a valid social security number");
} else {System.out.println(ssn + " is an invalid social security number");

}
		
		
	}

}
