/*50. Find the longest word in a sentence.*/
import java.util.*;
class Q50LongestWord
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String arr[]=s.split(" ");
		String longest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>longest.length())
			{
				longest=arr[i];
			}
		}
		System.out.println("Longest word :"+longest);
	}
}