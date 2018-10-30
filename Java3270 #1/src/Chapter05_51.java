import java.util.Scanner;

public class Chapter05_51 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter the first string:");

String one = input.nextLine();
System.out.println("Enter the second string:");

String two = input.nextLine();



int oneLength = one.length();
int twoLength = two.length();

int min = Math.min(oneLength, twoLength);

String capture = "";

for(int i = 0; i<min; i++) {
	if(one.charAt(0) != two.charAt(0)) {
		System.out.println(one + " and " + two + " have no common prefix");
		break;
	} else if(one.charAt(i)==two.charAt(i)) {
		capture += one.charAt(i); 
	} 
}//for
if(capture.length() > 0) {
	System.out.println("The common prefix is " + capture);	
	
}
		
		
	}

}
