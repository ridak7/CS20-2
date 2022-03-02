
/*
Program: ExerciseNum5.java          Last Date of this Revision: February 11th,2022


Purpose: An application that prompts the user for an amount less than $1.00 and then displays the minimum quarters, dimes, nickels, and pennies.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;
public class ExerciseNum5 {

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter change in cents: ");
		int number = myObj.nextInt();
		int quarters = number/25;
		int newnum = quarters*25;
		int dimes= (number- newnum)/10;
		int newernum = newnum + dimes*10;
		int nickels = (number - newernum)/5;
		int newestnum = (newernum + nickels*5);
		int pennies = (number - newestnum);
		
		System.out.println("Quarters: " + quarters +"\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: "+ pennies);	
		myObj.close();
	}

}

/* Screen Dump 

Enter change in cents: 
67
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 2 */