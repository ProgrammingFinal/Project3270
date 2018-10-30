import java.util.Scanner;
public class Chapter07_07 {

	public static void main(String[] args) {

		
		int [] array = new int [10];
		
		for(int i = 0; i<100;i++) {
			int rand = (int)(10*Math.random());
			switch(rand) {
			
			case 0:
				array[0]++;
				break;
			case 1:
				array[1]++;
				break;
			case 2:
				array[2]++;
				break;
			case 3: 
				array[3]++;
				break;
			case 4:
				array[4]++;
				break;
			case 5: 
				array[5]++;
				break;
			case 6:
				array[6]++;
				break;
			case 7: 
				array[7]++;
				break;
			case 8:
				array[8]++;
				break;
			case 9:
				array[9]++;
				break;
			}//switch
		}//for
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(i + " counted " + array[i] + " times");
		}
		
	}//main

}//class
