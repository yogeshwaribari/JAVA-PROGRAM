/*66. Find the common prefix of two strings.*/
import java.util.*;
class Q66CommonPrefix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=xyz.nextLine();
		System.out.println("Enter Second String");
		String s2=xyz.nextLine();
		String res="";
		int len=Math.min(s1.length(),s2.length());
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				res=res+s1.charAt(i);
			}
			else
			{
				break;
			}
		}
		System.out.println("Common Prefix :"+res);
		
	}
}