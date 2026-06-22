/*64. Check whether a string starts with a given prefix*/
import java.util.*;
class Q64Prefix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter prefix");
		String p=xyz.nextLine();
		
		if(s.startsWith(p))
		{
			System.out.println("Start with prefix");
		}
		else
		{
			System.out.println("Not start with prefix");
		}
	}
}