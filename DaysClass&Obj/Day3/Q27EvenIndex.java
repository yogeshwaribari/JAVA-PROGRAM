/*27. Print characters at even indexes.*/
import java.util.*;
class Q27EvenIndex
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Even Index Char");
		for(int i=0;i<s.length();i++)
		{
		
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}