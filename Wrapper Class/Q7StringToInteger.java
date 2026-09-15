/*Question 7: Write a Java program to convert a String value into an Integer using wrapper 
class methods.

Input:
Enter numeric string: 100

Output:
Converted Integer value is: 100

Explanation:
Read string input "100" from user. Use Integer.parseInt()*/
import java.util.*;
class Q7StringToInteger
{
	public static void main(String x[])
	{
		
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter numeric string:");
		String str=xyz.nextLine();
		Integer a=Integer.parseInt(str);
		System.out.println("Converted Integer value is: "+a);
	}
}
