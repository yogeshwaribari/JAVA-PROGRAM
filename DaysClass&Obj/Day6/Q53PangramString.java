/*53. Check whether a string is a pangram.*/
import java.util.*;
class Q53PangramString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		s=s.toLowerCase();
		boolean flag=true;
		for(char ch='a' ;ch<='z';ch++)
		{
			if(s.indexOf(ch)==-1)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
		
	}
}