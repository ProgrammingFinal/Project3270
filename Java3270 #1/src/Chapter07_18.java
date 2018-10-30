import java.util.Scanner;

public class Chapter07_18 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Input 10 numbers");

double [] array = new double[10];

for(int i = 0; i < array.length; i++) {
	double num = input.nextDouble();
	array[i] = num;
}//for
		
Bubble(array);
		
	}//main

	public static void Bubble(double [] array) {
		
		double record = array[0];
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<i; j++) {
				if(array[j]>array[i]) {
					record = array[i];
					array[i] = array[j];
					array[j] = record;
				} else {continue;}
			}//inner
		}//outer
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}//Bubble small ----> large
	
}//class
