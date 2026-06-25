/*Q10.check weather a string is a palindrome*/
import java.util.*;
class Q10Palindrome
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter String");
	String s=xyz.nextLine();
	String temp=s;
	String r="";
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		r+=ch;
	}
	if(temp.equals(r))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
	}
}