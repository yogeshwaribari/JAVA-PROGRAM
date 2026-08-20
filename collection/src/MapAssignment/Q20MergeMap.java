/*Q20. Merge Two Maps
Question
Create two Maps containing product IDs and prices. Merge them into one Map without duplicate keys.
Explanation
Use putAll() to combine both Maps. If a key already exists, the second Map's value replaces the first.
Input
Map1:
101 = 500
102 = 700

Map2:
103 = 900
104 = 1200
Output
101 = 500
102 = 700
103 = 900
104 = 1200
*/
package MapAssignment;
import java.util.*;
public class Q20MergeMap {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap <Integer,Integer>map=new HashMap<>();
		map.put(101, 500);
		map.put(102, 700);
		map.put(101, 500);
		
	LinkedHashMap <Integer,Integer>map1=new LinkedHashMap<>();
		map1.putAll(map);
		map1.put(103, 900);
		map1.put(104, 1200);
		
		//HashMap<Integer,Integer>map3=new HashMap<>();
		
		for(Map.Entry<Integer, Integer>m:map1.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}

}
