/*Q12.Create an Employee POJO class with:
id
name
salary
Store employees in Vector and display employees having salary greater than 25000.
Description
Logical operation:
if(salary > 25000)
Input
1 Raj 20000
2 Simran 30000
3 Ajay 27000
4 Ramesh 18000
Output
Employees with salary above 25000:

2 Simran 30000
3 Ajay 27000*/
package Assignment;
import java.util.*;

class Employee
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private int salary;
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class Q12EmployeeData {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter number of employee");
		int n=xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			String name=xyz.nextLine();
			System.out.println("Enter salary");
			int salary=xyz.nextInt();
			Employee e=new Employee(id,name,salary);
			v.add(e);
		}
		System.out.println("Employees with salary above 25000:");
		for(Object obj:v)
		{
			Employee e=(Employee)obj;
			if(e.getSalary()>25000)
			{
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
			}
		}

	}

}
