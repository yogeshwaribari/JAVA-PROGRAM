/*Q26.Design a Java program to manage teacher information using a Vector collection and a POJO class Teacher.
 The program should allow storing teacher details and performing different logical operations on the stored records.
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
		System.out.println("Enter number of Teacher");
		int n=xyz.nextInt();
		Vector <Teacher> v= new Vector<>();
		
		do
		{
			System.out.println("1. Add teacher records into Vector");
			System.out.println("2. Display all teacher details");
			System.out.println("3. Find teacher with highest salary");
			System.out.println("4. Search teacher by subject");
			System.out.println("5. Count teachers whose salary is above 50000");
			System.out.println("Enter your choice");
			int c=xyz.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("Enter ID");
				int id=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter Name");
				String name=xyz.nextLine();
				System.out.println("Enter Subject");
				String subj=xyz.nextLine();
				
				System.out.println("Enter Salary");
				int sal=xyz.nextInt();
				Teacher t=new Teacher(id,name,subj,sal);
				v.add(t);
				System.out.println("Added Successfully");
				break;
				
			case 2:
				if(v.size()!=0)
				{
					for(Teacher t1:v)
					{
						System.out.println(t1.getId()+"\t"+t1.getName()+"\t"+t1.getSubj()+"\t"+t1.getSal());
					}
				}
				else
				{
					System.out.println("Teacher Data not present in collection");
				}
				break;
				
			case 3:
				Teacher max=v.get(0);
				for(Teacher t2:v)
				{
					if(t2.getSal()>max.getSal())
					{
						max=t2;
					}
					
				}
				System.out.println("Highest Salary Teacher:");
				System.out.println(max.getId()+"\t"+max.getName()+"\t"+max.getSubj()+"\t"+max.getSal());
				break;
				
			case 4:
				xyz.nextLine();
				System.out.println("Search teacher by subject");
				String sname=xyz.nextLine();
				System.out.println(sname+" Teacher :");
				{
					for(Teacher t3:v)
					{
						if(t3.getSubj().equals(sname))
						{
							System.out.println(t3.getName());
						}
					}
				}
				
				break;
				
			case 5:
				int cnt=0;
				for(Teacher t4:v)
				{
					if(t4.getSal()>50000)
					{
						cnt++;
					}
				}
				System.out.println("Teachers with salary above 50000:"+cnt);
				break;
				
				default:
					System.out.println("Wrong choice");		
			}
		}while(true);

	}

}
