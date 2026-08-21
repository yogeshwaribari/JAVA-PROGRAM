/*Q23. Sort Map by Values 
Question
Create a Map of students and marks and display students in descending order of their marks.
Explanation
Convert Map entries into a List and use a Comparator to sort entries according to their values.
Input
Rahul = 75
Amit = 92
Priya = 85
Neha = 68



Output
Amit = 92
Priya = 85
Rahul = 75
Neha = 68
*/
package MapAssignment;
import java.util.*;

class Student {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}

	class SortbyMarks implements Comparator<Student>
	{
	    @Override
	    public int compare(Student o1, Student o2)
	    {
	        if(o1.getMarks()<o2.getMarks())
	        {
	        	return 1;
	        }
	        else if(o1.getMarks()>o2.getMarks())
	        {
	        	return -1;
	        }
	        else
	        {
	        	return 0;
	        }
	    }
	}
	

public class Q23SortMapValues {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		HashMap<String,Integer>map=new HashMap<>();
		map.put("Rahul", 75);
		map.put("Amit", 92);
		map.put("Priya", 85);
		map.put("Neha",68);
		ArrayList <Student> al=new ArrayList<>();
		for(Map.Entry<String, Integer>m:map.entrySet())
		{
			al.add(new Student(m.getKey(),m.getValue()));
			
		}
		SortbyMarks sm=new SortbyMarks();
		Collections.sort(al,sm);
		for(Student s:al)
		{
			System.out.println(s.getName()+"\t"+s.getMarks());
		}
		

	}

}
