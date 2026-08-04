/*6. Check Whether a LinkedList is a Palindrome
Difficulty: Medium
Problem Statement 
Given a LinkedList<Character>, determine whether it reads the same from left to right and right to left.
Example
Input: [R, A, D, A, R]
Output: Palindrome
*/
package Day1;
import java.util.*;
public class Q3Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> list=new LinkedList<>();
		list.add('R');
		list.add('A');
		list.add('D');
		list.add('A');
		list.add('R');
		
		System.out.println(list);
		int i=0;
		int j=list.size()-1;
		boolean flag=true;
		while(i<j)
		{
			if(list.get(i)!=list.get(j))
			{
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
