/*Q7.Given a string, remove duplicate characters while preserving the first occurrence. 
Then print the characters in descending alphabetical order.
Explanation -
•
Remove repeated characters.
•
Ignore spaces.
•
Sort remaining characters descending.
•
Print the result.
Input - programming
Output -
Unique Characters : progamin 
Sorted Characters : rponmiga*/
import java.util.*;
class Q7
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
			
			
				 if(str.indexOf(ch) == -1) 
				 {
					 str+=ch;
				 }
			
		}
		System.out.println("Unique characters :"+str);
		
		char re[]=str.toCharArray();
		
		for(int i=0;i<re.length;i++)
		{
			
			for(int j=i+1;j<re.length;j++)
			{
				if(re[i]<re[j])
				{
					char temp=re[i];
					re[i]=re[j];
					re[j]=temp;
				}
			}
		}
			String r="";
			
			for(int i=0;i<re.length;i++)
			{
							 r=r+re[i];

			}
			System.out.println("Desending :"+r);
		
		
		
		
	}
}
