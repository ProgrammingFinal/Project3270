import java.util.Scanner;

public class Chapter08_04 {

	public static void main(String[] args) {

		int [][] weeklySchedule = new int[8][7];
		int [] hoursPerPerson = new int [8];
for(int i =0; i<8; i++) {		
	for(int j = 0; j<7; j++) {
		weeklySchedule[i][j]= (int) (9*Math.random()+1);
		hoursPerPerson[i]+=weeklySchedule[i][j];
	}//inner
}//outer	
	int record = hoursPerPerson[0];
for(int i = 0; i<hoursPerPerson.length; i++) {
	for(int j = 0; j<i;j++) {
		if(hoursPerPerson[j]<hoursPerPerson[i]) {
			record = hoursPerPerson[j];
			hoursPerPerson[j] = hoursPerPerson[i];
			hoursPerPerson[i] = record;
		}//if
	}//inner
}//outer
for(int i = 0; i<hoursPerPerson.length; i++) {
	System.out.println("Student " + i + " weekly hours is " + hoursPerPerson[i]);
}

	}//main

}//class
