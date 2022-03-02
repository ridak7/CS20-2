/*
Program: NumbersSum.java          Last Date of this Revision: February 23rd,2022

Purpose: An application that prompts the user for a number and then displays the numbers 1 through it, then displays the sum

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class NumbersSum 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter a number greater than 0: "); //user input
		int number = myObj.nextInt(); //records input
	
		int num = 1; //starts num at 1
		int sum = 0; //starts sum at 0
		
		while (num <=number) //when the number entered is bigger than num
		{
			System.out.println(num); //output
			sum = sum + num; // adds num to sum until num reaches number put in 
			num = num +1; //adds 1 to num until it reaches number put in 
			
		}
		System.out.println("sum: " + sum); //displays sum 
		
	myObj.close();
	}
} //end of class 

/* Screen dump 

Enter a number greater than 0: 34
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
sum: 595 */