import java.util.Scanner;

public class Chapter07_33 {

	public static void main(String[] args) {

		
		 Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter a year: ");
		 int year = input.nextInt();
		
		 String [] names = {"monkey","rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
		 
		 switch (year % 12) {
		 case 0: System.out.println(names[0]); break;
		 case 1: System.out.println(names[1]); break;
		 case 2: System.out.println(names[2]); break;
		 case 3: System.out.println(names[3]); break;
		 case 4: System.out.println(names[4]); break;
		 case 5: System.out.println(names[5]); break;
		 case 6: System.out.println(names[6]); break;
		 case 7: System.out.println(names[7]); break;
		 case 8: System.out.println(names[8]); break;
		 case 9: System.out.println(names[9]); break;
		 case 10: System.out.println(names[10]); break;
		 case 11: System.out.println(names[11]); break;
		
		
		 }//switch
	}

}
