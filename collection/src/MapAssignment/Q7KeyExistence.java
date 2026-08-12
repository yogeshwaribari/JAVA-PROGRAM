/*Q7. Check Key Existence
Question
Create a Map of country and capital names. Check whether a particular country exists in the Map.
Explanation
Use containsKey() to check whether the given country is available.
Input
India = Delhi
Japan = Tokyo
France = Paris

Search: India
Output
India is present in the Map.
*/
package MapAssignment;
import java.util.*;
public class Q7KeyExistence {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap <String,String> map=new HashMap<>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokya");
		map.put("France", "Paris");
		System.out.println("Enter search ");
		String sname=xyz.nextLine();
		boolean flag=false;
		for(Map.Entry<String, String> m:map.entrySet()) {
			if(m.getKey().equalsIgnoreCase(sname))
			{
				flag=true;
				System.out.println(m.getKey()+" is Present in the Map");
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Country Not Found");
		}

	}

}
