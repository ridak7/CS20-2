//Done
/*
Program: ReviewDigits.java          Last Date of this Revision: February 9th,2022


Purpose: An application that prompts for a 2 digit number, then displays the ones and tens place.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;
public class ReviewDigits 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a two digit number: ");
		int number = myObj.nextInt();
		int ones;
		int tens;
		ones = number%10;
		tens = number/10;
		
		System.out.println("Tens place: "+ tens + "\nOnes place: " + ones);
		myObj.close();
	}
}

/* Screen Dump
 
 Enter a two digit number: 
67
Tens place: 6
Ones place: 7 */
