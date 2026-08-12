/*Q8. Find the Size of Map
Question
Create a Map containing employee IDs and names. Display the total number of employees.
Explanation
Use the size() method to find the number of key-value pairs.
Input
101 = Rahul
102 = Amit
103 = Priya
104 = Neha
Output
Total Employees = 4
________________________________________
*/
package MapAssignment;
import java.util.*;
public class Q8MapSize {
	public static void main(String x[])
	{
		HashMap <Integer, String> map=new HashMap<>();
		map.put(101, "Rahul");
		map.put(102, "Amit");
		map.put(103, "Priya");
		map.put(104, "Neha");
		System.out.println("Total Employee = "+map.size());
	}
}
