/*WAP to find the frequency of array data or array elements or occurrence of array data
*/
import java.util.*;
public class OccurrenceArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30, 10, 20, 40, 50, 30, 10, 20 };
LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int val : arr) {
			Integer count = map.get(val);
			if (count == null) {
				count = 0;
			}
			++count;
			map.put(val, count);
		}
		System.out.println("Display the occurence of data");
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for (Map.Entry<Integer, Integer> m : set) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
	}

}
