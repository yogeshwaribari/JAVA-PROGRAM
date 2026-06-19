/*
Question 27: Write a Java program to toggle the case of an alphabet using ASCII values.
Input:
a

Output:
A

Explanation:
Lowercase and uppercase letters differ by 32 in ASCII values.
By adding or subtracting 32, the case of the alphabet can be changed.

*/

import java.util.*;

class AlphabetAscii
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number");
		
		char ch = xyz.nextLine().charAt(0);
		
		System.out.println(ch>='a' && ch<='z' ? (char)(ch-32) : (char)(ch+32));

	}
	
}
