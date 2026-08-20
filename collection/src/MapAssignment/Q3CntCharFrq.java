/*Q3. Count Character Frequency 
Question
Write a Java program to count how many times each character occurs in a String using a HashMap.
Explanation
Store each character as a key and its occurrence count as the value.
Input
banana
Output
b = 1
a = 3
n = 2
*/
package MapAssignment;
import java.util.*;
public class Q3CntCharFrq {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		HashMap<Character,Integer>  map=new HashMap<Character, Integer>();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> m: map.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}

}
