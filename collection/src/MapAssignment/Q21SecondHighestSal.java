/*Q21. Find Second Highest Salary
Question
Create an employee Map and find the employee having the second-highest salary without sorting the Map.
Explanation
Traverse the Map and maintain both the highest and second-highest salary while comparing each entry.
Input
Rahul = 45000
Amit = 85000
Priya = 72000
Neha = 95000
Output
Second Highest Employee = Amit
Salary = 85000
*/
package MapAssignment;
import java.util.*;
public class Q21SecondHighestSal {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap <String,Integer>map=new HashMap<>();
		map.put("Rahul", 45000);
		map.put("Amit", 85000);
		map.put("Priya", 72000);
		map.put("Neha", 95000);
		
		int max=0;
		int smax=0;
		String name="";
		for(Map.Entry<String, Integer>m:map.entrySet())
		{
			if(m.getValue()>max)
			{
				smax=max;
				max=m.getValue();
				
			}
			else if(m.getValue()>smax)
			{
				smax=m.getValue();
				name=m.getKey();
				
			}
					
		}
		
		System.out.println("Second Highest Employee = "+name);
		System.out.println("Salary = "+smax);

	}

}
