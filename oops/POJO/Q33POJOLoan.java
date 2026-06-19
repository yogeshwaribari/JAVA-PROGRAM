/*Question 33: Write a Java program to implement a Loan Eligibility Checker using POJO class.
Create a POJO class Loan with variables age and salary.
Determine loan eligibility:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Age : 30
Enter Salary : 28000

Output:
Age : 30
Salary : 28000
Loan Status : Eligible

Explanation:
A POJO class Loan has private fields: age and salary.
setAge(30) and setSalary(28000) store user input using setter methods.
Getter methods retrieve age and salary for the eligibility check.
Compound condition: if (age >= 21 && salary >= 25000) => Eligible.
Since age = 30 (>= 21) AND salary = 28000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This is a POJO-based implementation of loan eligibility with compound conditions.
*/
import java.util.*;
class Loan
{
	private int age;
	private int salary;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	void putdata()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Age");
		setAge(xyz.nextInt());
		System.out.println("Enter Salary");
		setSalary(xyz.nextInt());
	}
	void getData()
	{
		System.out.println("Age :"+getAge());
		System.out.println("Salary :"+getSalary());
		if(getAge()>=21 && getSalary()>=25000)
		{
			System.out.println("Loan Status : Eligible");
		}
		else
		{
			System.out.println("Loan Status :Not  Eligible");
		}
	}
}
class Q33POJOLoan
{
	public static void main(String x[])
	{
	Loan l=new Loan();
	l.putdata();
	l.getData();
	}
}