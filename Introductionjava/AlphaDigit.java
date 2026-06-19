/*
Question 40: Write a Java program to check whether a character is an alphabet, digit, or special character.
Input:
Character = @

Output:
Special Character

Explanation:
If character is between A–Z or a–z ? Alphabet
If between 0–9 ? Digit
Otherwise ? Special Character
*/
import java.util.*;

class AlphaDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Character or Number");
		
		
		char ch = xyz.nextLine().charAt(0);
		String msg = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<= 'z') ? "Alphabet" : (ch >='0' && ch <= '9') ? "Number" : "Special Character");
		System.out.println(msg);
	}
}