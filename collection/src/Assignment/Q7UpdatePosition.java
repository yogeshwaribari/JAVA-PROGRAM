/*Q7. Write a Java program to update an element at a specific position in a Vector.
Description
Store elements in Vector.
Ask user for position.
Accept new value.
Update using set(index,value) method.
Display updated Vector.
Input
Enter elements:
10
20
30
40

Enter position to update:
2

Enter new value:
99
Output
Updated Vector:
10
20
99
40*/
package Assignment;
import java.util.*;
public class Q7UpdatePosition {

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
		System.out.println("Enter position to update");
		int p=xyz.nextInt();
		System.out.println("Enter new value");
		int val=xyz.nextInt();
		v.set(p, val);
		System.out.println("Update vector");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		

	}

}
