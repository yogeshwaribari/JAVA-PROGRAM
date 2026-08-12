/*Q11. Find Highest Salary
Question
Create an employee Map containing names and salaries. Find and display the employee having the highest salary.
Explanation
Iterate through the Map and keep track of the maximum salary and corresponding employee.
Input
Rahul = 45000
Amit = 72000
Priya = 68000
Neha = 85000
Output
Highest Salary Employee = Neha
Salary = 85000
*/
package MapAssignment;

import java.util.*;

public class Q11HighestSal {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Rahul", 45000);
		map.put("Amit", 72000);
		map.put("Priya", 68000);
		map.put("Neha", 85000);

		int min = Integer.MIN_VALUE;
		String name = "";
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() > min) {
				min = m.getValue();
				name = m.getKey();
			}

		}
		System.out.println("Highest Salary Employee = " + name);
		System.out.println("Salary = " + min);

	}

}
