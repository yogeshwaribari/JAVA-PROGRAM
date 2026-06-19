/*
Question 56: Write a program to input a character and check whether it is a vowel or consonant using a 
switch case.
Input:
Character = a

Output:
Vowel

Explanation:
The switch checks for 'a', 'e', 'i', 'o', 'u'. Since 'a' matches, it prints Vowel.

Input:
Character = k

Output:
Consonant

Explanation:
Since 'k' does not match any vowel case, default executes and prints Consonant.
*/
import java.util.Scanner;
class VowelSwitch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = xyz.nextLine().charAt(0);
		if(ch>=65 && ch<=90)
		{
			ch = (char)((int)ch+32);
		}
		switch(ch)
		{
			case 'a' :
			case 'e' :
			case 'i' : 
			case 'o' :
			case 'u' :
			System.out.println("Vowel");
			break;
			default: System.out.println("Consonant");
		}
		
	}
}