/*Q11. Create a POJO class Student with fields:
id
name
marks
Store 5 students in a Vector and display students who scored more than 60 marks.
Description
Program should:
Create Student class with getters/setters
Store objects in Vector
Apply condition marks > 60
Display qualified students
Input
101 Rahul 55 
102 Amit 78 
103 Neha 88 
104 Pooja 45 
105 Kiran 67
Output
Students scoring above 60:

102 Amit 78
103 Neha 88
105 Kiran 67*/
package Assignment;

import java.util.*;

class Student {
	private int id;
	private String name;
	private int marks;

	Student() {

	}

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


}

public class Q10StudentData {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter number of students");
		int n=xyz.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Student s=new Student();
			System.out.println("Enter id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			String name=xyz.nextLine();
			System.out.println("Enter marks");
			int marks=xyz.nextInt();
			 s=new Student(id,name,marks);
			v.add(s);
		}
		System.out.println("Students scoring above 60:");
		for(Object obj:v)
		{
			Student s=(Student)obj;
			if(s.getMarks()>60)
			{
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
			}
		}

	}

}
