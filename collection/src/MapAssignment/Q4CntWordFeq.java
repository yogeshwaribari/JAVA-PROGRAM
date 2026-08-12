/*Q4. Count Word Frequency
Question
Accept a sentence and count the frequency of each word using a HashMap.
Explanation
Split the sentence into words and maintain each word's count in the Map.
Input
java is easy and java is powerful
Output
java = 2
is = 2
easy = 1
and = 1
powerful = 1
*/
package MapAssignment;

import java.util.*;

public class Q4CntWordFeq {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = xyz.nextLine();
		String[] str = s.split(" ");
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);

			} else {
				map.put(str[i], 1);
			}

		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

	}

}
