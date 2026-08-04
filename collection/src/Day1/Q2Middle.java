/*5. Find the Middle Element
Difficulty: Medium
Problem Statement
Given a LinkedList<Integer>, find and print its middle element. If the list has an even number of elements, 
print the second middle element.
Example
Input: [1, 2, 3, 4, 5, 6]
Output: 4
________________________________________
*/

package Day1;
import java.util.*;
public class Q2Middle {
	public static void main(String x[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		int mid=list.size()/2;
		System.out.println("Mid is :"+list.get(mid));
	}

}
