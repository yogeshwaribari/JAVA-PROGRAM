/*67. Find the longest common prefix among multiple strings.*/
import java.util.*;
class Q68CamelCase
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String s=xyz.nextLine();
		
		String str[]=s.split(" ");
		String res=str[0].toLowerCase();
		
		for(int i=1;i<str.length;i++)
		{
			String word=str[i].toLowerCase();
			res+=Character.toUpperCase(word.charAt(0))+word.substring(1);
		}
		System.out.println("Camel case :"+res);
		
		
		
	}
}