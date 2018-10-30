import java.util.Scanner;

public class Chapter02_5 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and gratuity rate");
		double subTotal = input.nextDouble();
		int tip = input.nextInt();
		double tipRate = (double)tip/100;
		double total = (subTotal*tipRate)+subTotal;
		
		System.out.println("The gratuity is $" + (subTotal*tipRate) + " and total is $" + total);
		
		
	}
}