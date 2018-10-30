import java.util.Scanner;
public class Chapter03_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x-,y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		w1 = w1/2;
		h1 = h1/2;
		
		System.out.println("Enter r2's center x-,y-coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		w2= w2/2;
		h2= h2/2;
		
		double xMax = x1 + w1;
		double xMin = x1 - w1;
		double yMax = y1 + h1;
		double yMin = y1 - h1;
		
		double x2Max = x2 + w2;
		double x2Min = x2 - w2;
		double y2Max = y2 + h2;
		double y2Min = y2 - h2;
		
		if(xMax == x2Max && xMin == x2Min && yMax == y2Max && yMin == y2Min) {
			System.out.println("r1 and r2 are identical");
		} 
		//r1 is in r2
		else if (xMax <= x2Max && xMin >= x2Min && yMax <= y2Max && yMin >= y2Min) {
			System.out.println("r1 is in r2");
		}
		//r2 is in r1
		else if(x2Max <= xMax && x2Min >= xMin && y2Max <= yMax && y2Min >= yMin) {
			System.out.println("r2 is inside r1");
		}
		//do not overlap
		else if(xMax < x2Min || xMin > x2Max || yMax < y2Min || yMin > y2Max) {
			System.out.println("r1 and r2 do not overlap");
		} else {
			System.out.println(" r1 and r2 overlap");
		}//if
		
		
		

	}

}
