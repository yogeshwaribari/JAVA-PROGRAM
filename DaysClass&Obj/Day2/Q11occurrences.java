/*11. Count the occurrences of a particular character.
Input: "banana"
Character to count: 'a'
Output: 3*/
import java.util.*;
class Q11occurrences
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		System.out.println("Enter Character");
		char ch=xyz.next().charAt(0);
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==ch)
			{
				cnt++;
			}
		}
		System.out.println("occurrences cnt :"+cnt);
	}
}