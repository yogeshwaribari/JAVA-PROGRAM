/*Q26.Design a Java program to manage teacher information using a Vector collection and a POJO class Teacher. The program should allow storing teacher details and performing different logical operations on the stored records.
Description
Create a POJO class Teacher with fields:
● int teacherId
● String teacherName
● String subject
● double salary
Store teacher objects inside a Vector<Teacher>.
Operations to Perform
The system must perform the following operations:
1. Add teacher records into Vector
2. Display all teacher details
3. Find teacher with highest salary
4. Search teacher by subject
5. Count teachers whose salary is above 50000
Input Example
Enter number of teachers:
3
Enter teacher details:
1 Suresh Java 55000
2 Mahesh SQL 48000
3 Ramesh Python 62000
Enter subject to search:
Java
Output Example
Teacher List:
1 Suresh Java 55000
2 Mahesh SQL 48000
3 Ramesh Python 62000
Highest Salary Teacher:
3 Ramesh Python 62000
Java Teacher:
Suresh
Teachers with salary above 50000:
2
*/
package Assignment;
import java.util.*;
class Teacher
{
	private int id;
	private String name;
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

	public String getSubj() {
		return subj;
	}

	public void setSubj(String subj) {
		this.subj = subj;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	private String subj;
	private int sal;
	
	Teacher(int id,String name,String subj,int sal)
	{
		this.id=id;
		this.name=name;
		this.subj=subj;
		this.sal=sal;
	}
	
	}
public class Q26Teacher {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println()

	}

}
