/*
Program: Ex8.java          Last Date of this Revision: February 24th,2022

Purpose: An application that prompts the user for a guess of a random num between 1-20 and keeps prompting until it's right.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
import java.lang.Math;
public class Ex8 
{

	public static void main(String[] args) 
	{
		int number = (int) ((20)* Math.random() + 1); //random number between 1-20
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter a number between 1-20: "); //user input
		int guess = myObj.nextInt(); //records input
	
		while (number != guess) //while the guess is not equal to the random number, prompt again
		{
			System.out.println("Enter a number between 1-20: "); //user input
			guess = myObj.nextInt(); //records input
		}
	
		System.out.println("You won!"); //output message 
		myObj.close();
	}
} //end of class

/* Screen Dump 

Enter a number between 1-20: 
1
Enter a number between 1-20: 
7
Enter a number between 1-20: 
8
Enter a number between 1-20: 
9
You won! */