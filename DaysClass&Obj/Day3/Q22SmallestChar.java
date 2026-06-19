/*22. Find the smallest character in a string.*/
import java.util.*;
class Q22SmallestChar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		char min=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(min>s.charAt(i))
			{
				min=s.charAt(i);
			}
		}
		System.out.println("Smallest Character :"+min);
	}
}