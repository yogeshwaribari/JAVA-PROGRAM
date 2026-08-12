/*Q9. Remove an Entry
Question
Create a Map containing product IDs and product names. Remove a product based on its ID.
Explanation
Use the remove() method with the required key.
Input
101 = Laptop
102 = Mouse
103 = Keyboard

Remove: 102
Output
101 = Laptop
103 = Keyboard
________________________________________
*/
package MapAssignment;

import java.util.*;

public class Q9RemoveEntry {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Laptop");
		map.put(102, "Mouse");
		map.put(103, "Keyboard");
		System.out.println("Enter remove ID");
		int rid = xyz.nextInt();

		if (map.containsKey(rid)) {
			map.remove(rid);
		}

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

	}

}
