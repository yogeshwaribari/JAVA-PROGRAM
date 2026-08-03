/*3. Find the Second Largest Element
Difficulty: Medium
Problem Statement
Given an ArrayList<Integer>, find the second largest unique element. If it does not exist, 
print an appropriate message.
Example
Input:
[12, 45, 67, 45, 89, 89]
Output:
67

*/
package Day1;
import java.util.*;
public class Q3SecondLargest {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(45);
		al.add(67);
		al.add(45);
		al.add(89);
		al.add(89);
		int max=al.get(0);
		int max1=al.get(0);
			for(Integer val:al)
			{
				if(val>max)
				{
					max1=max;
					max=val;
				}
				else if(max1>val && val!=max)
				{
					max1=val;
				}
			}
		System.out.println("Second Max :"+max1);

	}

}
