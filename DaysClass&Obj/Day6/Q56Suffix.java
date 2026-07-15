/*56. Print all suffixes of a string.*/
import java.util.*;
class Q56Suffix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string");
		String s=xyz.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.substring(i));
		}
	}
}