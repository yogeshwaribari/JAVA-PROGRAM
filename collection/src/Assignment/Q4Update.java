/*Q4. Write a Java program to remove a specific element from a Vector.
Description
Store elements in Vector.
Take element to remove.
Use remove() method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter element to remove:
30
Output
Updated Vector:
10
20
40*/
package Assignment;
import java.util.*;
public class Q4Update {

	public static void main(String[] args) {
		Vector v=new Vector();
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int n=xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=xyz.nextInt();
			v.add(num);
		}
		System.out.println("Enter element to remove :");
		int rem=xyz.nextInt();
		if(v.contains(rem))
		{
			v.remove(v.indexOf(rem));
		}
		else
		{
			System.out.println("Element not found");
		}
		System.out.println("Updated vector");
		for(Object obj:v)
		{
		
			System.out.println(obj);
		}

	}

}
