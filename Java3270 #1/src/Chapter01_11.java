import java.util.Scanner;

public class Chapter01_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int population = 312032486;
int secondsPerYear = 31536000;

int plus1 = 7;
int minus1 = 13;
int add1 = 45;



		for(int i = 0;i<5;i++) {
	int newBorn = 0;
	int newDeath = 0;
	int newImmigrant = 0;
	newBorn = secondsPerYear/plus1;
	newDeath = secondsPerYear/minus1;
	newImmigrant = secondsPerYear/add1;
	
	int addOrSubtract = (newBorn-newDeath)+newImmigrant;
	population += addOrSubtract;
	System.out.println("The population after Year " + (i+1) + " is " + population);
	
}//for loop

	}//main

}//class

