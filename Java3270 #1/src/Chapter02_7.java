import java.util.Scanner;
public class Chapter02_7 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of minutes:");
int minutes = input.nextInt();
int daysTotal = minutes/1440;
int years = daysTotal/365;
int daysLeft = daysTotal%365;
System.out.println(minutes + " minutes is approximately " + years + " years and " + daysLeft + " days");


		

	}

}
