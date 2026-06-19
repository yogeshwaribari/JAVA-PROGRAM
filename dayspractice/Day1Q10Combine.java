/*10. Concatenate Two Strings (No LeetCode)
Given two strings, combine them into a single string and return the result. 
The original order of characters must remain unchanged.
 Example: Input: "Hello", "World" → Output: "HelloWorld"
*/
import java.util.*;
class Day1Q10Combine
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter your String");
		String s1=xyz.nextLine();
		String s2=xyz.nextLine();
		String result=s1+s2;
		System.out.println("Combine = "+result);
	}
}
