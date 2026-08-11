/*1. Store and Display Student Marks
Question
Create a HashMap to store student names and their marks. Display all student names along with their marks.
Explanation
Use the student name as the key and marks as the value. Iterate through the Map using entrySet().
Input
Rahul 85
Amit 72
Priya 91

Output
Rahul = 85
Amit = 72
Priya = 91
*/

package MapAssignment;
import java.util.*;
public class Q1StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> map=new HashMap<String,Integer>();
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of student");
		int n=xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Name");
			String name=xyz.nextLine();
			System.out.println("Enter Marks");
			int marks=xyz.nextInt();
			map.put(name, marks);
		}
		
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" = "+m.getValue());
		}
	}

}
