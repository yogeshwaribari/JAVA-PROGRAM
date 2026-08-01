/*Q6. Write a Java program to store integer elements in a Vector and display the first and last element.
Description
Create a Vector.
Store elements using add() method.
Use firstElement() and lastElement() methods.
Print both values.
Input
Enter number of elements:
5

Enter elements:
11
22
33
44
55
Output
First element = 11
Last element = 55*/

package Assignment;
import java.util.*;
public class Q6FirstLastEle {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter number of elements");
		int n= xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=xyz.nextInt();
			v.add(num);
		}
		System.out.println("First element ="+v.firstElement());
		System.out.println("Last elements ="+v.lastElement());

	}

}
