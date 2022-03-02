/*
Program: NumbersSum.java          Last Date of this Revision: February 22nd,2022

Purpose: An application that prompts the user for a number and then displays the odd numbers 1 through it, then displays the sum of the odd numbers

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter a number greater than 0: "); //user input
		int number = myObj.nextInt(); //records input
	
		int sum = 0; //starts sum at 0
		
		for (int i = 1; i<=number; i++) //keeping adding 1 to 1 until it becomes number
		{ 
			if (i%2 ==1) //checks to see if it's odd
			{
				System.out.println(i); // output
				sum = sum + i; // adds i to sum until i reaches number put in 
			}
		}
		System.out.println("sum: " + sum); //displays sum 
		myObj.close(); //close scanner
	}
}


/* Screen Dump 
Enter a number greater than 0: 12
1
3
5
7
9
11
sum: 36 */