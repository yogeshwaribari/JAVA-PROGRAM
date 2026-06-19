/*41. Find the first non-repeated character.*/
import java.util.*;
class Q41FirstNonRepeated
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s= xyz.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			if(s.charAt(j)==ch)
			{
				cnt++;
			}
			
		
		if(cnt==1)
		{
			System.out.println("First Non Repeated char :"+ch);
			break;
		}
		}
	}
}