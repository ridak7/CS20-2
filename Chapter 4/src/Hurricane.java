//Done
/*
Program: SurfsUp1.java          Last Date of this Revision: February 14th,2022

Purpose: An application that provides a rating depending on the current intensity of a hurricane with the Saffir-Simpson Hurricane Scale

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class Hurricane 
{

	public static void main(String[] args) 
		{
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter hurricane category (1-5): "); //user input
			int number = myObj.nextInt(); //recording input
			
			switch (number) //starts a switch statement
			{
			
				case 1: System.out.println("Category 1: 74-95 mph or 64-82kt or 119-153km/hr");break; //output if 1
				case 2: System.out.println("Category 2: 96-110mph or 83-95 kt or 154-177 km/hr");break; //output if 2
				case 3: System.out.println("Category 3: 111-130 mph or 96-113kt or 178-209km/hr");break; //output if 3
				case 4: System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249km/hr");break; //output if 4
				case 5: System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr");break; //output if 5
			}
			myObj.close();
		}
} //end of class

/* Screen Dump
Enter hurricane category (1-5): 
4
Category 4: 131-155 mph or 114-135 kt or 210-249km/hr*/