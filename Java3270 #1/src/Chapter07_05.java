import java.util.Scanner;
 
public class Chapter07_05 {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int[] numbers = new int[10];
  int number; 
  int i = 0;
  int j;
  int k = 0;
  System.out.print("Enter ten numbers:");
 
 for(int a = 0; a<10;a++){
   number = input.nextInt();
   k++;
 
   for (j = 0; j <= i; j++) {
    if (number == numbers[j]) {
     break;
    }
   }
 
   if (j - i == 1) {
    numbers[i] = number;
    i++;
   }
 
  }
 
  System.out.println("The number of distinct number is " + i);
  System.out.print("The distinct numbers are:");
 
  for (int l = 0; l < i; l++) {
   System.out.print(numbers[l] + " ");
  
  }//for
}
}