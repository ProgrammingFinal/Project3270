import java.util.Scanner;
	
public class Chapter08_01 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double [][] array = new double [3][4];
double [] sum = new double [4];
System.out.println("Enter 12 numbers");
for(int i =0; i<3; i++) { 
		for(int j=0; j<4; j++) {
			
			array[i][j] = input.nextDouble();
			sum[j] += array[i][j];
		}//inner
}//outer
		System.out.println("Sum of elements at column 0 is " + sum[0]);
		System.out.println("Sum of elements at column 1 is " + sum[1]);
		System.out.println("Sum of elements at column 2 is " + sum[2]);
		System.out.println("Sum of elements at column 3 is " + sum[3]);
	}

}
