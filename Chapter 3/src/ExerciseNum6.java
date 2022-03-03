//Donee
/*
Program: ExerciseNum6.java          Last Date of this Revision: February 11th,2022


Purpose: An application that prompts for a 3 digit number, then displays the ones, tens and hundreds place.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;
public class ExerciseNum6 {

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a three digit number: ");
		int number = myObj.nextInt();
		int ones;
		int tens;
		int hundreds;
		hundreds = number/ 100;
		tens = (number-(hundreds*100))/10;
		ones = number%10;
		
		System.out.println("Hundreds place: " + hundreds + "\nTens place: "+ tens + "\nOnes place: " + ones);
		myObj.close();
	}

}

/* Enter a three digit number: 
567
Hundreds place: 5
Tens place: 6
Ones place: 7 */
