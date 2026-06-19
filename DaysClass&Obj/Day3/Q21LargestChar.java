/*21. Find the largest character in a string.*/
import java.util.*;
class Q21LargestChar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		char max=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>max)
			{
				max=s.charAt(i);
			}
		}
		System.out.println("Largest Char :"+max);
	}
}