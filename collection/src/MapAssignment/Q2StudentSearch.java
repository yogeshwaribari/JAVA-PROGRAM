/*Q2. Search Student Marks
Question
Create a Map containing student names and marks. Accept a student name and display the marks if the student
 exists.
Explanation
Use containsKey() or get() to search for a particular student.
Input
Map:
Rahul = 85
Amit = 72
Priya = 91

Search: Priya
Output
Priya's Marks = 91
*/
package MapAssignment;
import java.util.*;
public class Q2StudentSearch {

	public static void main(String[] args) {
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
			map.put(name,marks);
		}
		System.out.println("Search name");
		xyz.nextLine();
		String sname=xyz.nextLine();
		if(map.containsKey(sname))
		{
			System.out.println(sname+" = "+map.get(sname));
		}
		else
		{
			System.out.println("Student not found");
		}

	}

}
