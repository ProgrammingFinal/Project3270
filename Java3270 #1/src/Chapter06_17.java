import java.util.Scanner;

public class Chapter06_17 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter n:");
int n = input.nextInt();
printMatrix(n);
	}//main

	public static void printMatrix(int n) {
		int [][] array = new int [n][n];
		for(int i = 0;i<array.length;i++) {
			for(int j = 0; j<array.length; j++) {
				array[i][j] = (int) (Math.random()*2);
				System.out.print(array[i][j] + " ");
			}//inner
			System.out.println();
		}//outer
		
		
		
	}//printMatrix
	
	
}//class
