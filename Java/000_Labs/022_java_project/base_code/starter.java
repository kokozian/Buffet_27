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
			
			
			while(money > 0) {
				System.out.println("You have $" + money + ". How much would you like to wager");
				int amount = sc.nextInt();
				
				
				if(amount > money || amount <= 0){
					System.out.println("You went over the amount you have please choose again");
					continue;
				}

				int t = money - amount;

				int slot1 = (int)(1 + Math.random()*10);
				int slot2 = (int)(1 + Math.random()*10);
				int slot3 = (int)(1 + Math.random()*10);

				System.out.print("|" + slot1 + "|");
				System.out.print("|" + slot2 + "|");
				System.out.println("|" + slot3 + "|");
				
				
				if((slot1 == slot2) && (slot1 == slot3)){
					money = t + (amount * 3);
					System.out.println("you trippled");
				}
				
				else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3){
					money = t + (amount * 2);
					System.out.println("you doubled");
				}
				
				else {
					money = t;
					System.out.println("you lose");
				}

				if(money <= 0){
					System.out.println("you ran out of money");
					break;
				}

				
				System.out.println("Would you like to play again? (Yes/yes/Y/y)");
				sc.nextLine(); 
				yes = sc.nextLine();
				
				if(!((yes.equals("Yes")) || (yes.equals("yes")) || (yes.equals("Y")) || (yes.equals("y")))){
					break;
				}
			}
		}

		System.out.println("Thank you for playing. final balance: $" + money);
	}
}
