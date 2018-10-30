import java.util.Scanner;

public class Chapter08_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list 1: ");
		int [][] a = new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextInt();
			}
		}//outer
		System.out.println("Enter list 2: ");
		int [][] b = new int [3][3];
		for(int i = 0; i<b.length;i++) {
			for(int j = 0; j < b[0].length; j++) {
				b[i][j] = input.nextInt();
				
			}
		}//outer
		if(equals(a,b)) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}//if
		
	}//main
	
	public static boolean equals(int [][] a, int[][] b) {
		boolean isEqual = true;
		if(a.length != b.length || a[0].length != b[0].length) {
			isEqual = false;
			return isEqual;
		} else {
			for(int i =0; i<a.length; i++) {
				for(int j = 0; j<a[0].length;j++) {
					if(a[i][j]!=b[i][j]) {
						isEqual = false;
						return isEqual;
					
					} else { 
						isEqual = true;
					}//if
					
				}//inner
			}//outer
			return isEqual;
		}//if
	}
	
}//class
