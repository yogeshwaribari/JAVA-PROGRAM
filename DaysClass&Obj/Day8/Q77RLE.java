/*77. Implement Run Length Encoding (RLE).*/
import java.util.*;
class Q77RLE
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		String res="";
		char current=s.charAt(0);
		int cnt=1;
		
		for(int i=1;i<s.length();i++)
		{
			if(current==s.charAt(i))
			{
				cnt++;
			}
			else
			{
				res=res+current+cnt;
				current=s.charAt(i);
				cnt=1;
			}
		}
		res=res+current+cnt;
		System.out.println(res);
	}
}