/*2.Find the length of a string without using length().*/
import java.util.*;
class Q2CntLength
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int cnt=0;
		char ch[]=s.toCharArray();
		for(char c :ch)
		{
			cnt++;
		}
		System.out.println("String Length :"+cnt);
	}
}