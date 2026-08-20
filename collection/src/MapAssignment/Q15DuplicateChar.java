/*Q15. Find Duplicate Characters
Question
Accept a String and display only the characters that occur more than once.
Explanation
Use a Map to count character frequencies and display entries whose count is greater than 1.
Input
programming
Output
r = 2
g = 2
m = 2
________________________________________
*/
package MapAssignment;
import java.util.*;
public class Q15DuplicateChar {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap<Character,Integer>map=new HashMap<>();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		for(Map.Entry<Character, Integer>m:map.entrySet())
		{
			if(m.getValue()>=2)
			{
				System.out.println(m.getKey()+"\t"+m.getValue());
			}
		}

	}

}
