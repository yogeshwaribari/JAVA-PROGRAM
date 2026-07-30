/*Q2. Write a Java program to store N elements in a Vector and print the total number of elements.
Description
Create Vector.
Take number of elements from user.
Store values.
Use size() method to find total elements.
Input
Enter number of elements:
4

Enter elements:
5
15
25
35
Output
Total elements in vector = 4*/

package Assignment;
import java.util.*;
public class Q2Size {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter number of elements :");
		int n=xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=xyz.nextInt();
			v.add(num);
		}
		System.out.println("Total elements in vector :"+v.size());
	}

}
