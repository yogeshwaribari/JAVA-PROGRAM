/*Q22. Character with Maximum Frequency
Question
Accept a String and find the character that occurs the maximum number of times.
Explanation
Create a frequency Map and track the character having the highest frequency.
Input
mississippi
Output
Maximum Frequency Character = i
Frequency = 4
*/
package MapAssignment;
import java.util.*;
public class Q22MaxFreqChar {

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
		int max=0;
		Character ch=null;
		for(Map.Entry<Character, Integer>m:map.entrySet())
		{
			if(m.getValue()>max)
			{
				max=m.getValue();
				ch=m.getKey();
			}
		}
		System.out.println("Maximum Frequency Character ="+ch);
		System.out.println("Frequency = "+max);
		

	}

}
