import java.util.Scanner;

public class Chapter05_07 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double tuition = 10000;
double rate = 1.05;
double total = 0;

for(int i = 1; i<15;i++) {
		tuition *= rate;
	System.out.println("Year " + i + " the tuition is " + tuition);
	if(i>10) {
	total+=tuition;	
	}//if
}//for
System.out.println("The total tuition for the 4 years after year 10 is " + total);

				
	}

}
