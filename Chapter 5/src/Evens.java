//done
/*
Program: Evens.java          Last Date of this Revision: February 22nd,2022

Purpose: An application that displays the even numbers between 1 and 20 inclusive

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
public class Evens 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i<=20; i++) //keeping adding 1 to 1 until it becomes 20
		{ 
			if (i%2 ==0) //checks to see if it's even
			{
				System.out.println(i); // output
			}
		}
	
	}

} //end of class

/* Screen Dump
2
4
6
8
10
12
14
16
18
20 */