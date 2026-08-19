/*Q5. Create an Employee POJO class with id, name, department, salary, and experience. 
 * Implement CRUD operations using class , object , pojo class. Add a search operation to find employees 
 * based on department and minimum salary.
Explanation: Create an Employee class with private fields, constructors, getters and setters. Maintain employee 
objects inside an ArrayList. Implement:
•
Add Employee
•
Update Employee by ID
•
Delete Employee by ID
•
Display all employees
•
Search employees by department*/
package vectorExam;
import java.util.*;
class EmployeeData
{
	private int id;
	private String name;
	private String dept;
	private int salary;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	private int experience;
	
	EmployeeData(int id,String name,String dept,int salary,int experience)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.experience=experience;
	}
}
public class Question5 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList<EmployeeData> al=new ArrayList<EmployeeData>();
		
		do {
			System.out.println("1. Add Employee Data");
			System.out.println("2. Update Employee by ID");
			System.out.println("3. Delete Employee by ID");
			System.out.println("4. Display all employees");
			System.out.println("5. Search employees by department");
			
			System.out.println("Enter your choice");
			int n=xyz.nextInt();
			EmployeeData e;
			switch(n)
			{
			case 1:
				xyz.nextLine();
				System.out.println("Enter Id");
				int id=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter Emp Name");
				String name=xyz.nextLine();
				System.out.println("Enter Department");
				String dept=xyz.nextLine();
				System.out.println("Enter Salary");
				int salary=xyz.nextInt();
				System.out.println("Enter Experience");
				int exp=xyz.nextInt();
				 e=new EmployeeData(id,name,dept,salary,exp);
				al.add(e);
				break;
				
			case 2: 
				System.out.println("Enter Employee old ID");
				int oid=xyz.nextInt();
				System.out.println("Enter new ID");
				int nid=xyz.nextInt();
				for(EmployeeData e4:al)
				{
					if(e4.getId()==oid)
					{
						//e4.getId()=nid;
						System.out.println(nid+"\t"+e4.getName()+"\t"+e4.getDept()+"\t"+e4.getSalary()+"\t"+e4.getExperience());
					}
				}
				break;
				
			case 3:
			    System.out.println("Enter Delete Id");
			    int delid = xyz.nextInt();

			    Iterator<EmployeeData> itr = al.iterator();

			    while (itr.hasNext()) {
			        EmployeeData e3 = itr.next();

			        if (e3.getId() == delid) {
			            itr.remove();
			            System.out.println("Employee Deleted");
			            break;
			        }
			    }
			    break;
				
			case 4:
				for(EmployeeData e1:al)
				{
					System.out.println(e1.getId()+"\t"+e1.getName()+"\t"+e1.getDept()+"\t"+e1.getSalary()+"\t"+e1.getExperience());
				}
				break;
				
			case 5:
				xyz.nextLine();
				System.out.println("Search Department Name");
				String sName=xyz.nextLine();
				for(EmployeeData e2:al)
				{
					if(e2.getDept().equalsIgnoreCase(sName))
					{
						System.out.println(e2.getId()+"\t"+e2.getName()+"\t"+e2.getDept()+"\t"+e2.getSalary()+"\t"+e2.getExperience());
					}
				}
				break;
			}
			
		}while(true);

	}

}
