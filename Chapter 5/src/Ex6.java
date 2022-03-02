/*
Program: Ex6.java          Last Date of this Revision: February 24th,2022

Purpose: An application that prompts the user for a non negative integer and then displays the sum

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class Ex6 
{

	public static void main(String[] args) 
	{
		int sum = 0; //sum starts at 0
		int digit = 0; //digit starts at 0
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter a non negative integer: "); //user input
		int number = myObj.nextInt(); //records input
		
		while (number>0) //while the number is above 0
		{
			digit = number %10; // gets the last digit of the number
			sum = sum +digit; // adds digit to sum 
			number = number/10; // makes new number the original number but without the last digit
					
		}
		
		System.out.println("Sum: " + sum); //output of sum
		myObj.close();
	}

} // end of class

/* Screen Dump 
Enter a non negative integer: 
34
Sum: 7 */