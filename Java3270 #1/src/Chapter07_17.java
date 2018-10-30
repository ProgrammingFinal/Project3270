import java.util.Scanner;

public class Chapter07_17 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("How many students?");
int numStu = input.nextInt();

String [] students = new String[numStu];
double [] scores = new double[numStu];
double min = scores[0];
String recordLowerName = "";
for(int i = 0; i<numStu;i++) {
	System.out.println("Enter student " + (i+1) + "'s name");
	String name = input.next();
	System.out.println("Enter student " + (i+1)  + "'s score");
	double score = input.nextDouble();
students[i] = name;
scores[i] = score;
	for(int j = 0; j<i; j++) {
		if(scores[j]<scores[i]) {
			min = scores[j];//min is lower number
			scores[j] = scores[i];
			scores[i] = min;
			recordLowerName = students[j];
			students[j] = students[i];
			students[i] = recordLowerName;
		} else {continue;}
	}//inner
}//outer

for(int i = 0;i<numStu;i++) {
	System.out.println(students[i] + " got a score of " + scores[i]);
}
		
	}//main

}//class
