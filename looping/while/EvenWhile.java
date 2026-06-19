/*
Question 4: Write a java program to print all even numbers between 1 to 100.- using while loop
Input:

No input required

Output:

2 4 6 8 ... 100

Explanation:

Even numbers are divisible by 2.
The program checks each number from 1 to 100 and prints it if it is divisible by 2.
*/
class EvenWhile
{
	public static void main(String x[])
	{
		int i =2;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.printf(" " + i);
			}
			i++;
		}	
	}
}