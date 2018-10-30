import java.util.Scanner;

public class Chapter05_45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers");
		double sumForMean = 0;
		
		double [] nums = new double [10];
		
		
		for(int i = 0; i < 10; i++) {
			nums[i] = input.nextDouble();
			sumForMean+=nums[i];
		}//for
		
		double mean = sumForMean/10;
		System.out.println("The mean is " + mean);
		double varianceSum = 0;
		
		for(int i = 0; i<10; i++) {
		double variance = Math.pow((nums[i] - mean),2)/(10-1);
		varianceSum += variance;
				}//for
		double sD = Math.pow(varianceSum, .5);
		System.out.println("The standard deviation is " + sD);
	}//main

}//class
