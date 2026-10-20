/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Please pick a number 0-1000");
		int random = (int)(Math.random()*1001);
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();

		while(random != start){

			if(random == start){
				System.out.println("you guessed it");
				break;
			}

			boolean c = start < random;
			boolean d = start > random;
			if(c){
				System.out.println("your number is less than the rng number");
			}
			if(d){
				System.out.println("your number is greater than the rng number");
			}
			
			start = sc.nextInt();
			 
		}
		





		
	}
}
