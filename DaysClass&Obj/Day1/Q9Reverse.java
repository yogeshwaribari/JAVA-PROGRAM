/*9.Reverse a String*/
import java.util.*;
class Q9Reverse
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String n="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			n+=ch;
		}
		System.out.println("Reverse :"+n);
	}
}