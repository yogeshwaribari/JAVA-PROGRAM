/*75. Implement string compression (Example: aaabbcc → a3b2c2).*/
import java.util.*;
class Q75Compression
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String res="";
		int cnt=1;
		char current=s.charAt(0);//a
		for(int i=1;i<s.length();i++)
		{
			
				if(current==s.charAt(i))//a==b
				{
					cnt++;//3
				}
				else
				{
				res=res+current+cnt;//a3
				current=s.charAt(i);//b
				cnt=1;
				}
				
			
		}
		res=res+current+cnt;
		System.out.println(res);
	}
}