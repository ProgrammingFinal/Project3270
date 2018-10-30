import java.util.Scanner;

public class Chapter05_1 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer, the input ends if it is 0:");
double sum=0;
int countNeg=0;
int countPos=0;
for(int i = 1; i>0; i++) {
	int num = input.nextInt();
	if(num == 0 && i>1) {
		break;
	} else if(num>0) {
		sum+=num;
		countPos++;
	} else if(num<0) {
		sum+=num;
		countNeg++;
	} else if(num == 0 && i==1) {
		System.out.println("No numbers are entered except 0");
		break;
	}//if
	
}//for loop
if(sum>0) {
System.out.println("The number of positives is " + countPos);
System.out.println("The number of negatives is " + countNeg);
System.out.println("The total is " + sum);
System.out.println("The average is " + sum/(countPos+countNeg));
}
	}//main

}//class
