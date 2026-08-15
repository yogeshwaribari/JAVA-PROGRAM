/*Q14. Sort Map by Keys
Question
Create a HashMap containing student names and marks. Display the entries in alphabetical order of student names.
Explanation
Transfer the data into a TreeMap, which automatically sorts entries according to keys.
Input
Rahul = 85
Amit = 72
Priya = 91
Neha = 78
Output
Amit = 72
Neha = 78
Priya = 91
Rahul = 85
________________________________________
*/
package MapAssignment;
import java.util.*;
public class Q14SortMap {

	public static void main(String[] args) {
		HashMap <String,Integer> map=new HashMap<>();
		map.put("Rahul", 85);	
		map.put("Amit", 72);	
		map.put("Priya", 91);	
		map.put("Neha", 78);
		
		TreeMap<String ,Integer> t=new TreeMap<>(map);
		for(Map.Entry<String, Integer> m:t.entrySet())
		{
			System.out.println(m.getKey()+ " = "+m.getValue());
		}

	}

}
