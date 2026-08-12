/*Q12. Find Lowest Salary
Question
Create an employee Map and find the employee with the lowest salary.
Explanation
Compare every salary with the current minimum value while iterating through the Map.
Input
Rahul = 45000
Amit = 72000
Priya = 38000
Neha = 85000
Output
Lowest Salary Employee = Priya
Salary = 38000
*/
package MapAssignment;
import java.util.*;
public class Q12LowestSal {

	public static void main(String[] args) {
		HashMap <String, Integer> map=new HashMap<>();
		map.put("Rahul", 45000);
		map.put("Amit", 72000);
		map.put("Priya", 38000);
		map.put("Neha", 85000);
		
		int max=Integer.MAX_VALUE;
		String name="";
		for(Map.Entry<String, Integer> m : map.entrySet())
		{
			if(m.getValue()<max)
			{
				max=m.getValue();
				name=m.getKey();
			}
		}
		System.out.println("Lowest Salary Employee :"+name);
		System.out.println("Salary :"+max);

	}

}
