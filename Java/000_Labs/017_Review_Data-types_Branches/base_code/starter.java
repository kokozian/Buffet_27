/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
Scanner sc = new Scanner(System.in);

System.out.println("What will your character's name be?");
String name = sc.nextLine();
System.out.println("What will your tile be");
String tile = sc.nextLine();

	
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

		System.out.println("that is not a class please rerun the porgram");
		}

		

		
		System.out.println("Here are 4 diffrent traits you can put a maxium of 10 skill points into you have 20 to start.");
		System.out.println("1. Strength");
		System.out.println("2. Dexterity");
		System.out.println("3. Intelligence");
		System.out.println("4. Charisma");

		 int Points = 20;
         System.out.println("Please input:");
		System.out.println("Stregth (1-10)");
		int Stregth = sc.nextInt();
		if(!(Stregth<11 && Points-Stregth>-1)){

			System.out.println("Your value is too much");
			System.out.println("Please pick again");

			System.out.println("Please input:");
		System.out.println("Stregth (1-10)");
		Stregth = sc.nextInt();
		
		}
		Points = Points-Stregth;

		System.out.println("You have " + Points + " points left");


		 
		
		 System.out.println("Dexterity (1-10)");
		  int Dex = sc.nextInt();
		
		
		if(!(Dex<11 && Points-Dex>-1)){

			System.out.println("Your value is too much");
			System.out.println("Please pick again");

			System.out.println("Please input:");
		System.out.println("Dexterity (1-10)");
		Dex = sc.nextInt();
		
		
		
		}
		Points = Points-Dex;
		System.out.println("You have " + Points + " points left");
	    
		
		System.out.println("Intelligence (1-10)");
		 int Intelligence = sc.nextInt();
		
		
		if(!(Intelligence<11 && Points-Intelligence>-1)){

			System.out.println("Your value is too much");
			System.out.println("Please pick again");

			System.out.println("Please input:");
		System.out.println("Intelligence (1-10)");
		Intelligence = sc.nextInt();
		
		
		}
		Points = Points-Intelligence;

		System.out.println("You have " + Points + " points left");

		System.out.println("Charisma (1-10)");

		 int Charisma = sc.nextInt();
		
		
		if(!(Charisma<11 && Points-Charisma>-1)){

			System.out.println("Your value is too much");
			System.out.println("Please pick again");

			System.out.println("Please input:");
		System.out.println("Charisma (1-10)");
		Charisma = sc.nextInt();
		
		
		
		}

		Points = Points-Charisma;


		System.out.println("You have " + Points + " points left");

		System.out.println("Your name is " + name);
		System.out.println("Your title is " + tile);
		System.out.println("Your stats are:");
		System.out.println("Strength " + Stregth);
		System.out.println("Dexterity " + Dex);
		System.out.println("Intelligence " + Intelligence);
		System.out.println("Charisma " + Charisma);
		


		


		

		

		


	}

 }






