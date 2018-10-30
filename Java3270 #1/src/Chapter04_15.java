import java.util.Scanner;

public class Chapter04_15 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a letter:");
char letter = input.next().charAt(0);
int num = (int) letter;



if(num>64 && num<68 || num>96 && num<100) {
	System.out.println("The corresponding number is 2");
} else if(num>67 && num<71 || num>99 && num<103) {
	System.out.println("The corresponding number is 3");
} else if(num>70 && num<74 || num>102 && num<106) {
	System.out.println("The corresponding number is 4");
} else if(num>73 && num<77 || num>105 && num<109) {
	System.out.println("The corresponding number is 5");
} else if(num>76 && num<80 || num>108 && num<112) {
	System.out.println("The corresponding number is 6");
} else if(num>79 && num<84 || num>111 && num<116) {
	System.out.println("The corresponding number is 7");
} else if(num>83 && num<87 || num>115 && num<119) {
	System.out.println("The corresponding number is 8");
} else if(num>86 && num<91 || num>118 && num<123) {
	System.out.println("The corresponding number is 9");
} else {System.out.println(letter + " is an invalid input");

}//if


}
		
		
	}

