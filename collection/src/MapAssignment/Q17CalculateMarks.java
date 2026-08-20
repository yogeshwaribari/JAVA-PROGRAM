/*Q17. Calculate Total Marks
Question
Create a Map containing subject names and marks. Calculate the total and average marks.
Explanation
Iterate through Map values and calculate the sum, then divide by the number of subjects.
Input
Java = 85
SQL = 78
Python = 92
PowerBI = 80
Output
Total = 335
Average = 83.75
________________________________________
*/
package MapAssignment;
import java.util.*;
public class Q17CalculateMarks {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap<String,Integer>map=new HashMap<>();
		map.put("Java", 85);
		map.put("SQL", 78);
		map.put("Python", 92);
		map.put("PowerBI", 80);
		
		int total=0;
		for(int marks:map.values())
		{
			total+=marks;
		}
		double avg=(double)total/map.size();
		System.out.println("Total :"+total);
		System.out.println("Average :"+avg);

	}

}
