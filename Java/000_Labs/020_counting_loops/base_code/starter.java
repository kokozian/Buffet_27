/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = sc.nextLine();
		System.out.println("Please enter an interger of how many time we will print out your name:");
		int num = sc.nextInt();
		int x = 1;
		while(true){
			System.out.println(name);
			if (x == num){
				break;
			}
			System.out.println(x);
			x=x+1;
			

		}	



	



		
	}
}
