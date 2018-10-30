import java.util.Scanner;

public class Chapter08_21 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of cities: ");
	
	int numOfCity = input.nextInt();
	
	double [][] locations = new double[numOfCity][2];
	System.out.println("Enter " + (2*numOfCity) + " coordinates");
	for(int i = 0; i<locations.length; i++) {
		
			locations[i][0] = input.nextDouble();
			locations[i][1] = input.nextDouble();

		}//inner
	
	double [] sumPerCity = sumDistance(calcDistance(locations));
	int cityRow = minDis(sumPerCity);
	
	
	System.out.println("The central city is at (" + locations[cityRow][0] + ", " + locations[cityRow][1] + ")" );
	System.out.println("The total distance to all other cities is " + sumPerCity[cityRow]);
	
		
	

	
	
}//main

public static double[][] calcDistance(double[][]a) {
	double [][] sqa = new double[a.length][a.length];
	
	for(int i=0;i<sqa.length;i++) {
		for(int j = 0; j<sqa.length;j++) {
		double x1 = a[i][0];
		double y1 = a[i][1];
		double x2 = a[j][0];
		double y2 = a[j][1];
		
		sqa[i][j] = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		}

	}//outer
	return sqa;
}//calcDistance

public static double [] sumDistance(double[][]a) {
	
	double [] array = new double[a.length];
	for(int i = 0; i<array.length; i++) {
		for(int j = 0; j< array.length; j++) {
			array[i] += a[i][j];//each row of inputed array is summed
			
		}
	}//outer
	return array;
}//sumDistance

public static int minDis(double[]a) {
	int cityIndex = 0;
	double min = a[0];
	for(int i = 0; i < a.length; i++) {
		if(a[i]<min) {
			min = a[i];
			cityIndex = i;
		}//if
	}//for
	return cityIndex;
}//minDis

}//class
