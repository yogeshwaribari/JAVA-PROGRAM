/*13. Find the last occurrence of a character.*/
import java.util.*;
class Q13lastoccurrence
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter character");
		char ch=xyz.next().charAt(0);
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println("Last occurrence:"+i);
				break;
			}
		}
	}
}