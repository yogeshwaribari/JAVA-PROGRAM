/*
Question 39: Write a Java program to input an alphabet and check whether it is a vowel or consonant.
Input:
Alphabet = e

Output:
Vowel

Explanation:
Vowels are a, e, i, o, u (both uppercase and lowercase).
All other alphabets are consonants.
*/

import java.util.*;
class Vowel
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch = xyz.nextLine().charAt(0);
		 
		 String msg = ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Vowel" : "Not Vowel");
		 System.out.println(msg);
	}
}
		