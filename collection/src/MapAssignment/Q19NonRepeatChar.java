/*Q19. First Non-Repeated Character
Question
Find the first character in a String that occurs only once.
Explanation
First calculate character frequencies using a Map, then traverse the String again to find the first character with frequency 1.
Input
swiss
Output
First Non-Repeated Character = w
*/
package MapAssignment;
import java.util.*;
public class Q19NonRepeatChar {

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
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer>m:map.entrySet())
		{
			if(m.getValue()<=1)
			{
				System.out.println("First Non-Repeated Character = "+m.getKey());
				break;
			}
		}
	}

}
