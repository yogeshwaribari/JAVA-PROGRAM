/*Question 13: Write a Java program to implement a Loan Eligibility Checker.
Create a class Loan with attributes name, salary, and age.
Loan conditions:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Name : Kiran
Enter Age : 30
Enter Salary : 27000

Output:
Name : Kiran
Age : 30
Salary : 27000
Loan Status : Eligible

Explanation:
A class Loan is created with name, salary, and age as instance variables.
The user inputs all three values.
Loan eligibility uses a compound AND condition:
- if (age >= 21 && salary >= 25000) => Eligible
- else => Not Eligible
Since age = 30 (>= 21) AND salary = 27000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This program demonstrates the use of logical AND (&&) operator with class objects*/
import java.util.*;
class Loan
{
	String name;
	int age;
	int salary;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Name");
		name=xyz.nextLine();
		System.out.println("Enter age");
		age=xyz.nextInt();
		System.out.println("Enter Salary");
		salary=xyz.nextInt();
	}
	void getData()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		if(age>=21 && salary>=25000)
		{
			System.out.println("Loan Status : Eligible");
			
		}
		else{
			System.out.println("Loan Status : Not Eligible");
		}
	}
	public static void main(String x[])
	{
		Loan l=new Loan();
		l.putData();
		l.getData();
	}
}