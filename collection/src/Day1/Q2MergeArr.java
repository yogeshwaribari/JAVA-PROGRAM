/*2. Merge Two Sorted ArrayLists
Difficulty: Easy–Medium
Problem Statement
Given two sorted ArrayList<Integer> objects, merge them into a single sorted ArrayList 
without using any built-in sorting method.
Example
Input:
List1 = [1, 3, 5]
List2 = [2, 4, 6]

Output:
[1, 2, 3, 4, 5, 6]
*/

package Day1;
import java.util.*;
public class Q2MergeArr {

	public static void main(String[] args) {
	ArrayList <Integer>al=new ArrayList<Integer>();
	al.add(1);
	al.add(3);
	al.add(5);
	System.out.println("List1 :"+al);
	ArrayList <Integer>al1=new ArrayList<Integer>();
	al1.add(2);
	al1.add(4);
	al1.add(6);
	System.out.println("List2 :"+al1);

	al.addAll(al1);
	System.out.println("Before Sorting");
	for(Integer val:al)
	{
		
		System.out.print(val+"\t");
	}
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size();j++)
		{
			Integer prev=al.get(i);
			Integer next=al.get(j);
			if(prev>next)
			{
				al.set(i, next);
				al.set(j, prev);
			}
		}
	}
	System.out.println("\nAfter Sorting");
	for(Integer val:al)
	{
		System.out.print(val+"\t");
	}
	
	}

}
