/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number:");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		

		if(a>b){
			if(a>c){

			System.out.println("Your " + a + " is greater than your other numbers.");

			}

		}
		if(b>a){
			if(b>c){
			System.out.println(b +  "is greater than your other numbers.");

			}

		}
		if(c>a){
			if(c>b){
			System.out.println(  c + " number is greater than your other numbers.");

			}

		}


		if(a<b){
			if(a<c){

			System.out.println(a + "  is less than your other numbers.");

			}

		}
		if(b<a){
			if(b<c){
			System.out.println( b + " is less than your other numbers.");

			}

		}
		if(c<a){
			if(c<b){
			System.out.println( c + "number is less than your other numbers.");

			}

		}









	}
}
