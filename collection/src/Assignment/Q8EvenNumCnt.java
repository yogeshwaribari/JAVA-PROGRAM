/*Q8. Write a Java program to count how many even numbers are present in a Vector.
Description
Store integer values.
Traverse using loop.
Check number % 2 == 0.
Count even numbers.
Input
Enter elements:
10
15
20
25
30
Output
Total even numbers = 3*/

package Assignment;
import java.util.*;
public class Q8EvenNumCnt {

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
		int cnt=0;
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			if((int)obj%2==0)
			{
				cnt++;
			}
		}
		System.out.println("Total even numbers :"+cnt);
	}

}
