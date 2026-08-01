/*Q10. Write a Java program to check whether a Vector is empty or not.
Description
Create a Vector.
Check using isEmpty() method.
Print appropriate message.
Input
Enter number of elements:
0
Output
Vector is empty	*/
package Assignment;
import java.util.*;
public class Q11EmptyOrNot {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter number of elements");
		int n=xyz.nextInt();
		//System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			int num=xyz.nextInt();
			v.add(num);
		}
		if(v.isEmpty())
		{
			System.out.println("Vector is empty");
		}
		else
		{
			System.out.println("Vector is not empty");
		}
	}

}
