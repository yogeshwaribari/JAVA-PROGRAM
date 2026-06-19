/*Question 11: Write a Java program to implement an Employee Bonus System.
Create a class Employee with attributes empId, name, salary, and yearsOfExperience.
Calculate bonus:
- Experience > 10 years => 20% bonus
- Experience 5 to 10 years => 10% bonus
- Experience < 5 years => 5% bonus
Display total salary after bonus.
Input:
Enter Employee Id : 501
Enter Name : Anil
Enter Salary : 40000
Enter Experience : 8

Output:
Employee Id : 501
Name : Anil
Salary : 40000
Bonus : 4000
Total Salary : 44000

Explanation:
A class Employee is created with empId, name, salary, and yearsOfExperience.
Bonus percentage is decided based on experience:
- experience > 10 => 20% bonus
- experience >= 5 && experience <= 10 => 10% bonus
- experience < 5 => 5% bonus
Since experience = 8 (between 5 and 10):
Bonus = 40000 * 10 / 100 = 4000
Total Salary = 40000 + 4000 = 44000
This program demonstrates percentage-based bonus calculation using class objects.*/
import java.util.*;
class EmployeeBonus
{
	int empId;
	String name;
	int salary;
	int yearsOfExperience;
	
	void putdata()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter EmpId");
		empId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter name");
		name=xyz.nextLine();
		System.out.println("Enter salary");
		salary=xyz.nextInt();
		System.out.println("Enter years Of Experience");
		yearsOfExperience=xyz.nextInt();
	}
	void getData(){
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Salary :"+salary);
		int bonus=0;
		if(yearsOfExperience>10)
		{
			bonus=(salary*20)/100;
			
		}
		else if(yearsOfExperience>=5 && yearsOfExperience<=10)
		{
			bonus=(salary*10)/100;
		}
		else{
			bonus=(salary*5)/100;
		}
		int total=salary+bonus;
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+total);
		
		
	}
	public static void main(String x[])
	{
		EmployeeBonus e=new EmployeeBonus();
		e.putdata();
		e.getData();
	}
}