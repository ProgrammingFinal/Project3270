import java.util.*;

public class Chapter05_41 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter numbers:");
	int max = 0;
	int count = 0;
	
	for(int i = 0; i>-1;i++) {
		int num = input.nextInt();
		if(num == 0) {
			break;
		} else {
			if(num>max) {
				max = num;
				count = 1;
			}else if(num == max) {
				count++;
			}//inner if
		}//if
		
	}//for
		System.out.println("The largest number is "+ max);
		System.out.println("The occurence count of the largest number is " + count);
		
	}

}
