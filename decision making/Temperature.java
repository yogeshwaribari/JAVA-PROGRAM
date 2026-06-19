/*
Question 41: Classify temperature reading:
? Input: Temperature in Celsius
? Logic:
? <0 ? Freezing
? 0–20 ? Cold
? 21–35 ? Warm
? 35 ? Hot
? Output: Display weather type.
Input:
Temperature = 15°C

Output:
Cold

Explanation:
Temp < 0 ? Freezing
0–20 ? Cold
21–35 ? Warm
35 ? Hot
*/
import java.util.Scanner;
class Temperature
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Temperature");
		int temp = xyz.nextInt();
		if(temp<0){
			System.out.println("Freezing");
		}
		else if(temp>=0 && temp<=20)
		{
			System.out.println("Cold");
		}
		else if(temp>=21 && temp<35)
		{
			System.out.println("Warm");
		}
		else 
		{
			System.out.println("Hot");
		}
	}
}