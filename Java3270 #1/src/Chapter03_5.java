import java.util.Scanner;

public class Chapter03_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter today's day:");
int today = input.nextInt();
System.out.println("Enter the number of days elapsed since today:");
String [] week = new String [7];
week[0] = "Sunday";
week[1] = "Monday";
week[2] = "Tuesday";
week[3] = "Wednesday";
week[4] = "Thursday";
week[5] = "Friday";
week[6] = "Saturday";

today = today%7;
int elapsed = input.nextInt();
int totalDays = today+elapsed;
int dayOfWeek = totalDays%7;


System.out.println("Today is " + week[today] + " and the future day is " + week[dayOfWeek]);

	}

}
