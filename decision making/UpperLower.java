/*
Question 24: Write a java program to check whether a character is uppercase or lowercase alphabet.
Input:
Character = A

Output
Uppercase Alphabet

Explanation:
Character 'A' lies between 'A' and 'Z', so it is uppercase.
*/
import java.util.Scanner;
class UpperLower
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = xyz.nextLine().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Uppercase Alphabet");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Lower Alphabet");
		}
		else{
			System.out.println("Not Alphabet");
		}
	}
}