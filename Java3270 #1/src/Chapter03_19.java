import java.util.Scanner;

public class Chapter03_19 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter 3 sides of a triangle");

double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();

double ab = a+b;
double ac = a+c;
double bc = b+c;

double perimeter = a+b+c;

if((ab<=c)||(ac<=b)||(bc<=a)) {
	System.out.println("The triangle is not valid");
} else if((a+b>c) || (a+c>b) ||	(b+c>a)){
		System.out.println("The triangle is valid. The perimeter is " + perimeter);

}	//if
		

	}//main

}//class
