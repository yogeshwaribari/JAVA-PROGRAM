/*
Question 3: Write a java program to print all alphabets from a to z. - using while loop
Input:

No input required

Output:

a b c d e f ... z

Explanation:

The program starts from character ‘a’ and prints each character until ‘z’.
The loop increments the character in every iteration.
*/

class AlphabetWhile
{
	public static void main(String x[])
	{
		char ch = (char)(int)97;
		while(ch<='z')
		{
			System.out.print(" " + ch);
			ch++;
		}
	}
}