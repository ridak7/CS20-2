//done
/*
Program: RandomNum.java          Last Date of this Revision: February 15th,2022

Purpose: An application that prompts user for 2 numbers, one as a min and one as a max, and then an application that displays a random integer between those two.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;
import java.lang.Math;
public class RandomNum 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); //user input
		System.out.println("Enter a minimum number: ");
		int min = myObj.nextInt(); //records input as min
		System.out.println("Enter a maximum number: "); //user input
		int max = myObj.nextInt(); //records input as max
		
		int number = (int) ((max-min+1)* Math.random() + min); //displays random number between max and min
		
		System.out.println("Number: " + number); //output of that random number
		
		myObj.close();
	
	}
} //end of class 

/* Screen dump 

Enter a minimum number: 
2
Enter a maximum number: 
13
Number: 11 */