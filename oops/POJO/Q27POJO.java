/*Question 27: Write a Java program to implement an Employee Salary Processor using POJO class.
Create a POJO class Employee with variables empId, basicSalary, and bonus.
Using getter and setter methods, calculate:
- Total Salary = basicSalary + bonus
- If salary > 50000 => High Salary
- Otherwise => Normal Salary
Input:
Enter Employee Id : 201
Enter Basic Salary : 40000
Enter Bonus : 15000

Output:
Employee Id : 201
Total Salary : 55000
Category : High Salary

Explanation:
A POJO class Employee has private fields: empId, basicSalary, bonus.
Setter methods store user-entered values. Getter methods retrieve them.
Total Salary = basicSalary + bonus = 40000 + 15000 = 55000.
Condition: if (totalSalary > 50000) => High Salary, else => Normal Salary.
Since 55000 > 50000, Category = High Salary.
This program demonstrates POJO encapsulation combined with business salary logic.*/
import java.util.*;
class Employee{
	private int empId;
	private int basicSalary;
	private int bonus;
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setBasicSalary(int basicSalary)
	{
		this.basicSalary=basicSalary;
	}
	public int getBasicSalary()
	{
		return basicSalary;
	}
	public void setBonus(int bonus)
	{
		this.bonus=bonus;
	}
	public int getBonus()
	{
		return bonus;
	}
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		setEmpId(xyz.nextInt());
		System.out.println("Enter Basic Salary");
		setBasicSalary(xyz.nextInt());
		System.out.println("Enter Bonus");
		setBonus(xyz.nextInt());
	}
	
	void getData()
	{
		
		int total=getBasicSalary()+getBonus();
		System.out.println("Employee Id = "+getEmpId());
		System.out.println("Total Salary = "+total);
		
		if(total>50000)
		{
			System.out.println("Category = High Salary");
		}
		else{
			System.out.println("Category = Normal Salary");
		}
	}
}
class Q27POJO
{
	public static void main(String x[])
	{
		//Scanner xyz=new Scanner(System.in);
		Employee emp=new Employee();
		/*System.out.println("Enter Employee Id");
		emp.setEmpId(xyz.nextInt());
		System.out.println("Enter Basic Salary");
		emp.setBasicSalary(xyz.nextInt());
		System.out.println("Enter Bonus");
		emp.setBonus(xyz.nextInt());
		
		int total=emp.getBasicSalary()+emp.getBonus();
		System.out.println("Employee Id = "+emp.getEmpId());
		System.out.println("Total Salary = "+total);
		
		if(total>50000)
		{
			System.out.println("Category = High Salary");
		}
		else{
			System.out.println("Category = Normal Salary");
		}*/
		emp.putData();
		emp.getData();
		
	}
	
}