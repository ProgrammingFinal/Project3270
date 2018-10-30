import java.util.Scanner;

public class Chapter02_14 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter weight in pounds:");
double pounds = input.nextDouble();
System.out.println("Enter height in inches");
double inches = input.nextDouble();
double meters = inches*.0254;
double kilograms = pounds*.45359237;

double BMI = kilograms/(Math.pow(meters,2));

int BMI1 = (int)(BMI*10000);

BMI=(double)BMI1/10000;

System.out.println("BMI is " + BMI);
		

	}	

}
