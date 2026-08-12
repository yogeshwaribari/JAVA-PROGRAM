/*Q13. Count Even and Odd Values
Question
Create a Map containing integer keys and values. Count how many values are even and how many are odd.
Explanation
Iterate through values() and use the % operator to identify even and odd numbers.
Input
1 = 25
2 = 18
3 = 41
4 = 60
5 = 72
Output
Even Values = 3
Odd Values = 2
*/
package MapAssignment;
import java.util.*;
public class Q13EvenOddCnt {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		HashMap <Integer ,Integer> map=new HashMap<>();
		map.put(1, 25);
		map.put(2, 18);
		map.put(3, 41);
		map.put(4, 60);
		map.put(5, 72);
		for(Map.Entry<Integer, Integer> m:map.entrySet())
		{
			if(m.getValue()%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even Values :"+even);
		System.out.println("Odd Values :"+odd);

	}

}
