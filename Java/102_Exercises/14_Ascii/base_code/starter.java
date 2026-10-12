/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	


	System.out.println("Welcome to my ASCII exibit.");
	System.out.println("Please chose one of the following exibits");
	System.out.println("1. Food");
	System.out.println("2. Space");
	System.out.println("3. Weapon");

	String exhibit = sc.nextLine();

	if(exhibit.equals("Food")){

		System.out.println("Please choose:");
		System.out.println("banana");
		System.out.println("apple");
		
		String pick = sc.nextLine();
		if(pick.equals("apple")){



		System.out.println("  ,--./,-.");
		System.out.println(" / #      \\");
		System.out.println("|          |");
		System.out.println(" \\        / ");
		System.out.println("  `._,._,'");
		}
		if(pick.equals("banana")){

		System.out.println("         _   ");
		System.out.println("       _ \\'-_,#");
		System.out.println("      _\\'--','`|");
		System.out.println("      \\`---`  /");
		System.out.println("      `----'`");
		}


	}

	else if(exhibit.equals("Space")){

		System.out.println("Please choose:");
		System.out.println("moon");
		System.out.println("alien");
		
		String choose = sc.nextLine();
		if(choose.equals("moon")){

			System.out.println(" ,-,");
			System.out.println("/.(");
			System.out.println("\\ {");
			System.out.println(" `-`");

			
		}
			if(choose.equals("alien")){

				System.out.println( "_________");
				System.out.println("/___   ___\\");
				System.out.println("//@@@\\ /@@@\\");
				System.out.println(" \\@@@/ \\@@@//");
				System.out.println("\\___ ' ___/");
				System.out.println("   | - |");
				System.out.println("    \\_/");
			}
		

			



	}

	else if(exhibit.equals("Weapon"))

        System.out.println("Please choose:");
		System.out.println("gun");
		System.out.println("katana");
		
		String ok = sc.nextLine();
		if(ok.equals("gun")){

		System.out.println("  __,_____");
		System.out.println(" / __.==--'");
		System.out.println( "/#(-'");
		System.out.println(" `-'");

		}



		if (ok.equals("katana")){

			System.out.println(",_._._._._._._._._|__________________________________________________________,");
			System.out.println(",_._._._._._._._._|__________________________________________________________,");
			System.out.println("                  !");
			
		}	
	

	else{

		System.out.println("The Exibit is closed for right now come back later");

	}


	



		
	}
}
