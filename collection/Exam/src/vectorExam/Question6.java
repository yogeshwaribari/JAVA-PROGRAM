/*Q6. Create an abstract class Employee with employee details and an abstract method calculateSalary().
 *  Create an interface Bonus with method calculateBonus(). Implement both in PermanentEmployee and 
 *  ContractEmployee.
Explanation:
•
Permanent employees receive a bonus of 15% of salary.
•
Contract employees receive a bonus of 5%.
•
Use constructor to initialize employee information.
•
Calculate salary + bonus.
•
Display employee type, salary, bonus and final amount.
Input:
Permanent Employee:
Name = Rahul
Salary = 60000
Contract Employee:
Name = Amit
Salary = 50000
Output:
Permanent Employee:
Name = Rahul
Salary = 60000
Bonus = 9000
Final Salary = 69000
Contract Employee:
Name = Amit
Salary = 50000
Bonus = 2500
Final Salary = 52500*/
package vectorExam;

import java.util.*;
interface Bonus
{
	void calculateBonus();
}
abstract class  Employee implements Bonus
{
	String name;
	int salary;
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	abstract void calculateSalary();
}
class PermanentEmployee extends Employee
{
	int bonus;
	PermanentEmployee(String name,int salary)
	{
		super(name,salary);
		
	}

	@Override
	public void calculateBonus() {
	 bonus=salary*15/100;
	}

	@Override
	void calculateSalary() {
		int totalsal=salary+bonus;
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+totalsal);
	}
	
}
class ContractEmployee extends Employee
{
	int bonus;
	ContractEmployee(String name,int salary)
	{
		super(name,salary);
		
	}

	@Override
	public void calculateBonus() {
	 bonus=salary*5/100;
	}

	@Override
	void calculateSalary() {
		int totalsal=salary+bonus;
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+totalsal);
	}
	
}
public class Question6 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("1. Permanent Employee");
		System.out.println("2.Contract Employee");
		System.out.println("Enter your choice");
		int n=xyz.nextInt();
		xyz.nextLine();
		Employee e;
		switch(n)
		{
		case 1:
			System.out.println("Enter Employee Name");
			String name=xyz.nextLine();
			System.out.println("Enter Salary");
			int salary=xyz.nextInt();
			e=new PermanentEmployee(name,salary);
			e.calculateBonus();
			e.calculateSalary();
			break;
			
		case 2:
			System.out.println("Enter Employee Name");
			 name=xyz.nextLine();
			System.out.println("Enter Salary");
			 salary=xyz.nextInt();
			e=new ContractEmployee(name,salary);
			e.calculateBonus();
			e.calculateSalary();
			break;
			
			default :
				System.out.println("Wrong choice");
		}

	}

}
