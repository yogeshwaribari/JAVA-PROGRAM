/*51. Find the shortest word in a sentence.*/
import java.util.*;
class Q51ShortestWord
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String arr[]=s.split(" ");
		String shortest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(shortest.length()>arr[i].length())
			{
				shortest=arr[i];
			}
		}
		System.out.println("Shortest word :"+shortest);
	}
}