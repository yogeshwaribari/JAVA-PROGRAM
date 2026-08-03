/*1. Remove Duplicates from an ArrayList
Difficulty: Easy
Problem Statement
Given an ArrayList<Integer> containing duplicate elements, remove all duplicate values while 
preserving the order of their first occurrence.
Example
Input:
[10, 20, 10, 30, 20, 40]

Output:
[10, 20, 30, 40]
*/
package Day1;
import java.util.*;
public class Q1DuplicateEle {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(40);
		ArrayList <Integer> list=new ArrayList<Integer>();
		
		for(Integer val:al)
		{
			if(!list.contains(val))
			{
				list.add(val);
			}
		}
		System.out.println(list);

	}

}
