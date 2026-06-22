/*63. Replace all occurrences of one substring with another.*/
import java.util.*;
class Q63AnotherSubstring
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter Substring");
		String sub=xyz.nextLine();
		
		System.out.println("Enter New sunstring");
		String nsub=xyz.nextLine();
		String rev="";
		for(int i=0;i<s.length();)
		{
		if(i<=s.length()-sub.length() && s.substring(i,i+sub.length()).equals(sub))
		{
			rev=rev+nsub;
			i=i+sub.length();
		}
		else
		{
			rev=rev+s.charAt(i);
			i++;
		}
		}
		System.out.println("Replace Substring :"+rev);
	}
}