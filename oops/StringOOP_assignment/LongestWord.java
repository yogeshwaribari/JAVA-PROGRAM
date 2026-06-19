/*25. Find Longest Word
Class Name: LongestWord
Methods:
void setString(String str)
String getLongestWord()
Example
Input:
 "Java is powerful"
Output:
 "powerful"*/
 import java.util.*;
 class LongestWord
 {
	 String str;
	 
	 void setString(String str)
	 {
		 this.str=str;
	 }
	String getLongestWord()	
	{
		String arr[]=str.split(" ");
		String longest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].length()>longest.length())
			{
				longest=arr[i];
			}
		}
		return longest;
	}	
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		LongestWord l=new LongestWord();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		l.setString(s);
		String result=l.getLongestWord();
		System.out.println("Output :"+result);
	}
	 
 }