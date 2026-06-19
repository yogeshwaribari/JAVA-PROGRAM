/*3.Count the number of vowels in a string.*/
import java.util.*;
class Q3Vowelcnt
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u')
			{
				cnt++;
			}
		}
		System.out.println("Vowels :"+cnt);
	}
}