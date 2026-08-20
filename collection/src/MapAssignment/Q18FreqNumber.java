/*Q18. Group Numbers by Frequency
Question
Given an integer array, count the frequency of every number using a Map and display the result.
Explanation
Use the number as the key and increment its frequency whenever it appears.
Input
10 20 10 30 20 10 40
Output
10 = 3
20 = 2
30 = 1
40 = 1
________________________________________
*/
package MapAssignment;
import java.util.*;
public class Q18FreqNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap<Integer,Integer>map=new HashMap<>();
		int arr[]= {10 ,20 ,10, 30 ,20, 10 ,40};
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
