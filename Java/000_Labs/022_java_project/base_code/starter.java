/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amout of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("  a. If two numbers match, youdouble your money.");
		System.out.println("  b. If three numbers match your triple your money.");
		System.out.println("  c. If none match, you lose your money");
		System.out.println("--------------------------------------------------");

		
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		String yes = sc.nextLine();
		if((yes.equals("Yes")) || (yes.equals("yes")) || (yes.equals("Y")) || (yes.equals("y"))){
			
			System.out.println("You have $100. How much would you like to wager");
			int amount = sc.nextInt();
			int t = money-amount;
			if(t>=amount){
				System.out.println("You went over the amount you have please choose again");
			}

			int slot1 = (int)(1 + Math.random()*10);
			int slot2 = (int)(1 + Math.random()*10);
			int slot3 = (int)(1 + Math.random()*10);

			System.out.print("|" + slot1 + "|");
			System.out.print("|" + slot2 + "|");
			System.out.print("|" + slot3 + "|");
			
			if(slot1 != slot2 && slot1!=slot3 && slot2!=slot3){

			
			if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3){

				money = t*2;
			}

			if((slot1 == slot2)&&(slot1 == slot3)){
				money = t*3;
			}

			if(t<=0 || ((!yes.equals("Yes")) && (yes.equals("yes")) && (yes.equals("Y")) && (yes.equals("y"))) ){

				System.out.println("you ran out of money");
				break;}


		}
			} 

		}


	

		






	}
}
