/*Q5. Store Employee Salary
Question
Create a Map containing employee names and salaries. Display all employees whose salary is greater than 50,000.
Explanation
Iterate through entrySet() and apply a condition on the Map value.
Input
Rahul 45000
Amit 60000
Priya 75000
Neha 48000
Output
Amit = 60000
Priya = 75000
*/
package MapAssignment;

import java.util.*;

public class Q5EmpSalary {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Rahul", 45000);
		map.put("Amit", 60000);
		map.put("Priya", 75000);
		map.put("Neha", 45000);
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getValue()>50000)
			{
				System.out.println(m.getKey()+" = "+m.getValue());
			}
		}

	}

}
