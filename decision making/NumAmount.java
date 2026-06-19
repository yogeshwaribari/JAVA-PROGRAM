/*
Question 25: Write a java program to find the total number of notes in a given amount.
Input:
Amount = 2528

Output
500 = 5
100 = 0
50 = 0
20 = 1
10 = 0
5 = 1
2 = 1
1 = 1

Explanation:
The amount is divided starting from the highest denomination to the lowest to calculate the number of notes.
*/
import java.util.Scanner;
class NumAmount
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amt = xyz.nextInt();
		
		int N500 = amt/500; //5
		int rem = amt%500; //28
		int N100 = rem/100; //0
		rem = rem%100; //20
		int N50 = rem/50; //0
		rem = rem%50; //28
		int N20 = rem/20; //1
		rem = rem%20; //8
		int N10 = rem/10; //0
		rem = rem%10; //8
		int N5 = rem/5; //1
		rem = rem%5; //3
		int N2 = rem/2; //1
		rem = rem %2; //1
		System.out.println("500 = "+N500+ "\n100 = "+N100+ "\n50 = "+N50+ "\n20 = "+N20+ "\n10 = "+N10+ 
		"\n5 = "+N5+ "\n2 = "+N2+ "\n1 = "+rem);
		
	}
}
