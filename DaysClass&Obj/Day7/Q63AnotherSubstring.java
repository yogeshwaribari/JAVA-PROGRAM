/*63. Replace all occurrences of one substring with another.*/
import java.util.*;
class Q63AnotherSubstring
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");//hello
		String s=xyz.nextLine();
		System.out.println("Enter Substring");//ello
		String sub=xyz.nextLine();
		
		System.out.println("Enter New sunstring");//lo
		String nsub=xyz.nextLine();
		String rev="";
		for(int i=0;i<s.length();)//5
		{
		if(i<=s.length()-sub.length() && s.substring(i,i+sub.length()).equals(sub))
			//0<=5-4=1 1<=1 && (1,4)ello
		{
			rev=rev+nsub;//h+lo
			i=i+sub.length();//5
		}
		else
		{
			rev=rev+s.charAt(i);//h
			i++;
		}
		}
		System.out.println("Replace Substring :"+rev);
	}
}