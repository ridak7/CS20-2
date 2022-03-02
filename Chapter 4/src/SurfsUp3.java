/*
Program: SurfsUp3.java          Last Date of this Revision: February 14th,2022

Purpose: An application that displays "Great day for surfing" when a wave height is 6 feet or over. and "Go body boarding" when it's between 3-6. "Go surfing" when its 0-3. and "Whoah! what kind of surf is that?" otherwise.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class SurfsUp3 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter wave height in feet: "); //input from user 
		int number = myObj.nextInt();//recording input
		if (number >= 6) //checks to see if wave is greater or equal to 6
		{
			System.out.println("Great day for surfing!"); //output if greater or equal to 6
		}
		else if (number>3 && number<6) //checks to see if between 3-6
		{
			System.out.println("Go body boarding!"); //output if 3-6
		}
		
		else if (number>=0 && number<=3) //checks to see if 0-3
		{
			System.out.println("Go for a swim!"); //output if 0-3
		}
		
		else
		{
			System.out.println("Whoah! What kind of surf is that?"); //if negative, output
		}
		myObj.close();
	}
}//end of class 

/* Screen Dump 
 
 Enter wave height in feet: 
-89
Whoah! What kind of surf is that? */
