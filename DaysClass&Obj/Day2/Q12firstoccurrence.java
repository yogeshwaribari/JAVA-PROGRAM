/*12. Find the first occurrence of a character.*/
import java.util.*;
class Q12firstoccurrence
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		System.out.println("Enter Character");
		char ch=xyz.next().charAt(0);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println("First occurrence :"+i);
				break;
			}
		}
	}
}