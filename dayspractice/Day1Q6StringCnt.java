/*
6. Find Length Without Built-in Function (No LeetCode)
Given a string, determine its length without using any built-in length function.
 Traverse the string manually and count the characters. Example: Input: "coding" → Output: 6
*/
import java.util.*;
class Day1Q6StringCnt
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=xyz.nextLine();
		char ch[]=str.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{	
			cnt++;
		}
		System.out.println("Count ="+cnt);
	}
}