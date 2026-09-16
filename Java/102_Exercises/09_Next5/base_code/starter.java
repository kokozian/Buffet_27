/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.println("Please enter a number:");
int add = sc.nextInt();
System.out.print("Here are the next 5 numbers: ");
System.out.print(add + 1+",");
System.out.print(add+ 2+",");
System.out.print(add + 3+",");
System.out.print(add + 4+",");
System.out.println(add + 5);
System.out.println("Here are the multiples:");
System.out.print(add*1+",");
System.out.print(add*2+",");
System.out.print(add*3+",");
System.out.print(add*4+",");
System.out.println(add*5+",");
System.out.println("Here is " + add + " divided by 100");
System.out.println(add/100.0);
System.out.println("Here is " + add + " divided by 10");
System.out.println(add/10.0);


	}
}
