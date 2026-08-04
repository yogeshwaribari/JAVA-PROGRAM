/*4. Reverse a LinkedList
Difficulty: Easy
Problem Statement
Given a LinkedList<Integer>, reverse the order of all elements without creating another LinkedList.
Example
Input: [10, 20, 30, 40]
Output: [40, 30, 20, 10]
*/
package Day1;
import java.util.*;
public class Q1Reverse {
	public static void main(String x[])
	{
	
	int arr[]= {10,20,30,40,50};
	LinkedList<Integer> list=new LinkedList<Integer>();
	
	for(int i=0;i<arr.length;i++)
	{
		list.addFirst(arr[i]);
	}
	
	System.out.println(list);

	}
	
}
