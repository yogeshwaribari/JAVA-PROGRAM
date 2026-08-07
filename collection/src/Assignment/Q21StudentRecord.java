/*Q21.Design a Java program to manage student records using a Vector collection and a POJO class Student. 
 * The program should allow the user to store and manage student details and perform multiple logical 
 * operations on the stored data.
Description
Create a POJO class Student with fields:
● int id
● String name
● double marks
● String course
Use a Vector<Student> to store student objects.
Operations to Perform (5 operations)
1. Add Student records
2. Display all students
3. Search student by ID
4. Find student with highest marks
5. Count students enrolled in a particular course
Input Example
Enter number of students:
3
Enter Student Details:
101 Amit 78 Java
102 Neha 88 Python
103 Rahul 92 Java
Enter ID to search:
102
Enter course name:
Java
Output Example
Student List:
101 Amit 78 Java
102 Neha 88 Python
103 Rahul 92 Java
Search Result:
102 Neha 88 Python
Highest Marks Student:
103 Rahul 92 Java
Total students in Java course: 2*/
package Assignment;
import java.util.*;
class Studentrecord{
	private int id;
	private String name;
	Studentrecord(int id,String name,double marks,String course)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.course=course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private double marks;
	private String course;
	
}
public class Q21StudentRecord {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector<Studentrecord> v=new Vector <Studentrecord>();
		System.out.println("Enter number of students:");
		int n=xyz.nextInt();
		do {
			System.out.println("1.Add Student records");
			System.out.println("2.Display all students");
			System.out.println("3.Search student by ID");
			System.out.println("4.Find student with highest marks");
			System.out.println("5.Count students enrolled in a particular course");
			System.out.println("Enter choice");
			int choice=xyz.nextInt();
			
			switch(choice)
			{
			case 1:
					System.out.println("Enter id");
					int id=xyz.nextInt();
					xyz.nextLine();
					System.out.println("Enter name");
					String name=xyz.nextLine();
					System.out.println("Enter Marks");
					double marks=xyz.nextDouble();
					xyz.nextLine();
					System.out.println("Enter Course");
					String course=xyz.nextLine();
					Studentrecord s=new Studentrecord(id,name,marks,course);
					v.add(s);
						System.out.println("Student Added Successfully");
				break;
				
			case 2:
				if(v.size()!=0)
				{
					for(Studentrecord s1:v)
					{
						System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getMarks()+"\t"+s1.getCourse());
					}
				}
				else
				{
					System.out.println("No Student Data Present in collection");
				}
				break;
				
			case 3:
				System.out.println("Enter Search Id");
				int skey=xyz.nextInt();
				boolean flag=false;
				for(Studentrecord s2:v)
				{
					if(s2.getId()==skey)
					{
						System.out.println("Student Data found");
						System.out.println(s2.getId()+"\t"+s2.getName()+"\t"+s2.getMarks()+"\t"+s2.getCourse());
						flag=true;
						break;
					}
				}
				if(!flag)
				{
					System.out.println("Student Data Not found");
				}
				break;
				
			case 4:
				Studentrecord max=v.get(0);				
				for(Studentrecord s3:v)
				{
					if(s3.getMarks()>max.getMarks())
					{
						max=s3;					}
				}
				System.out.println("Highest Marks Student:");
				System.out.println(max.getId()+"\t"+max.getName()+"\t"+max.getMarks()+"\t"+max.getCourse());
				break;
				
			case 5:
				int cnt=0;
				xyz.nextLine();
				System.out.println("Enter course");
				String scourse=xyz.nextLine();
				for(Studentrecord s4:v)
				{
					if(s4.getCourse().equals(scourse))
					{
						cnt++;
					}
				}
				System.out.println("Total students in " +scourse+ " course:"+cnt);
				break;
				
				default :
					System.out.println("Wrong choice");
			
			}
			
		}while(true);

	}

}
