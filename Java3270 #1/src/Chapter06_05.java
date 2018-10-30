import java.util.Scanner;

public class Chapter06_05 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter 3 numbers");
double one = input.nextDouble();
double two = input.nextDouble();
double three = input.nextDouble();
displaySortedNumbers(one,two,three);
	}//main
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double [] array = new double [3];
		double lastNum = Math.max(num1, Math.max(num2, num3));
		array[2] = lastNum;
		double firstNum = Math.min(num1, Math.min(num2, num3));
		array[0] = firstNum;
				double sum = num1+num2+num3;
				sum = sum -(lastNum+firstNum);
				array[1] = sum;
				for(int i = 0; i< array.length;i++) {
					System.out.println(array[i]);
				}
		
	}//displaySortedNumbers

}
