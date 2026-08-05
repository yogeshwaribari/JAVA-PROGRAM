/*Stack (3 Questions)
7. Valid Parentheses
Difficulty: Easy
Problem Statement
Given a string containing only (, ), {, }, [ and ], determine whether the parentheses are balanced.
Example
Input:
"{[()]}"

Output:
True
*/
package Day1;
import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Brackets");
		String para=xyz.nextLine();
		
		Stack <Character> st=new Stack<Character>();
		boolean flag=true;
		for(int i=0;i<para.length();i++)
		{
			char ch=para.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
			{
				st.push(ch);
			}
			else
			{
				char top=st.pop();
				if((ch==')' && top!='(') || (ch=='}' && top!='{') ||(ch==']' && top!='['))
				{
					flag=false;
					break;
				}
			}
			
		}
		if(flag && st.empty()) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
