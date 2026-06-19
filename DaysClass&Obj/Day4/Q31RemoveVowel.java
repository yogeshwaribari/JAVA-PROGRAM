/*31. Remove all vowels from a string.*/
import java.util.*;
class Q31RemoveVowel
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String str="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
			{
				str+=ch;
			}
		}
		System.out.println("Remove Vowel :"+str);
	}
}
