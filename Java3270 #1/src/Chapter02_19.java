import java.util.Scanner;

public class Chapter02_19 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the points of a triangle:");
double x1 = input.nextDouble();
double y1 = input.nextDouble();
double x2 = input.nextDouble();
double y2 = input.nextDouble();
double x3 = input.nextDouble();
double y3 = input.nextDouble();

double side1 = x1*(y3-y2);
double side2 = x2*(y1-y3);
double side3 = x3*(y2-y1);

double area = (side1+side2+side3)/2;

int area1 = (int)(area*100);
area = (double)area1/100;
System.out.printf("The area of the triangle is %.1f%n",  Math.abs(area)); //rounds area to one decimal


	}

}
