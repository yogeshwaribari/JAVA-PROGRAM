/*
Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.
*/
import java.util.*;
class Vowel
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = xyz.nextLine().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Not Vowel");
		}
		
	}
}