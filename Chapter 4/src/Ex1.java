//donee
/*
Program: Ex1.java          Last Date of this Revision: February 15th,2022

Purpose: An application that displays printing prices based off of the number of copies the user wants.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class Ex1 {
	
//sssssssssssssssssssssssssssssssssssssssssssss
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number of copies you need: "); //user input
		int number = myObj.nextInt(); //records input
		
		if (number >0 && number <= 99) //if number recorded is 0-99 then it costs 0.30 per copy
		{
		double price = 0.30;
		System.out.println("Price per copy is: $" + price + "\nTotal Cost is: $" + price*number); //output of total price
		}
		
		else if (number >=100 && number <= 499) //if number recorded is 100-499 then it costs 0.28 per copy
		{
		double price = 0.28;
		System.out.println("Price per copy is: $" + price + "\nTotal Cost is: $" + price*number);//output of total price
		}
		
		else if (number >=500 && number <= 749) //if number recorded is 500-749 then it costs 0.27 per copy
		{
		double price = 0.27;
		System.out.println("Price per copy is: $" + price + "\nTotal Cost is: $" + price*number);//output of total price
		}
		
		else if (number >=750 && number <= 1000) //if number recorded is 750-1000 then it costs 0.26 per copy
		{
		double price = 0.26;
		System.out.println("Price per copy is: $" + price + "\nTotal Cost is: $" + price*number);//output of total price
		}
		
		else if (number >1000)//if number recorded is over 1000 then it costs 0.25 per copy
		{
		double price = 0.25;
		System.out.println("Price per copy is: $" + price + "\nTotal Cost is: $" + price*number);//output of total price
		}
	myObj.close(); //closes scanner
	}

} //end of class

/* Screen dump 
Enter number of copies you need: 
676
Price per copy is: $0.27
Total Cost is: $182.52 */