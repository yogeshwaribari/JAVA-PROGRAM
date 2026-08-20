/*Q16. Find Duplicate Words
Question
Accept a sentence and display all words that occur more than once.
Explanation
Create a word-frequency Map and filter entries having frequency greater than 1.
Input
java python java sql python java
Output
java = 3
python = 2
________________________________________
*/
package MapAssignment;
import java.util.*;
public class Q16DuplicateWord {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap <String,Integer>map=new HashMap<>();
		System.out.println("Enter Sentence");
		String s=xyz.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				map.put(str[i], map.get(str[i])+1);
			}
			else
			{
				map.put(str[i], 1);
			}
		}
		for(Map.Entry<String, Integer>m:map.entrySet())
		{
			if(m.getValue()>=2)
			{
				System.out.println(m.getKey()+"\t"+m.getValue());
			}
		}
		
		

	}

}
