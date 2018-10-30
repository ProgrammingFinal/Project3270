import java.util.Scanner;

public class Chapter05_21 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

		System.out.println("Loan Amount:");
		double pv = input.nextDouble();
		System.out.println("Number of Years:");
		int years = input.nextInt();
		String [] titles = new String [3];
		double [][] output = new double [25][3];
		double unusableRate = 5;
		
		double realMonthlyRate = (unusableRate / (100))/12;
		
		double monthlyPayment = pv * realMonthlyRate / (1-1/Math.pow(1+realMonthlyRate, years*12));
		
		double totalPayment = monthlyPayment * years * 12;
		titles[0] = "Interest Rate";
		titles[1] = "Monthly Payment";
		titles[2] = "Total Payment";
		
	
		for(int i = 0; i < output.length; i++) {
			for( int j = 0; j<3;j++) {
				if(j == 0) {
					output[i][j] = (unusableRate);
				} else if( j == 1) {
					output[i][j] = pv * ((output[i][j-1]/100)/12) / (1-1/Math.pow(1+((output[i][j-1]/100)/12), years*12));
				} else if( j == 2) {
					output[i][j] = (int) Math.round(((output[i][j-1]*years*12)*100)); 
					output[i][j] /= (double) 100;
			}
				
			}//inner
				unusableRate+=.125;
	}//outer

		for(int i = 0; i<titles.length; i++) {
			System.out.print(titles[i]);
			System.out.print("\t");	
			System.out.print("\t");	
			
		}
		System.out.println();
		//nested for loop to post MD array
		for(int i = 0; i<output.length;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(output[i][j]);
				System.out.print("\t");
				System.out.print("\t");
			}//inner
			System.out.println();
		}//outer
		
}
	}
