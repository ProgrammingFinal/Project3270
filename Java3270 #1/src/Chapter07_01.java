import java.util.Scanner;

public class Chapter07_01 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int stu = input.nextInt();
		System.out.println("Enter " + stu + " scores:");
		int [] scores = new int [stu];
		int best = scores[0];

for( int i = 0; i<scores.length; i++) {
	scores[i] = input.nextInt();
	if(scores[i]>best) {
		best = scores[i];
	}//if
}//for


for(int i = 0; i<scores.length;i++) {
	if(scores[i]>=best-10) {
		System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
	} else if(scores[i]>=best-20) {
		System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
	} else if(scores[i]>=best-30) {
		System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
	} else if(scores[i]>=best-40) {
		System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
	} else {		System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
	}
}//for
		
	}//main

}//class
