
public class Chapter05_18D {
	public static void main(String[] args) {
		
		for(int i = 1; i<=6; i++) {
			//print 2 spaces per line based on lineNum j < i
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}// (1/2)
			
			//print from 
			for(int j = 1; j<=(7-i); j++) {
				System.out.print(j + " ");
			}// (2/2)
			
			System.out.println();
		}//outer
		
		
		
		
	}//main

}
