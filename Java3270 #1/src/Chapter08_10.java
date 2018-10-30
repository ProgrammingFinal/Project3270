import java.util.Scanner;

public class Chapter08_10 {

	public static void main(String[] args) {
		int [][] array = new int [4][4];
		
		for( int i = 0;i<array.length;i++) {
			for(int j = 0; j< array[0].length;j++) {
				array[i][j] = (int) (2*Math.random());
				System.out.print(array[i][j]);
			}
			System.out.println();
		}//outer
		
		int row = 0;
		int column = 0;
		int count = 0;
		int max = 0;
		
		for(int i = 0;i< array.length;i++) {
			for(int j = 0;j<array[0].length;j++) {
				if(array[i][j] == 1) {
					count++;	
				}
			}//inner
			if(count>max) {
				max=count;
				row = i;
			}
			count = 0;
		}//outer
		System.out.println("The largest row index: " + row);
		count = 0;
		max = 0;
		for(int i=0;i<array[0].length;i++) {
			for(int j = 0; j<array.length; j++) {
				if(array[j][i] == 1) {
					count++;
				}
			}//inner
				if(count>max) {
					max = count;
					column = i;
				}
				count = 0;
			
		}//outer
		System.out.println("The largest column index: " + column );
	}//main
}
 