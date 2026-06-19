/*1.Print each Character of a String*/
import java.util.*;
class Q1PrintChar
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter String");
	String s=xyz.nextLine();
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		System.out.println(ch);
	}
	}
}