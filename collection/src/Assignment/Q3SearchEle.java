/*Q3. Write a Java program to search a given number in a Vector.

Description
Store integer values in Vector.
Accept a number to search.
Check using loop or contains() method.
Print found or not found.
Input
Enter number of elements:
5

Enter elements:
10
22
35
48
50

Enter number to search:
35
Output
Element found in vector*/

package Assignment;
import java.util.*;
public class Q3SearchEle {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
	    System.out.println("Enter number of elements");
	    int n=xyz.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	int num=xyz.nextInt();
	    	v.add(num);
	    }
	    System.out.println("Enter number to search");
	    int search=xyz.nextInt();
	    if(v.contains(search))
	    {
	    	System.out.println("Element found to vector");
	    }
	    else
	    {
	    	System.out.println("Element not found to vector");
	    }

	}

}
