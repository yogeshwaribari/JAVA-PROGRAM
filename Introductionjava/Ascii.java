/*
Question 16: Write a Java program to print the ASCII value of a given character
Input:
Character = A

Output:
ASCII value = 65

Explanation:
Every character has a unique ASCII value. When a character is typecast to an integer, 
its ASCII value is obtained. The ASCII value of 'A' is 6
*/

import java.util.*;

class Ascii
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter A Character");
		
		char ch = xyz.nextLine().charAt(0);
		int Ascii = ch;
		System.out.println("ASCII value =" + Ascii);
	}

}