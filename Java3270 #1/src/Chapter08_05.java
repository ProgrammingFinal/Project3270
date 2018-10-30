import java.util.Scanner;

public class Chapter08_05 {

	public static void main (String[] args ) {
		Scanner input = new Scanner(System.in);
		
		double [][] a = new double [3][3];
		double [][] b = new double [3][3];
		System.out.println("Enter martrix 1:");
		for(int i = 0; i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				a[i][j]=input.nextDouble();
			}//inner
		}//outer
		System.out.println("Enter matrix 2:");
		for(int i=0;i<b.length;i++) {
			for(int j = 0; j<b[0].length;j++) {
				b[i][j] = input.nextDouble();
			}//in
		}//out
		
		double [][] c;
		c = addMatrix(a,b);
		
		
		System.out.println("The matrices are added as follows");
		  for (int i = 0; i < c.length; i++) {
		   
			  for (int j = 0; j < c[0].length; j++) {
		 
		    System.out.print(a[i][j] + " ");
		    if (i == 1 && j == 2) {
		     System.out.print(" + ");
		    } else {
		     System.out.print("   ");
		    }//if
	}//1st inner
			  
		   for (int j = 0; j < c[0].length; j++) {
		    System.out.print(b[i][j] + " ");
		    if (i == 1 && j == 2) {
		     System.out.print(" = ");
		    } else {
		     System.out.print("   ");
		    }//if
	 }//2nd inner
		   for (int j = 0; j < c[0].length; j++) {
		    System.out.print(c[i][j] + " ");
		   }//3rd inner
		   
		   System.out.println();
		  }//outer for
		
		
	}//main
	
	
	public static double [][] addMatrix(double [][] a, double[][] b){
		// Check metrix dimension
		  if (a[0].length != b[0].length || a.length != b.length) {
			  
		  System.out.println("Matrix dimensions must be equal:");
			  return null;
		  } else {
		 
		  double[][] c = new double[b.length][a[0].length];
		 
		  for (int i = 0; i < c.length; i++) {
		   for (int j = 0; j < c[0].length; j++) {
		    c[i][j] = a[i][j] + b[i][j];
		   }//inner
		 
		  }//outer
		 
		  return c;
		  }//if
		 }//addMatrix
		 
		}//class
	

