/*Q9. Write a Java program to copy all elements from one Vector into another Vector.
Description
Create two Vectors.
Store elements in first Vector.
Copy using addAll() method.
Display second Vector.
Input
Enter elements:
5
10
15
20
Output
Second Vector elements:
5
10
15
20
*/

package Assignment;
import java.util.*;
public class Q9CopyEle {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter number of elements");
		int n=xyz.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			int num=xyz.nextInt();
			v.add(num);
		}
		Vector v1=new Vector();
		v1.addAll(v);
		System.out.println("Second Vector elements:");
		for(Object obj:v1)
		{
			System.out.println(obj);
		}

	}

}
