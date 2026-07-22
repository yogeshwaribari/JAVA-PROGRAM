/*76. Decompress a compressed string.*/
import java.util.*;
class Q76Decompress
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");//a3b2c2
		String s=xyz.nextLine();
		
		String res="";
		for(int i=0;i<s.length();i=i+2)//
		{
			char ch=s.charAt(i);//a
			int cnt=s.charAt(i+1)-'0';//convert number
		
		for(int j=1;j<=cnt;j++)
		{
			res=res+ch;
		}
		}
		System.out.println(res);
	}
}