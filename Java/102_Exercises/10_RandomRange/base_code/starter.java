/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 numbers to crate a range for your random number.");
		System.out.print("Please enter your first number:");
		int a = sc.nextInt();
		System.out.print("Please enter a number bigger than the last one:");
		int b = sc.nextInt();

		System.out.println("Your range is " + a + " to " + b);

		int c = (int)(a+Math.random()*b-a);
		int d = (int)(a+Math.random()*b);
		int e = (int)(a+Math.random()*b);
		int f = (int)(a+Math.random()*b);
		int g = (int)(a+Math.random()*b);

		System.out.println("Here are your numbers:");
		System.out.println(c +"," + d+ "," + e +","+ f + "," +g);


	}
}
