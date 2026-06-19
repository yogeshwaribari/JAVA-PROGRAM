/*
Question 15: Write a java program to print all ASCII characters with their values.
Input:

No input required

Output (Sample):

A = 65
B = 66
...

Explanation:

The program uses a loop from 0 to 127.
Each number is converted to its corresponding character and printed.
*/
import java.util.Scanner;
class ASCII
{
	public static void main(String x[])
	{
		int i =65;
		while(i<=127)
		{
			System.out.println((char)i+ "=" +i);
			i++;
		}
	}
}