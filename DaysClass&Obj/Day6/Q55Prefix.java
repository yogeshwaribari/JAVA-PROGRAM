/*55. Print all prefixes of a string.*/
import java.util.*;
class Q55Prefix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		for(int i=1;i<=s.length();i++)
		{
			
			System.out.println(s.substring(0,i));
		}
	}
}