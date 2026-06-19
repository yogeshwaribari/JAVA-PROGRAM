/*
3. Count Vowels and Consonants (No LeetCode)
Given a string, count the total number of vowels and consonants present in it. Consider only
alphabetic characters while performing the count.
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3
*/
import java.util.*;
class Day1Q3Vowel
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=xyz.nextLine();
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		
		int vcnt=0;
		int ccnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&& ch[i]<='z')
			{
			if(ch[i]=='a'||ch[i]=='i'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
			{
				vcnt++;
			}
			else
			{
				ccnt++;
			}
		}
		}
		System.out.println("vowels = "+vcnt);
		System.out.println("Consonants = "+ccnt);
		
	}
}
