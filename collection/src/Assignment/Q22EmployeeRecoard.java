/*Q22.Problem Statement
Create a Java program to manage employee salary details using Vector and POJO class Employee. The program must perform logical operations related to employee salary analysis.
Description
Employee fields:
● int empId
● String name
● double salary
● String department
Store objects in Vector.
Operations
1. Add employees
2. Display employees
3. Find employee with lowest salary
4. Calculate total salary of all employees
5. Display employees of a specific department
Input
Enter number of employees:
3
Enter details:
1 Raj 45000 IT
2 Simran 52000 HR
3 Kunal 39000 IT
Enter department:
IT
Output
Employee List:
1 Raj 45000 IT
2 Simran 52000 HR
3 Kunal 39000 IT
Lowest Salary:
3 Kunal 39000 IT
Total Salary = 136000
IT Department Employees:
Raj
Kunal*/
package Assignment;
import java.util.*;
class EmployeeRec
{
	private int empId;
	private String name;
	private double salary;
	private String dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	EmployeeRec(){
		
	}
	EmployeeRec(int empId,String name,double salary,String dept){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
}
public class Q22EmployeeRecoard {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector <EmployeeRec> v=new Vector <EmployeeRec>();
		System.out.println("Enter number of employees");
		int n=xyz.nextInt();
		do {
			System.out.println("1. Add employees");
			System.out.println("2. Display employees");
			System.out.println("3. Find employee with lowest salary");
			System.out.println("4. Calculate total salary of all employees");
			System.out.println("5. Display employees of a specific department");
			System.out.println("Enter choice");
			int choice=xyz.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter EmpId");
				int empId=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter name");
				String name=xyz.nextLine();
				System.out.println("Enter salary");
				double salary=xyz.nextDouble();
				xyz.nextLine();
				System.out.println("Enter Department");
				String dept=xyz.nextLine();
				EmployeeRec e=new EmployeeRec(empId,name,salary,dept);
				v.add(e);
				System.out.println("Employee added successfully");
				break;
				
			case 2:
				if(v.size()!=0)
				{
					for(EmployeeRec e1:v)
					{
						System.out.println(e1.getEmpId()+"\t"+e1.getName()+"\t"+e1.getSalary()+"\t"+e1.getDept());
						
					}
				}
				else
				{
					System.out.println("Data not present in collection");
				}
				break;
				
			case 3:
				EmployeeRec min=v.get(0);
				System.out.println("Lowest Salary:");
				for(EmployeeRec e2 :v)
				{
					if(e2.getSalary()<min.getSalary())
					{
						min=e2;
					}
				}
				System.out.println(min.getEmpId()+"\t"+min.getName()+"\t"+min.getSalary()+"\t"+min.getDept());
				
				break;
				
			case 4:
				int sum=0;
				for(EmployeeRec e3:v)
				{
					sum+=e3.getSalary();
				}
				System.out.println("Total Salary :"+sum);
				break;
				
				
			case 5:
				xyz.nextLine();
				System.out.println("Enter Department Name");
				String sdept=xyz.nextLine();
				System.out.println(sdept+" Department Employees:");
				for(EmployeeRec e4:v)
				{
					if(e4.getDept().equals(sdept))
					{
						System.out.println(e4.getName());
					}
				}
				break;
				
				default:
					System.out.println("Wrong choice");
			}
			
			}while(true);

	}

}
