/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);

        int r2 = (int)(Math.random()*129);
        int g2 = (int)(Math.random()*129);
        int b2 = (int)(Math.random()*129);

        int r3 = (int)(128+Math.random()*129);
        int g3 = (int)(128+Math.random()*129);
        int b3 = (int)(128+Math.random()*129);

        int r4 = (int)(Math.random()*129);
        int g4 = (int)(Math.random()*129);
        int b4 = (int)(128+Math.random()*129);

        int r5 = (int)(256+Math.random()*512);
        int g5 = (int)(256+Math.random()*512);
        int b5 = (int)(256+Math.random()*512);



        System.out.println("Primary");

        getColor(r,g,b);
        System.out.println("Complementary");
        getColor(255-r,255-g,255-b);
        System.out.println("Triadic");
        getColor(r,g,b);
        getColor(b,r,g);
        getColor(g,b,r);
        System.out.println("Dark");
        getColor(r2,g2,b2);
        System.out.println("Light");
        getColor(r3,g3,b3);
        System.out.println("Bluer color");
        getColor(r4,g4,b4);
        System.out.println("IDK Num");
        getColor(r5,b5,b5);


        

		
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
