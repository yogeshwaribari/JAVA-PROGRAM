/*
Question 5: Write a java program to print all odd numbers between 1 to 100.
Input:

No input required

Output:

1 3 5 7 ... 99

Explanation:

Odd numbers are not divisible by 2.
The program prints numbers where number % 2 is not equal to 0.
*/
class OddWhile
{
	public static void main(String x[])
	{
		int i =1;
		while(i<=100)
		{
			
			if(i%2!=0)
			{
				System.out.print(" " + i);
			}
			i++;
		}
	}
}