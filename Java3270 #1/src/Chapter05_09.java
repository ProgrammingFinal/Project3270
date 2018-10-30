import java.util.Scanner;

public class Chapter05_09 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("How many students?");
	int numStudents = input.nextInt();
	
	String [] students = new String[numStudents];
	int [] scores = new int[numStudents];

	double max = 0;
	double secondMax = 0;
	String maxName = "";
	String secondName = "";

	
	for(int i = 0; i< students.length;i++) {
		System.out.println("Enter the name of student " + (i+1));
		students[i] = input.next();
		System.out.println("Enter the score for " + students[i]);
		scores[i] = input.nextInt();
		
		if(scores[i]>max) {//	new score is greater than old max
			maxName = students[i];//	change name to new max student
			secondMax = max;//	change 2nd highest score to old max
			max = scores[i];//	set max to new highest score
			
		} else if(scores[i]<max && scores[i]>secondMax) {//	new score is less than max but higher than 2nd highest
			secondMax = scores[i];//	change 2nd max to new 2nd max
			secondName = students[i];//	 name of 2nd highest score is recorded
		}//if
		
		
	}//for
		System.out.println(maxName + " has the highest score of " + max + " and the next highest score is " + secondMax + " by " + secondName);
	}

}
