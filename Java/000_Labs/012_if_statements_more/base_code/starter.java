/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 2 numbers");

		int ans = sc.nextInt();
		int answer = sc.nextInt();


		boolean a = ans == answer;
		boolean b = ans != answer;

		if(a){
			System.out.println("It is equal");
		}

		if (b){
			System.out.println("It is not equal");

		}
	}
}					
	      
