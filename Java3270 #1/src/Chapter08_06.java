import java.util.Scanner;

public class Chapter08_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double [][] a = new double [3][3];
		double [][] b = new double [3][3];
		
		System.out.println("Enter matrix 1:");
		for(int i = 0; i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				a[i][j] = input.nextDouble();
			}
		}//out
		System.out.println("Enter matrix 2:");
		for(int i =0;i<b.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				b[i][j] = input.nextDouble();
			}
		}//out
		
		
		double [][] c =	multiplyMatrix(a,b);
		
		
		//print after using method
		System.out.println("The multiplication of the matrices is");
		for(int i = 0;i<c.length;i++) {
			for(int j = 0; j<c[0].length;j++) {
				System.out.print(a[i][j] + " ");
				if(i == 1 && j == 2) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}//if
					
			}			//print array a
			
			for(int j =0; j< c[0].length;j++) {
				System.out.print(b[i][j] + " ");
				if(i == 1 && j == 2) {
					System.out.print(" = ");
				} else {
					System.out.print("   ");
				}//if
			}			//print array b
			
			for(int j = 0; j< c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			//print array c
			
			System.out.println();
		}//outer for
		
	}
	public static double[][] multiplyMatrix(double[][]a,double[][]b){
		if(a[0].length!=b.length) {
			System.out.println("a # of columns must equal b # of rows");
			return null;
		} else {
			double [][] c = new double[a.length][b[0].length];
			
			for(int i=0;i<c.length;i++) {
				for(int j = 0; j< c[0].length; j++) {
					c[i][j] = a[i][j]*b[i][j];
				}
			}//out
			return c;
		}//if
	}//multiply Matrix
	
	
	
}
