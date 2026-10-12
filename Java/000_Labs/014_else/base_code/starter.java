/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int Random = (int) (Math.random()*1001);
System.out.println("Please guess any number form 1 to 1000");

int a = sc.nextInt();

if (a == Random){

	System.out.println("You guessed the number. Good job");

}

else{

	System.out.println("You did not guess the number");
	System.out.println("The number is " + Random);
	
}

		




	}
}
