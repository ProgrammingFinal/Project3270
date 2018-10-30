
public class Chapter05_24 {

	public static void main(String[] args) {
		
int a = 2;
double x = 1;
double y = 3;
double sum = 0;
		for(int i = 0; i < 49; i++) {
			sum += (x/y);
			x+= a;
			y+= a;
			
		}//for
		System.out.println("The sum is " + sum);
	}

}
