/*54. Print all substrings of a string.*/
import java.util.*;
class Q54Substring
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
			
			System.out.println(s.substring(i,j));
			}
		}
	}
}
