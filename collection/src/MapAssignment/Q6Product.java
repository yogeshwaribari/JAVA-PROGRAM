/*Q6. Find a Product Price
Question
Create a Map containing product names and prices. Accept a product name and display its price.
Explanation
Use get() to retrieve the value associated with the product key.
Input
Laptop = 55000
Mobile = 25000
Tablet = 18000

Search: Mobile
Output
Mobile Price = 25000
*/
package MapAssignment;
import java.util.*;
public class Q6Product {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap <String,Integer> map=new HashMap<>();
		map.put("Laptop", 55000);
		map.put("Mobile", 25000);
		map.put("Tablet", 18000);
		System.out.println("Search Product");
		String sname=xyz.nextLine();
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getKey().equals(sname)) {
				System.out.println(m.getKey()+" Price = "+m.getValue());
			}
			
		}

	}

}
