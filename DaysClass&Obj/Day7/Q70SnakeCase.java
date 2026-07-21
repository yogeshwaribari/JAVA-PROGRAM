/*70. Convert a sentence into snake_case.*/
import java.util.*;
class Q70SnakeCase
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String s=xyz.nextLine();
		
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				res+="_";
				
			}
			else
			{
				res+=Character.toLowerCase(ch);
			}
		}
		System.out.println("Snake case :"+res);
	}
}