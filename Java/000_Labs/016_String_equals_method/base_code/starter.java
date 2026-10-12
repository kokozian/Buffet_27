/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose a class:");
		System.out.println("1. Wizard");
		System.out.println("2. Warrior");
		System.out.println("3. Rougue");
		String role = sc.nextLine();

		if(role.equals("Rougue") || (role.equals("rougue"))){

			System.out.println("You picked Rougue as your class");

		}
		else if(role.equals("Warrior") || (role.equals("warrior"))){

			System.out.println("You picked Warrior as your class");
			
		}
		else if(role.equals("Wizard")||(role.equals("wizard"))){

			System.out.println("You picked Wizard as your class");

		}
		
		else{

		System.out.println("that is not a class");

		}


		

		
		


	}
 
 }

