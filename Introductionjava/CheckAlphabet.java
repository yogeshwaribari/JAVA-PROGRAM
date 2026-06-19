/*
Question 36: Write a Java program to check whether a character is an alphabet or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If the character lies between A–Z or a–z, it is an alphabet.
Otherwise, it is not.
*/

import java.util.*;
class CheckAlphabet 
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Character");
		
		char ch = xyz.nextLine().charAt(0);
		//String msg = (ch == A-Z && ch ==a-z) ? "Alphabet" : "Not Alphabet");
		System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? "Alphabet" : "Not Alphabet");
	}

}
